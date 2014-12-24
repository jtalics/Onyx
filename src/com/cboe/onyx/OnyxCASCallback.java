package com.cboe.onyx;

/**
 * This class is the CAS Callback simulator
 *
 * @author Keith A. Korecky
 */
/**
 * This class is the CAS event consumer simulator which
 * implements a single listener callback
 * @author Keith A. Korecky
 */

import java.awt.Toolkit;

import com.cboe.domain.util.CurrentMarketContainerImpl;
import com.cboe.domain.util.PriceFactory;
import com.cboe.idl.cmiConstants.StatusUpdateReasonsOperations;
import com.cboe.idl.cmiConstants.VolumeTypesOperations;
import com.cboe.idl.cmiMarketData.CurrentMarketStruct;
import com.cboe.idl.cmiMarketData.RecapStruct;
import com.cboe.idl.cmiOrder.OrderDetailStruct;
import com.cboe.idl.cmiOrder.OrderFilledReportStruct;
import com.cboe.idl.cmiQuote.QuoteBustReportStruct;
import com.cboe.idl.cmiQuote.QuoteDeleteReportStruct;
import com.cboe.idl.cmiQuote.QuoteDetailStruct;
import com.cboe.idl.cmiQuote.QuoteFilledReportStruct;
import com.cboe.interfaces.domain.CurrentMarketProductContainer;
import com.cboe.util.ChannelKey;
import com.cboe.util.ChannelType;
import com.cboe.util.channel.ChannelEvent;
import com.cboe.util.event.EventChannelListener;

public class OnyxCASCallback
   implements  EventChannelListener
{
   private String          debugTag = "";
   private boolean          usePrintStruct = true;

   public OnyxCASCallback()
   {
      this( "DefaultDebugTag" );
   }

   public OnyxCASCallback( String   logTag )
   {
      super();
      this.debugTag = logTag;
      System.out.println( "TestCASCallback::" + debugTag + " constructor" );
   }

   public void channelUpdate( ChannelEvent event )
   {
//      System.out.println( "\n"
//                           + "**************************************************************************\n"
//                           + "**\n"
//                           + "**             TestCASCallback::" + debugTag + " listener::channelUpdate::" + event.getEventData().toString() + "\n"
//                           + "**\n"
//                           + "**************************************************************************\n"
//                           );

//  System.out.print("|" + event.getEventData().getClass().toString() + "|");

//        System.out.println();
//        System.out.print("TestCASCallback::" + debugTag + " listener::channelUpdate::" );
//        ReflectiveStructTester.printStruct(event.getEventData(), event.getEventData().getClass().toString() );
//        System.out.print("TestCASCallback::" + debugTag + " - listener::channelUpdate" + " - Object::" + event.getEventData().getClass().toString() );
//        if ( usePrintStruct )
//        {
//            ReflectiveStructTester.printStruct(event.getEventData(), event.getEventData().getClass().toString() );
//        }

        ChannelKey key = (ChannelKey)event.getChannel();
        switch(key.channelType) {
        	case ChannelType.CB_LOGOUT:
            System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ CAS Generated Logout received " + event.getEventData());
            System.exit(1);
            break;
            case ChannelType.CB_ALL_ORDERS:
            OrderDetailStruct[] orders = (OrderDetailStruct[]) event.getEventData();
            for (int i = 0; i < orders.length; i++) {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Order status change :: " + getStatusReason(orders[i].statusChange) + " :: " + orders[i].statusChange + " Order date = " + orders[i].orderStruct.orderId.orderDate);
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Order number=" + orders[i].orderStruct.orderId.branchSequenceNumber + " :: Orginal=" + orders[i].orderStruct.originalQuantity + " :: Leaves=" + orders[i].orderStruct.leavesQuantity + " ::Traded=" + orders[i].orderStruct.tradedQuantity + " ::Canceled=" + orders[i].orderStruct.cancelledQuantity);
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Order number=" + orders[i].orderStruct.orderId.branchSequenceNumber + " :: Average price=" + PriceFactory.create(orders[i].orderStruct.averagePrice).toDouble() + " :: Session average price=" + PriceFactory.create(orders[i].orderStruct.sessionAveragePrice).toDouble());
            }
            break;
        case ChannelType.CB_QUOTE_FILLED_REPORT:
            QuoteFilledReportStruct quoteFilledReportStruct = (QuoteFilledReportStruct)event.getEventData();
            for (int i = 0; i < quoteFilledReportStruct.filledReport.length; i++) {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Quote FILL :: FillReportType=" + quoteFilledReportStruct.filledReport[i].fillReportType + 
                        " :: quoteKey=" + quoteFilledReportStruct.quoteKey + 
                        " :: price=" + PriceFactory.create(quoteFilledReportStruct.filledReport[i].price).toDouble() +
                        " :: tradedQuantity=" + quoteFilledReportStruct.filledReport[i].tradedQuantity +
                        " :: leavesQuantity=" + quoteFilledReportStruct.filledReport[i].leavesQuantity);
            }
           break;
        case ChannelType.CB_QUOTE_CANCEL_REPORT_V2:
            QuoteDeleteReportStruct[] quoteDeleteStructs = (QuoteDeleteReportStruct[]) event.getEventData();
            for (int i = 0; i < quoteDeleteStructs.length; i++) {
                QuoteDetailStruct quote = quoteDeleteStructs[i].quote;
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Quote status change :: " + getStatusReason(quote.statusChange) + " :: " + quote.statusChange);
            }
            break;
        case ChannelType.CB_QUOTE_BUST_REPORT:
            QuoteBustReportStruct quoteBust = (QuoteBustReportStruct)event.getEventData();
            for (int i = 0; i < quoteBust.bustedReport.length; i++)
            {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Quote status change :: " + getStatusReason(quoteBust.statusChange) + 
                        " :: quoteKey=" + quoteBust.quoteKey +
                        " :: bustReportType=" + quoteBust.bustedReport[i].bustReportType + 
                        " :: price=" + PriceFactory.create(quoteBust.bustedReport[i].price).toDouble() +
                        " :: bustedQuantity=" + quoteBust.bustedReport[i].bustedQuantity);
            }
            break;
        case ChannelType.CB_FILLED_REPORT:
            OrderFilledReportStruct filledReport = (OrderFilledReportStruct) event.getEventData();
            for (int i =0; i<filledReport.filledReport.length; i++) {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Order filled report :: Price: " + PriceFactory.create(filledReport.filledReport[i].price).toDouble() );
            }
            break;
        case ChannelType.CB_ALL_QUOTES: 
            QuoteDetailStruct[] quotes = (QuoteDetailStruct[]) event.getEventData();
            for (int i = 0; i < quotes.length; i++) {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ Quote status change :: " + getStatusReason(quotes[i].statusChange) + " :: " + quotes[i].statusChange);
            }
            break;
        case ChannelType.CB_RECAP_BY_CLASS:
        case ChannelType.CB_RECAP_BY_PRODUCT:
            RecapStruct recap = (RecapStruct) event.getEventData();
            System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ RECAP :: class = " + recap.productKeys.classKey + " product = " + recap.productKeys.productKey + " session = " + recap.sessionName);
            break;
        case ChannelType.CB_CURRENT_MARKET_BY_CLASS:
        case ChannelType.CB_CURRENT_MARKET_BY_PRODUCT:
            CurrentMarketStruct currentMarket = (CurrentMarketStruct) event.getEventData();
            System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ CURRENT MARKET :: class = " + currentMarket.productKeys.classKey + " product = " + currentMarket.productKeys.productKey + " session = " + currentMarket.sessionName);
            break;
        case ChannelType.CB_CURRENT_MARKET_BY_CLASS_V3: 
            CurrentMarketContainerImpl currentMarketContainer = (CurrentMarketContainerImpl) event.getEventData();
            CurrentMarketStruct[] currentMarkets =  currentMarketContainer.getBestMarkets();
            if (currentMarkets != null && currentMarkets.length > 0)
            {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ CURRENT MARKET V3 :: Class = " + currentMarkets[0].productKeys.classKey + " product = " + currentMarkets[0].productKeys.productKey + " session = " + currentMarkets[0].sessionName);
            }
            break;
        case ChannelType.CB_CURRENT_MARKET_BY_PRODUCT_V3:
            CurrentMarketProductContainer  currentMarketProdContainer = (CurrentMarketProductContainer) event.getEventData();
            CurrentMarketStruct currentMarket2 = currentMarketProdContainer.getBestMarket();
            CurrentMarketStruct currentMarketPub = currentMarketProdContainer.getBestPublicMarketAtTop();
            if (currentMarket2 != null)
            {
                System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ CURRENT MARKET V3 :: Class = " + currentMarket2.productKeys.classKey + " product = " + currentMarket2.productKeys.productKey + " session = " + currentMarket2.sessionName);
                if (currentMarketPub != null && currentMarketPub.askSizeSequence != null && currentMarketPub.askSizeSequence.length > 0)
                {
                    for (int i = 0; i < currentMarketPub.askSizeSequence.length; ++i)
                        System.out.println("---- ~~~~ ---- ~~~~ $$$$ CURRENT MARKET V3 :: " + (currentMarketPub.askSizeSequence[i].volumeType == VolumeTypesOperations.CUSTOMER_ORDER ? "public" : (currentMarketPub.askSizeSequence[i].volumeType == VolumeTypesOperations.PROFESSIONAL_ORDER ? "professional" : "?")) + " quantity at top =  " + currentMarketPub.askSizeSequence[i].quantity);
                }
                if (currentMarketPub != null && currentMarketPub.bidSizeSequence != null && currentMarketPub.bidSizeSequence.length > 0)
                {
                    for (int i = 0; i < currentMarketPub.bidSizeSequence.length; ++i)
                        System.out.println("---- ~~~~ ---- ~~~~ $$$$ CURRENT MARKET V3 :: " + (currentMarketPub.bidSizeSequence[i].volumeType == VolumeTypesOperations.CUSTOMER_ORDER ? "public" : (currentMarketPub.bidSizeSequence[i].volumeType == VolumeTypesOperations.PROFESSIONAL_ORDER ? "professional" : "?")) + " quantity at top =  " + currentMarketPub.bidSizeSequence[i].quantity);
                }
            }
            break;
        case ChannelType.CB_HEARTBEAT:
            Toolkit.getDefaultToolkit().beep();  
        	break;
        default:
            System.out.println("$$$$ ~~~~ EVENT ~~~~ $$$$ received " + key.channelType + "::" + event.getEventData());
        }
   }

   private String getStatusReason(short status)
   {
        switch (status) {
            case StatusUpdateReasonsOperations.BOOKED:
                return "BOOKED";
            case StatusUpdateReasonsOperations.CANCEL:
                return "CANCEL";
            case StatusUpdateReasonsOperations.FILL:
                return "FILL";
            case StatusUpdateReasonsOperations.QUERY:
                return "QUERY";
            case StatusUpdateReasonsOperations.UPDATE:
                return "UPDATE";
            case StatusUpdateReasonsOperations.OPEN_OUTCRY:
                return "OPEN_OUTCRY";
            case StatusUpdateReasonsOperations.NEW:
                return "NEW";
            case StatusUpdateReasonsOperations.BUST:
                return "BUST";
            case StatusUpdateReasonsOperations.REINSTATE:
                return "REINSTATE";
            default:
                return "UNKNOWN";
        }
    }

    public boolean setPrintStructOn( boolean    turnOn )
    {
        boolean     lastVal = usePrintStruct;

        usePrintStruct = turnOn;
        return lastVal;
    }

}


