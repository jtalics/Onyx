package com.cboe.onyx;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.cboe.TimeService.timeServ.IllegalArgumentException;
import com.cboe.application.shared.RemoteConnection;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;

public class Onyx
{
    private static RemoteConnection connection;
    private static OnyxCASCallback casCallback;
    private static MarketMakerAPI mmAPI;


//    private static void initConnection(String[] args)
//    {
//        if (connection == null)
//        {
//            connection = RemoteConnectionFactory.create(args);
//            System.out.println("Connection established " + connection);
//        }
//    }

    // private static void testException()
    // {
    // try
    // {
    // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    // System.out.println("Testing DataValidationException Marshalling");
    // // session.getProductQuery().getProductNameStruct(-32000);
    // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    // }
    // catch (Exception e)
    // {
    // e.printStackTrace();
    // }
    // }
    private static String[] tokenNames;

    private static void testSeq1(String[] args) throws Exception
    {
        boolean printStructOn = false;
        int OrderId;
        MockHomeBuilder.initialize();
        // HomeBuilder.initialize();
        //initConnection(args);
        System.out.println("Connecting to CAS");
        // EventChannelAdapter eventChannel = EventChannelAdapterFactory.find();
        System.out.println("Getting a session");
        // initUserSession("JTMM","JTMM");
        //printStructOn = casCallback.setPrintStructOn(false);
        //System.out.flush();
        // testSessionlessProduct();
        // testGetSessions(casCallback);
        // currentSession = sessions[7];
        // testGetProductTypes();
        // testGetProducts(symbol, casCallback);
        // for (int i = 0; i < 100; i++)
        // {
        // testAcceptSessionStrategy(makeRandomStrategy());
        // try
        // {
        // Thread.sleep(5000);
        // }
        // catch (InterruptedException e)
        // {
        // // nop
        // }
        // }
        // testGetProductStrategies();
        // err testGetAllUserPreferences();
        // err testSubscribeUserMarketData();
        // err testSubscribeUserMarketDataByProduct();
        // ok testSubscribeCurrentMarket();
        // ok testSubscribeRecap();
        // err testSubscribeUnderlyingRecap();
        // ok testSubscribeUnderlyingTicker();
        // ok testSubscribeOrders( firmKey );
        // ok testSubscribeQuotes( firmKey );
        // ok try
        // {
        // mmAPI.subscribeOrderFilledReport(casCallback);
        // }
        // catch( Exception e )
        // {
        // e.printStackTrace();
        // }
        //
        // OrderId = getRandomOrderId();
        // testAcceptOrder(OrderId, 50, 16.0, Sides.BUY );
        // ok OrderId = getRandomOrderId();
        // testAcceptOrder(OrderId, 50, 17.0, Sides.BUY );
        //
        // OrderId = getRandomOrderId();
        // testAcceptOrder(OrderId, 50, 18.0, Sides.BUY );
        // What are valid class and product keys to use for this?
        // err testGetTraderClassActivityByTime( 10, // int classKey
        // (new DateWrapper(System.currentTimeMillis()).toDateTimeStruct()), // DateTimeStruct
        // startTime
        // QueryDirections.QUERY_BACKWARD // short direction
        // );
        // err testGetTraderProductActivityByTime( 10, // int productKey
        // (new DateWrapper(System.currentTimeMillis()).toDateTimeStruct()), // DateTimeStruct
        // startTime
        // QueryDirections.QUERY_BACKWARD // short direction
        // );
        // ok OrderId = getRandomOrderId();
        // ok testAcceptOrder(OrderId, 150, 15.0, Sides.SELL );
        // ok testAcceptOrder(getRandomOrderId(), 25, 18.0, Sides.BUY );
        // err testCancelReplaceOrder( OrderId );
        // ok testCancelOrder( OrderId );
        // ok testSubscribeRFQ();
        // short productType = 7;
        // err testGetClassByKeyForSession(917647); //chose a class in session W_AM1
        // err testGetClassBySymbolForSession(productType, "IBM");
        // err testGetProductByKeyForSession(918874); // chose a product in session W_AM1
        // err short type = 2;
        // PriceStruct exercisePrice = new PriceStruct(type,65,0);
        // byte month = 7;
        // byte day = 21;
        // short year = 2011;
        // DateStruct expirationDate = new DateStruct(month,day,year);
        // ProductNameStruct productName = new
        // ProductNameStruct("IBM",exercisePrice,expirationDate,'P',"");
        // testGetProductByNameForSession(productName);
        // testGetStrategyByKeyForSession(2818051);
        // try
        // {
        // java.lang.Object waiter = new java.lang.Object();
        // synchronized (waiter)
        // {
        // waiter.wait();
        // }
        // System.out.println("Calling session logout");
        // session.logout();
        // }
        // catch (Exception e)
        // {
        // e.printStackTrace();
        // }
        // System.out.println("Calling logout");
        // try
        // {
        // mmAPI.logout();
        // }
        // catch (Exception e)
        // {
        // e.printStackTrace();
        // }
        // if (true)
        // {
        // System.exit(0);
        // }
        // }
    }

//    private static void runSaguiCopyBug() throws DataValidationException, SystemException, NotFoundException, CommunicationException, AuthorizationException, TransactionFailedException, InvocationTargetException
//    {
//        String key="FirmCorrClassPARComplexPostStation";
//        BasePropertyGroup[] retGroups = RoutingPropertyFactoryHome.find().getAllRoutingPropertyGroupsForKey(key);
//    }

//    private static void test2() throws RecognitionException, IOException
//    {
//        String s = "username 'myName'";
//        byte[] testCases = s.getBytes();
//        ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(testCases));
//        Test2Lexer lexer = new Test2Lexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        Test2Parser parser = new Test2Parser(tokens);
//        Test2Parser.tester_return result = parser.tester();
//        CommonTree tree = (CommonTree) result.getTree();
//        System.out.println("WALK RESULTING TREE: "+ tree.toStringTree());
//        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
//        nodes.setTokenStream(tokens);
//        Test2Walker walker = new Test2Walker(nodes);
//        walker.tester();
//    }

    private static void run(byte[][] buffers) throws IOException, RecognitionException
    {
        // "cancel new random order and strategy by symbol or option where quote=s45 from random quote\n";
       //Util.removeComments(buffers);
        for (int i = 0; i < buffers.length; i++)
        {
            //System.out.println("RAW: "+new String(buffers[i]));
            ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(buffers[i]));
            OnyxLexer lexer = new OnyxLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OnyxParser parser = new OnyxParser(tokens);
            OnyxParser.command_return result = parser.command();
            CommonTree tree = (CommonTree) result.getTree();
            // printTree(tree,0);
            if (false || tree!=null) {
                System.out.println("WALK RESULTING TREE");
                System.out.println(tree.toStringTree());
                // Create a tree node stream from resulting tree
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                nodes.setTokenStream(tokens);
                OnyxWalker walker = new OnyxWalker(nodes);
                walker.commands();
            }
            else {
                System.out.println("no tree!");
            }
        }
    }

    public static void printTree(CommonTree t, int indent)
    {
        if (t != null)
        {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++)
                sb = sb.append('\t');
            for (int i = 0; i < t.getChildCount(); i++)
            {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree) t.getChild(i), indent++);
            }
        }
    }
    

    public static void main(String[] args) throws Exception
    {
        //System.out.println(System.getProperty("java.class.path"));
        if (args.length == 0) {
            usage();
            return;
        }
        File[] files = new File[args.length];
        for (int i=0; i<args.length; i++) {
            File file = new File(args[i]);
            if (file.exists() && file.isFile() && file.canRead()) {
                files[i] = file;
            }
            else {
                throw new IllegalArgumentException(args[i]);
            }
        }

        byte [][] buffs= new byte[files.length][];
        for (int i=0; i<files.length; i++) {
            
            FileInputStream bfr = new FileInputStream(files[i]);
            buffs[i] = new byte[(int)files[i].length()]; // TODO cast is sloppy
            bfr.read(buffs[i]);
        }
        MockHomeBuilder.initialize();
        run(buffs);
        //runSaguiCopyBug();
        //test2();
    }

    private static void usage()
    {
        System.out.println("USAGE: todo");
    }

}
