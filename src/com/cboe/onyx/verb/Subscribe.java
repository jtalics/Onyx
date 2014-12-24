package com.cboe.onyx.verb;

import org.antlr.runtime.tree.Tree;

import com.cboe.client.util.Product;
import com.cboe.domain.util.PriceFactory;
import com.cboe.idl.cmiSession.TradingSessionStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.interfaces.presentation.marketData.UserMarketDataStruct;
import com.cboe.interfaces.presentation.product.ProductClass;
import com.cboe.interfaces.presentation.product.ProductType;
import com.cboe.interfaces.presentation.product.SessionProduct;
import com.cboe.interfaces.presentation.product.SessionProductClass;
import com.cboe.util.event.EventChannelListener;

public class Subscribe extends Verb
{
    private MarketMakerAPI mmAPI;
    private TradingSessionStruct currentSession;
    private SessionProduct[] sessionProducts;
    protected static Subscribe self;
    public synchronized static Subscribe getInstance() {
        if (self == null) {
            self = new Subscribe();
        }
        return self;
    }

    private void testSubscribeCurrentMarket(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("Testing subscribe current market for class : " + sessionProducts[0].getProductKeysStruct().classKey);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            mmAPI.subscribeCurrentMarketForClass(currentSession.sessionName, sessionProducts[0].getProductKeysStruct().classKey, casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeNBBO(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe NBBO for class : " + sessionProducts[0].getProductKeysStruct().classKey);
            mmAPI.subscribeNBBOForClass(currentSession.sessionName, sessionProducts[0].getProductKeysStruct().classKey, casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeUserMarketData(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe user market data");
            // DMG REMOVE
            if (sessionProducts[0] == null)
            {
                System.out.println("Null products[0]");
            }
            System.out.println("-= session=" + currentSession.sessionName + " classKey=" + sessionProducts[0].getProductKeysStruct().classKey);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            UserMarketDataStruct[] marketData = mmAPI.getUserMarketData(currentSession.sessionName, sessionProducts[0].getProductKeysStruct().classKey, casCallback);
            System.out.println("-=- Market Data returned for " + marketData.length + " products");
            for (int i = 0; i < marketData.length; i++)
            {
                System.out.println("-= Market Data =- session:" + marketData[i].currentMarket.sessionName + " classKey:" + marketData[i].productKeys.classKey + " productKey:" + marketData[i].productKeys.productKey + " current ask:" + !PriceFactory.create(marketData[i].currentMarket.askPrice).isNoPrice() + " current bid:" + !PriceFactory.create(marketData[i].currentMarket.bidPrice).isNoPrice() + " last ask:" + !PriceFactory.create(marketData[i].recap.askPrice).isNoPrice() + " last bid:" + !PriceFactory.create(marketData[i].recap.bidPrice).isNoPrice());
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeUserMarketDataByProduct(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe user market data by product");
            for (SessionProduct product : sessionProducts)
            {
                System.out.println("   -=- subscribing by product::" + product.getProductKey());
                UserMarketDataStruct marketData = mmAPI.getUserMarketDataByProduct(currentSession.sessionName, product.getProductKey(), casCallback);
                System.out.println("   -=- Market Data returned");
                System.out.println("   -=- " + marketData);
                System.out.println("   -=- done.");
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeRFQ(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe RFQ");
            ProductType[] productTypes = mmAPI.getProductTypesForSession("W_AM1");
            for (ProductType productType : productTypes)
            {
                SessionProductClass[] classes = mmAPI.getProductClassesForSession("W_AM1", productType.getType(), casCallback);
                for (SessionProductClass classe : classes)
                {
                    System.out.println("\t Subscribing for RFQ for " + classe.getClassStruct().classSymbol + " : " + classe.getClassStruct().classKey);
                    mmAPI.subscribeRFQForClass(currentSession.sessionName, classe.getClassStruct().classKey, casCallback);
                }
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeUnderlyingRecap(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe underlying recap");
            // int classKey = 393934; //products[0].getProductKeysStruct().classKey;
            int classKey = sessionProducts[0].getProductKeysStruct().classKey;
            ProductClass classStruct = mmAPI.getProductClassByKey(classKey);
            System.out.println("Got classStruct for classKey = " + classKey + " = " + classStruct.getClassSymbol());
            int productKey = classStruct.getUnderlyingProduct().getProductKey();
            System.out.println("Got underlying for classKey = " + classStruct.getClassKey() + " = " + classStruct.getUnderlyingProduct().getProductNameStruct().productSymbol);
            System.out.println("Testing subscribe underlying recap for class " + classStruct.getClassKey() + " underlying product : " + productKey + " in underlying class = " + classStruct.getUnderlyingProduct().getProductKeysStruct().classKey);
            mmAPI.subscribeRecapForProduct("W_U1", productKey, casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeUnderlyingTicker(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe underlying ticker");
            int classKey = sessionProducts[0].getProductKeysStruct().classKey;
            ProductClass classStruct = mmAPI.getProductClassByKey(classKey);
            int productKey = classStruct.getUnderlyingProduct().getProductKey();
            System.out.println("Testing subscribe underlying ticker for class " + classStruct.getClassKey() + " underlying product : " + productKey);
            mmAPI.subscribeTicker(currentSession.sessionName, productKey, casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeRecap(EventChannelListener casCallback)
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe recap");
            System.out.println("Testing subscribe recap for class : " + sessionProducts[0].getProductKeysStruct().classKey + " and session " + currentSession.sessionName);
            mmAPI.subscribeRecapForClass(currentSession.sessionName, sessionProducts[0].getProductKeysStruct().classKey, casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeOrders(String firm, EventChannelListener casCallback)
    {
        try
        {
            // if ( firm == null )
            // {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe orders");
            mmAPI.getAllOrders(casCallback);
            mmAPI.subscribeOrders(casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // }
            // else
            // {
            // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // System.out.println("Testing subscribe orders for firm::" + firm);
            // mmAPI.getAllOrders(casCallback);
            // mmAPI.subscribeOrdersByFirm(casCallback);
            // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testSubscribeQuotes(String firm, EventChannelListener casCallback)
    {
        try
        {
            // if ( firm == null )
            // {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing subscribe quotes");
            mmAPI.subscribeQuoteBustReportV2(casCallback);
            mmAPI.subscribeQuoteFilledReportV2(casCallback);
            mmAPI.subscribeQuoteDeletedReportV2(casCallback);
            mmAPI.getAllQuotes(casCallback);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // }
            // else
            // {
            // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // System.out.println("Testing subscribe quotes for firm::" + firm);
            // mmAPI.subscribeQuoteFilledReportForFirm(casCallback);
            // mmAPI.subscribeQuoteBustReportForFirm(casCallback);
            // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            // }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
