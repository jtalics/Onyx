package com.cboe.onyx.verb;

import org.antlr.runtime.tree.Tree;

import com.cboe.application.shared.UnitTestHelper;
import com.cboe.domain.util.OrderStructBuilder;
import com.cboe.exceptions.DataValidationException;
import com.cboe.idl.cmiConstants.OrderCancelTypes;
import com.cboe.idl.cmiConstants.Sides;
import com.cboe.idl.cmiOrder.CancelRequestStruct;
import com.cboe.idl.cmiOrder.OrderEntryStruct;
import com.cboe.idl.cmiOrder.OrderIdStruct;
import com.cboe.idl.cmiSession.TradingSessionStruct;
import com.cboe.idl.cmiUser.ExchangeFirmStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.interfaces.presentation.product.ProductType;
import com.cboe.interfaces.presentation.product.SessionProduct;
import com.cboe.onyx.Onyx;
import com.cboe.onyx.Util;

public class Cancel extends Verb
{
    
    private MarketMakerAPI mmAPI;
    private TradingSessionStruct currentSession;
    private SessionProduct[] products;
    private OrderIdStruct lastOrderIdStruct = null;

    protected static Cancel self;
    public synchronized static Cancel getInstance() {
        if (self == null) {
            self = new Cancel();
        }
        return self;
    }

    public void parse(Tree node, String[] tokenNames)
    {
        // TODO Auto-generated method stub
    }
    
    private void testCancelOrder(String userId,int sequenceNumber)
    {
        try
        {
            ExchangeFirmStruct firm = new ExchangeFirmStruct("CBOE", "690");
            OrderIdStruct inputOrderId = UnitTestHelper.createOrderIdStruct(firm, "BRA", sequenceNumber, "FRM", "20002209");
            lastOrderIdStruct = inputOrderId;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing Cancel Order");
            CancelRequestStruct cancelRequest = new CancelRequestStruct(inputOrderId, currentSession.sessionName, userId + ":CANCEL", OrderCancelTypes.DESIRED_CANCEL_QUANTITY, 1000);
            mmAPI.acceptOrderCancelRequest(cancelRequest);
            System.out.println("Order canceled");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.out.println("Exception canceling order : " + e.details.message + " " + e.details.error);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void testCancelReplaceOrder(String userId,int sequenceNumber)
    {
        try
        {
            ExchangeFirmStruct firm = new ExchangeFirmStruct("CBOE", "690");
            OrderIdStruct oldOrderId = UnitTestHelper.createOrderIdStruct(firm, "BRA", sequenceNumber, "FRM", "20002209");
            // OrderIdStruct newOrderId = UnitTestHelper.createOrderIdStruct("A","BRA",new
            // Long(System.currentTimeMillis()).intValue(),"FRM","19991130");
            OrderIdStruct newOrderId = UnitTestHelper.createOrderIdStruct(firm, "BRA", Util.getRandomOrderId(), "FRM", "20002209");
            OrderEntryStruct newOrder = UnitTestHelper.createOrderEntryStruct(currentSession.sessionName, products[0].getProductKey(), userId, newOrderId);
            newOrder.side = Sides.BUY;
            newOrder.price.whole = 11;
            newOrder.price.fraction = 0;
            newOrder.contingency.price.fraction = 0;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing acceptOrderCancelReplaceRequest");
            int remainingQuantity = OrderStructBuilder.getRemainingQuantity(mmAPI.getOrderById(oldOrderId).orderStruct);
            mmAPI.acceptOrderCancelReplaceRequest(oldOrderId, remainingQuantity, newOrder);
            System.out.println("Order CancelReplaced");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        catch (DataValidationException e)
        {
            System.out.println("Exception acceptOrderCancelReplaceRequest: " + e.details.message + " " + e.details.error);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Cancels a quote
     * 
     * Pre-conditions: The class variable products[] must have at least one element.
     */
    private void testCancelQuote()
    {
        try
        {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Testing Cancel Quote");
            mmAPI.cancelQuote(currentSession.sessionName, products[0].getProductKey());
            System.out.println("Quote accepted");
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

    public OrderIdStruct getLastOrderIdStruct()
    {
        return lastOrderIdStruct;
    }


}
