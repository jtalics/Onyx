package com.cboe.onyx.verb;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cboe.application.shared.UnitTestHelper;
import com.cboe.domain.util.PriceFactory;
import com.cboe.domain.util.StructBuilder;
import com.cboe.exceptions.AlreadyExistsException;
import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.CommunicationException;
import com.cboe.exceptions.DataValidationException;
import com.cboe.exceptions.NotAcceptedException;
import com.cboe.exceptions.NotFoundException;
import com.cboe.exceptions.SystemException;
import com.cboe.exceptions.TransactionFailedException;
import com.cboe.idl.cmiConstants.ContingencyTypes;
import com.cboe.idl.cmiConstants.OrderOrigins;
import com.cboe.idl.cmiConstants.PriceTypes;
import com.cboe.idl.cmiConstants.Sides;
import com.cboe.idl.cmiOrder.OrderContingencyStruct;
import com.cboe.idl.cmiOrder.OrderEntryStruct;
import com.cboe.idl.cmiOrder.OrderIdStruct;
import com.cboe.idl.cmiQuote.QuoteEntryStruct;
import com.cboe.idl.cmiSession.TradingSessionStruct;
import com.cboe.idl.cmiStrategy.StrategyRequestStruct;
import com.cboe.idl.cmiTraderActivity.ActivityFieldStruct;
import com.cboe.idl.cmiTraderActivity.ActivityHistoryStruct;
import com.cboe.idl.cmiTraderActivity.ActivityRecordStruct;
import com.cboe.idl.cmiUser.ExchangeFirmStruct;
import com.cboe.idl.cmiUtil.DateStruct;
import com.cboe.idl.cmiUtil.DateTimeStruct;
import com.cboe.idl.cmiUtil.PriceStruct;
import com.cboe.idl.cmiUtil.TimeStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.interfaces.presentation.product.SessionProduct;
import com.cboe.interfaces.presentation.product.SessionStrategy;
import com.cboe.onyx.Util;

public class Accept extends Verb
{
    private MarketMakerAPI mmAPI;

    private TradingSessionStruct currentSession;
    private SessionProduct[] products;
    private String sessionName;

    private OrderIdStruct  order;
    protected static Accept self;
    public synchronized static Accept getInstance() {
        if (self == null) {
            self = new Accept();
        }
        return self;
    }
    
    public OrderIdStruct acceptOrder(int productKey, String userId,int sequenceNumber, int quantity, double price, char side)
    {
        order = null;
        // OrderIdStruct inputOrderId =
        // UnitTestHelper.createOrderIdStruct("690","BRA",sequenceNumber,"FRM","19991130");
        String exchange = "CBOE";
        String firm = "355";
        ExchangeFirmStruct exchangeFirmStruct = new ExchangeFirmStruct(exchange, firm);
        String branch= "BRA";
        String correspondentFirm = "JOE";
        String nDate = getToday();
        OrderIdStruct orderId = new OrderIdStruct (exchangeFirmStruct, branch, sequenceNumber, correspondentFirm, nDate, 0, 0);
        //lastOrderIdStruct = orderId;
        OrderEntryStruct orderEntry = /*UnitTestHelper.*/createOrderEntryStruct(currentSession.sessionName, productKey, userId, orderId);
        orderEntry.side = side;
        orderEntry.price = PriceFactory.create(price).toStruct();
        orderEntry.originalQuantity = quantity;
        orderEntry.contingency.price = PriceFactory.create(0).toStruct();
        System.out.println("Testing Accept Order");
        System.out.println("-= Order.originalQuantity = " + orderEntry.originalQuantity);
        System.out.println("-= Order.side = " + orderEntry.side + " (Buy = " + Sides.BUY + "; Sell = " + Sides.SELL + ")");
        System.out.println("-= Order.price.type = " + orderEntry.price.type);
        System.out.println("-= Order.price.whole = " + orderEntry.price.whole);
        System.out.println("-= Order.price.fraction = " + orderEntry.price.fraction);
        System.out.println("-= Order.contingency.type = " + orderEntry.contingency.type);
        System.out.println("-= Order.orderOrginType = " + orderEntry.orderOriginType + " ( Broker = " + OrderOrigins.BROKER_DEALER + ";Customer = " + OrderOrigins.CUSTOMER + ";Customer Broker = " + OrderOrigins.CUSTOMER_BROKER_DEALER + ";Firm = " + OrderOrigins.FIRM + ";Market Maker = " + OrderOrigins.MARKET_MAKER + ")");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        try
        {
            order = mmAPI.acceptOrder(orderEntry);
        }
        catch (DataValidationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception adding order : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (SystemException e)
        {
            e.printStackTrace();
        }
        catch (CommunicationException e)
        {
            e.printStackTrace();
        }
        catch (AuthorizationException e)
        {
            e.printStackTrace();
        }
        catch (NotAcceptedException e)
        {
            System.out.println("Exception accepting order: " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (TransactionFailedException e)
        {
            e.printStackTrace();
        }
        catch (AlreadyExistsException e)
        {
            e.printStackTrace();
        }

        if (order == null)
        {
            System.out.println("Order not accepted");
            try
            {
                ActivityHistoryStruct orderHistory=mmAPI.queryOrderHistory(orderId);
                for (ActivityRecordStruct rec : orderHistory.activityRecords) {
                    for (ActivityFieldStruct field : rec.activityFields) {
                        System.out.print (field.fieldValue + " | ");
                    }
                    System.out.println();
                }
            }
            catch (DataValidationException e)
            {
                System.err.println("Exception query order history: " + e.details.message + " " + e.details.error);
                e.printStackTrace();
            }
            catch (SystemException e)
            {
                e.printStackTrace();
            }
            catch (CommunicationException e)
            {
                e.printStackTrace();
            }
            catch (AuthorizationException e)
            {
                e.printStackTrace();
            }
            catch (NotFoundException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Order accepted");
            System.out.println("OrderIdStruct.date = " + order.orderDate);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return order;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat();
    
    private String getToday()
    {
        sdf.applyPattern("yyyyMMdd");
        return sdf.format(new Date());
    }

    public void acceptQuote(int productKey, int quantity, double bid, double ask)
    {
        try
        {
            QuoteEntryStruct quote = UnitTestHelper.CreateNewQuoteEntryStruct(currentSession.sessionName, productKey, quantity, quantity);
            System.out.println("Testing Accept Quote");
            quote.bidPrice = PriceFactory.create(bid).toStruct();
            quote.askPrice = PriceFactory.create(ask).toStruct();
            quote.askQuantity = quote.bidQuantity = quantity;
            System.out.println("-= Quote for product = " + products[0].getProductKey());
            System.out.println("-= Quote.askPrice.type = " + quote.askPrice.type);
            System.out.println("-= Quote.askPrice.whole = " + quote.askPrice.whole);
            System.out.println("-= Quote.askPrice.fraction = " + quote.askPrice.fraction);
            System.out.println("-= Quote.bidPrice.type = " + quote.bidPrice.type);
            System.out.println("-= Quote.bidPrice.whole = " + quote.bidPrice.whole);
            System.out.println("-= Quote.bidPrice.fraction = " + quote.bidPrice.fraction);
            System.out.println("-= Quote.askQuantity = " + quote.askQuantity);
            System.out.println("-= Quote.bidQuantity = " + quote.bidQuantity);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            mmAPI.acceptQuote(quote);
            System.out.println("Quote accepted");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.out.println("Exception adding quote : " + e.details.message + " " + e.details.error);
        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
        catch (SystemException e)
        {
            e.printStackTrace();
        }
        catch (CommunicationException e)
        {
            e.printStackTrace();
        }
        catch (AuthorizationException e)
        {
            e.printStackTrace();
        }
        catch (NotAcceptedException e)
        {
            System.out.println("Exception adding quote : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public SessionStrategy acceptSessionStrategy(StrategyRequestStruct strategyRequestStruct)
    {
        //sessionName = "W_MAIN";
        SessionStrategy sessionStrategy = null;
        try
        {
            sessionStrategy = mmAPI.acceptSessionStrategy(sessionName, strategyRequestStruct);
        }
        catch (DataValidationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception Accepting Strategy : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (AuthorizationException e)
        {
            System.err.println(e.getMessage());
            System.err.println("Exception Accepting Strategyr : " + e.details.message + " " + e.details.error);
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("SessionStrategy returned: " + sessionStrategy.toString());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        return sessionStrategy;
    }

    /* Set up some constants for filling in quantities in orders */
    private static final int ORIGINAL_QUANTITY = 50;
    private static final char ORIGINATOR = OrderOrigins.CUSTOMER;
    private static final char TIME_IN_FORCE = 'G';
    private static final String OPTIONAL_DATA = "This is optional data";
    private static final short CONTINGENCY_TYPE = ContingencyTypes.NONE;
    private static final PriceStruct CONTINGENCY_PRICE = new PriceStruct( (short)PriceTypes.VALUED,1,0 );
    private static final int CONTINGENCY_VOLUME = 2;
    private static final PriceStruct PRICE_STRUCT = new PriceStruct( PriceTypes.VALUED, 10, 0 );

    public static OrderEntryStruct createOrderEntryStruct( String sessionName, int productKey, String userId, OrderIdStruct orderId  ) {

        java.util.Calendar cal = java.util.Calendar.getInstance();
        TimeStruct timeStruct = new TimeStruct((byte)cal.get(cal.HOUR_OF_DAY), (byte)cal.get(cal.MINUTE), (byte)cal.get(cal.SECOND), (byte)cal.get(cal.MILLISECOND));
        DateStruct dateStruct = new DateStruct((byte)cal.get(cal.MONTH), (byte)cal.get(cal.DAY_OF_MONTH) , (short)cal.get(cal.YEAR));
        
        OrderEntryStruct aStruct = new OrderEntryStruct();
        aStruct.account = userId;
        aStruct.branch = orderId.branch;
        aStruct.branchSequenceNumber = orderId.branchSequenceNumber;
        aStruct.correspondentFirm = orderId.correspondentFirm;
        aStruct.cmta = StructBuilder.buildExchangeFirmStruct("","");
        aStruct.originator = StructBuilder.buildExchangeAcronymStruct("","");
        aStruct.contingency = new OrderContingencyStruct();
        aStruct.contingency.type = CONTINGENCY_TYPE;
        aStruct.contingency.price = CONTINGENCY_PRICE;
        aStruct.contingency.volume = CONTINGENCY_VOLUME;
        aStruct.extensions ="extensions";
        aStruct.coverage = 'B';
        aStruct.orderNBBOProtectionType = 1;
        aStruct.cross = false;
        aStruct.expireTime = new DateTimeStruct(dateStruct, timeStruct);
        aStruct.executingOrGiveUpFirm = orderId.executingOrGiveUpFirm;
        aStruct.optionalData = OPTIONAL_DATA;
        aStruct.originalQuantity = ORIGINAL_QUANTITY;
        aStruct.orderOriginType = ORIGINATOR;
        aStruct.positionEffect = 'N';
        aStruct.price = PRICE_STRUCT;
        aStruct.productKey = productKey;
        aStruct.side = Sides.BUY;
        aStruct.subaccount = "GHIJLM";
        aStruct.timeInForce = TIME_IN_FORCE;
        aStruct.userAssignedId = "";
        aStruct.orderDate = orderId.orderDate;

         if ( 0 == (Util.positiveRandomInt() % 2 ) ) {
            aStruct.side = 'S';
         }
         else {
            aStruct.side = 'B';
         }

         aStruct.sessionNames = new String[ 1 ];
         aStruct.sessionNames[0] = sessionName;

         return aStruct;
    }//createOrderEntryStruct

    
    public static QuoteEntryStruct CreateNewQuoteEntryStruct(String sessionName, int productKey, int askSideQuantity, int bidSideQuantity )
    {
        QuoteEntryStruct quoteEntry = new QuoteEntryStruct();

        quoteEntry.userAssignedId = "";

        quoteEntry.productKey = productKey;
        quoteEntry.askQuantity = askSideQuantity;
        quoteEntry.bidQuantity = bidSideQuantity;

        int price = 6;

        quoteEntry.askPrice = new PriceStruct( PriceTypes.VALUED, price + 1, 0 );
        quoteEntry.bidPrice = new PriceStruct( PriceTypes.VALUED, price, 0 );
        quoteEntry.sessionName = sessionName;

        return quoteEntry;
    }

    public TradingSessionStruct getCurrentSession()
    {
        return currentSession;
    }

    public void setCurrentSession(TradingSessionStruct currentSession)
    {
        this.currentSession = currentSession;
    }

    public MarketMakerAPI getMmAPI()
    {
        return mmAPI;
    }

    public void setMmAPI(MarketMakerAPI mmAPI)
    {
        this.mmAPI = mmAPI;
    }
}
