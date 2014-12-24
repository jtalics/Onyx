package com.cboe.onyx.verb;

import java.util.Arrays;
import java.util.Comparator;

import org.antlr.runtime.tree.Tree;

import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.CommunicationException;
import com.cboe.exceptions.DataValidationException;
import com.cboe.exceptions.NotFoundException;
import com.cboe.exceptions.SystemException;
import com.cboe.idl.cmiConstants.ProductTypesOperations;
import com.cboe.idl.cmiProduct.ProductNameStruct;
import com.cboe.idl.cmiSession.SessionClassStruct;
import com.cboe.idl.cmiSession.SessionProductStruct;
import com.cboe.idl.cmiSession.TradingSessionStruct;
import com.cboe.idl.cmiTraderActivity.ActivityHistoryStruct;
import com.cboe.idl.cmiUser.PreferenceStruct;
import com.cboe.idl.cmiUtil.DateTimeStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.interfaces.presentation.bookDepth.BookDepth;
import com.cboe.interfaces.presentation.marketData.UserMarketDataStruct;
import com.cboe.interfaces.presentation.product.Product;
import com.cboe.interfaces.presentation.product.ProductClass;
import com.cboe.interfaces.presentation.product.ProductType;
import com.cboe.interfaces.presentation.product.SessionProduct;
import com.cboe.interfaces.presentation.product.SessionProductClass;
import com.cboe.interfaces.presentation.product.SessionStrategy;
import com.cboe.util.event.EventChannelListener;

public class Get extends Verb
{
    
    private MarketMakerAPI mmAPI;
    private TradingSessionStruct currentSession;
    private ProductType[] productTypes;
    private SessionProduct[] sessionProducts;
    private TradingSessionStruct[] sessions;
    private EventChannelListener casCallback;
    private ProductClass productClass;
    protected static Get self;
    public synchronized static Get getInstance() {
        if (self == null) {
            self = new Get();
        }
        return self;
    }

    private void testGetAllUserPreferences()
    {
        PreferenceStruct[] userPreferences = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing getAllUserPreferences");
        try
        {
            userPreferences = mmAPI.getAllUserPreferences();
            // DMG 20001215
            if (userPreferences == null)
            {
                System.out.println("RemoteTestClient.testGetAllUserPreferences() - userPreferences are null");
                System.exit(1);
            }
            System.out.println("\t user preference length=" + userPreferences.length);
            for (int i = 0; i < userPreferences.length; i++)
            {
                System.out.println("\t user preference::" + i + "  name=" + userPreferences[i].name);
            }
            UserMarketDataStruct userMarketData = mmAPI.getUserMarketDataByProduct(currentSession.sessionName, sessionProducts[0].getProductKey(), null);
            // DMG 20001215
            if (userMarketData == null)
            {
                System.out.println("RemoteTestClient.testGetAllUserPreferences() - userMarketData are null");
                System.exit(1);
            }
            System.out.println("user market data::" + userMarketData.productKeys.productKey + ":" + userMarketData.productKeys.classKey);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetClassByKeyForSession(int classKey)
    {
        SessionProductClass sessionProductClass = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetClassByKeyForSession( classKey=" + classKey + ')');
        try
        {
            sessionProductClass = mmAPI.getClassByKeyForSession("W_AM1", classKey);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (sessionProductClass == null)
        {
            System.out.println("No session product class found");
        }
        else
        {
            System.out.println("Session Product Class retrieved:");
            SessionClassStruct classStruct = sessionProductClass.getSessionClassStruct();
            System.out.println("\t session Name:" + classStruct.sessionName);
            System.out.println("\t underlying session name:" + classStruct.underlyingSessionName);
            System.out.println("\t class state:" + classStruct.classState);
            System.out.println("\t sequence Number:" + classStruct.classStateTransactionSequenceNumber);
            System.out.println("\t class symbol:" + classStruct.classStruct.classSymbol);
            System.out.println("\t Primary Exchange:" + classStruct.classStruct.primaryExchange);
            System.out.println("\t eligible sessions:" + classStruct.eligibleSessions.toString());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetClassBySymbolForSession(short productType, String className)
    {
        SessionProductClass sessionProductClass = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetClassBySymbolForSession( productType=" + productType + " ,className=" + className + ')');
        try
        {
            sessionProductClass = mmAPI.getClassBySymbolForSession("W_AM1", productType, className);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (sessionProductClass == null)
        {
            System.out.println("No Session Product Class found");
        }
        else
        {
            System.out.println("The SessionProductClass found was:");
            SessionClassStruct classStruct = sessionProductClass.getSessionClassStruct();
            System.out.println("\t session Name:" + classStruct.sessionName);
            System.out.println("\t underlying session name:" + classStruct.underlyingSessionName);
            System.out.println("\t class state:" + classStruct.classState);
            System.out.println("\t sequence Number:" + classStruct.classStateTransactionSequenceNumber);
            System.out.println("\t class struct:" + classStruct.classStruct.toString());
            System.out.println("\t eligible sessions:" + classStruct.eligibleSessions.toString());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetProductByKeyForSession(int productKey)
    {
        SessionProduct sessionProduct = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetProductByKeyForSession( productKey=" + productKey + ')');
        try
        {
            sessionProduct = mmAPI.getProductByKeyForSession("W_AM1", productKey);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (sessionProduct == null)
        {
            System.out.println("No Session Product found");
        }
        else
        {
            System.out.println("The Session Product found was:");
            SessionProductStruct productStruct = sessionProduct.getSessionProductStruct();
            System.out.println("\t product state:" + productStruct.productState);
            System.out.println("\t sequence number:" + productStruct.productStateTransactionSequenceNumber);
            System.out.println("\t product struct:" + productStruct.productStruct.toString());
            System.out.println("\t session name:" + productStruct.sessionName);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetProductByNameForSession(ProductNameStruct productName)
    {
        SessionProduct sessionProduct = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetProductByNameForSession");
        System.out.println("\t\t product name::product symbol :" + productName.productSymbol);
        System.out.println("\t\t product name::option type    :" + productName.optionType);
        System.out.println("\t\t product name::exercise price :" + productName.exercisePrice.type + ", " + productName.exercisePrice.whole + ", " + productName.exercisePrice.fraction);
        System.out.println("\t\t product name::expiration date:" + productName.expirationDate.month + '/' + productName.expirationDate.day + '/' + productName.expirationDate.year);
        try
        {
            sessionProduct = mmAPI.getProductByNameForSession("W_AM1", productName);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (sessionProduct == null)
        {
            System.out.println("No Product found");
        }
        else
        {
            System.out.println("The Product found was:");
            SessionProductStruct productStruct = sessionProduct.getSessionProductStruct();
            System.out.println("\t product state  :" + productStruct.productState);
            System.out.println("\t sequence number:" + productStruct.productStateTransactionSequenceNumber);
            System.out.println("\t product struct :" + productStruct.productStruct.toString());
            System.out.println("\t session name   :" + productStruct.sessionName);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetStrategyByKeyForSession(int productKey)
    {
        SessionStrategy sessionStrategy = null;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetStrategyByKeyForSession( productKey=" + productKey + ')');
        try
        {
            sessionStrategy = mmAPI.getStrategyByKeyForSession("W_AM1", productKey);
            if (sessionStrategy == null)
            {
                System.out.println("No Strategy found");
            }
            else
            {
                System.out.println("The Strategy found was:");
                System.out.println("\t session      :" + "W_AM1");
                System.out.println("\t productKey   :" + productKey);
                System.out.println("\t session name :" + sessionStrategy.getTradingSessionName());
                System.out.println("\t product      :" + sessionStrategy.getProductStruct());
                System.out.println("\t strategy legs:" + sessionStrategy.getStrategyLegs().toString());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetOrderBook()
    {
        try
        {
            System.out.println("Testing Get Book Depth for Product " + sessionProducts[0].getProductKey());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            BookDepth bookDepth = mmAPI.getCmiBookDepth(sessionProducts[0]);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-= Buy Side -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            for (int i = 0; i < bookDepth.getBuySide().length; i++)
            {
                System.out.println("Price : " + bookDepth.getBuySide()[i].getPrice().getWhole() + " : " + bookDepth.getBuySide()[i].getPrice().getFraction() + " -- Indicators : " + ((bookDepth.isAllPricesIncluded()) ? "true" : "false") + bookDepth.getTransactionSequenceNumber());
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-= Sell Side =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            for (int i = 0; i < bookDepth.getSellSide().length; i++)
            {
                System.out.println("Price : " + bookDepth.getSellSide()[i].getPrice().getWhole() + " : " + bookDepth.getSellSide()[i].getPrice().getFraction() + " -- Indicators : " + ((bookDepth.isAllPricesIncluded()) ? "true" : "false") + bookDepth.getTransactionSequenceNumber());
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.out.println("Exception adding quote : " + e.details.message + " " + e.details.error);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ProductClass getProductClassForSymbol(String symbol, short type) {
        ProductClass productClass=null;
        try
        {
            productClass = mmAPI.getClassBySymbol(type, symbol);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return productClass;
    }
    
    public SessionProduct[] getProductsForSessionWithSymbolOfType(String symbol, short productType) {

        productClass = getProductClassForSymbol(symbol, productType);
        System.out.println("\t...calling getProductsForSession( session=" + currentSession.sessionName + " , classKey=" + productClass.getClassKey());
        try
        {
            sessionProducts = mmAPI.getProductsForSession(currentSession.sessionName, productClass.getClassKey(), casCallback);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("\t...got " + sessionProducts.length + " products for session=" + currentSession.sessionName + ", ClassKey=" + productClass.getClassKey());
        return sessionProducts;
    }
    
    public SessionProduct[]  getProductClassesForSession(short productType)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing Get Products");
        try
        {
            System.out.println("\t...calling getProductClassesForSession( session=" + currentSession.sessionName + " , productType=" + ProductTypesOperations.OPTION);
            SessionProductClass[] classes = mmAPI.getProductClassesForSession(currentSession.sessionName, productType, casCallback);
            Arrays.sort(classes, new Comparator<SessionProductClass>() {

                @Override
                public int compare(SessionProductClass o1, SessionProductClass o2)
                {
                    return o1.getClassSymbol().compareTo(o2.getClassSymbol());
                }});
            System.out.println("\t...got " + classes.length + " classes");
            for (SessionProductClass classe : classes)
            {
                System.out.println("\t - Class " + classe.getClassSymbol() + " " + classe.getClassKey());
                // ReflectiveStructTester.printStruct(classStructs[i],"ClassStruct");
            }
        }
        catch (DataValidationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception adding order : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return sessionProducts;
    }

    /**
     * Gets product Strategies
     * 
     * Pre-conditions: The class variable products[] must have at least one element.
     */
    private void testGetProductStrategies()
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing Get Product Strategies");
        SessionStrategy[] containers = null;
        try
        {
            containers = mmAPI.getStrategiesByComponent(currentSession.sessionName, sessionProducts[0].getProductKey());
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        if (containers == null)
        {
            System.out.println("No Product Strategies found");
        }
        else
        {
            System.out.println("Got " + containers.length + " strategies back for component leg " + sessionProducts[0].getProductKey());
            for (SessionStrategy container : containers)
            {
                System.out.println(" -- strategy = " + container.getProductKey());
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testSessionlessProduct()
    {
        try
        {
            ProductClass[] classes;
            ProductType[] types = mmAPI.getAllProductTypes();
            for (ProductType type : types)
            {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Classes count for type = " + type.getDescription() + " (" + type.getType() + ") = " + types.length);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                classes = mmAPI.getAllClassesForType(type.getType());
                for (ProductClass classe : classes)
                {
                    // System.out.println("-=- Products for class " + classe.getClassSymbol() +
                    // " : " + classe.getClassKey());
                    // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    Product[] products2;
                    products2 = mmAPI.getAllProductsForClass(classe.getClassKey(), false);
                    // System.out.println("\tProduct count for class "+classe.getClassSymbol()+" = "
                    // +products2.length);
                    // for (Product product : products)
                    // {
                    // System.out.println("-=-=- Product  " + product.getDescription() + " : " +
                    // product.getProductKey());
                    // }
                    // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                }
                // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    public ProductType[] getProductTypes()
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Getting product types:");
        try
        {
            String s = currentSession.sessionName;
            productTypes = mmAPI.getProductTypesForSession(s);
            for (ProductType productType : productTypes)
            {
                System.out.println("\t - " + productType.getDescription());
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        ;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return productTypes;
    }

    public TradingSessionStruct[] getSessions(EventChannelListener casCallback)
    {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("EXECUTING Getting sessions:");
        try
        {
            sessions = mmAPI.getCurrentTradingSessions(casCallback);
            System.out.println("\t Got " + sessions.length + " sessions");
            for (int i = 0; i < sessions.length; i++)
            {
                System.out.println("\t Session - " + i + " : Name = " + sessions[i].sessionName);
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        ;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return sessions;
    }

    /**
     * Gets a quote
     * 
     * Pre-conditions: The class variable products[] must have at least one element.
     */
    private void testGetQuote()
    {
        try
        {
            System.out.println("Testing Get Quote");
            mmAPI.getQuote(currentSession.sessionName, sessionProducts[0].getProductKey());
            System.out.println("Quote fetched");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.out.println("Exception getting quote : " + e.details.message + " " + e.details.error);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testGetTraderClassActivityByTime(int classKey, DateTimeStruct startTime, short direction)
    {
        ActivityHistoryStruct activityHistory;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing GetTraderClassActivityByTime");
        try
        {
            activityHistory = mmAPI.getTraderClassActivityByTime(currentSession.sessionName, classKey, startTime, direction);
            for (int i = 0; i < activityHistory.activityRecords.length; i++)
            {
                for (int j = 0; j < activityHistory.activityRecords[i].activityFields.length; j++)
                {
                    System.out.println("activityHistory.activityRecord[" + i + "].activityField[" + j + "]::" + " name::" + activityHistory.activityRecords[i].activityFields[j].fieldName + " value::" + activityHistory.activityRecords[i].activityFields[j].fieldValue);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    private void testGetTraderProductActivityByTime(int productKey, DateTimeStruct startTime, short direction)
    {
        ActivityHistoryStruct activityHistory;
        System.out.println("Testing GetTraderProductActivityByTime");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        try
        {
            activityHistory = mmAPI.getTraderProductActivityByTime(currentSession.sessionName, productKey, startTime, direction);
            for (int i = 0; i < activityHistory.activityRecords.length; i++)
            {
                for (int j = 0; j < activityHistory.activityRecords[i].activityFields.length; j++)
                {
                    System.out.println("activityHistory.activityRecord[" + i + "].activityField[" + j + "]::" + " name::" + activityHistory.activityRecords[i].activityFields[j].fieldName + " value::" + activityHistory.activityRecords[i].activityFields[j].fieldValue);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public TradingSessionStruct getCurrentSession()
    {
        return currentSession;
    }

    public TradingSessionStruct[] getSessions()
    {
        return sessions;
    }

    public void setMmAPI(MarketMakerAPI mmAPI)
    {
        this.mmAPI = mmAPI;
    }


    public MarketMakerAPI getMmAPI()
    {
        return mmAPI;
    }


    public void setCurrentSession(TradingSessionStruct currentSession)
    {
        this.currentSession = currentSession;
    }

    public void setSessions(TradingSessionStruct[] sessions)
    {
        this.sessions = sessions;
    }

    public void setCasCallback(EventChannelListener casCallback)
    {
        this.casCallback = casCallback;
    }

    public ProductClass getProductClass()
    {
        return productClass;
    }

    public void setProductClass(ProductClass productClass)
    {
        this.productClass = productClass;
    }

    public SessionProduct[] getSessionProducts()
    {
        return sessionProducts;
    }



}
