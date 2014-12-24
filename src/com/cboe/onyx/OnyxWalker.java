// $ANTLR 3.3 Nov 30, 2010 12:45:30 OnyxWalker.g 2011-04-25 09:15:49

  package com.cboe.onyx;
  import java.util.Map;
  import java.util.HashMap;
  import com.cboe.onyx.verb.*;
  import com.cboe.interfaces.presentation.api.MarketMakerAPI;
  import com.cboe.idl.cmiSession.TradingSessionStruct;
  import com.cboe.idl.cmiConstants.ProductTypesOperations;
  import com.cboe.idl.cmiConstants.Sides;
  import com.cboe.interfaces.presentation.product.SessionProduct;
  import com.cboe.idl.cmiStrategy.StrategyRequestStruct;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OnyxWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "CANCEL", "CONNECT", "CREATE", "GET", "LOGIN", "LOGOUT", "REPLACE", "SELECT", "SEND", "SUBSCRIBE", "WAIT", "BOOK", "BUY", "CAS", "DURATION", "HOSTNAME", "CURRENT_MARKET", "FILENAME", "FIRM", "KEY", "MARKET_DATA", "MESSAGE", "NAME", "NBBO", "OPTION", "ORDER", "ORDER_HISTORY", "PASSWORD", "PREFERENCES", "PRICE", "PRODUCT", "PRODUCTS", "PRODUCT_CLASS", "PRODUCT_CLASSES", "PRODUCT_TYPE", "PRODUCT_TYPES", "QUANTITY", "QUOTE", "RECAP", "RFQ", "ROLE", "SELL", "SESSION", "SESSIONS", "SEQUENCE_NUMBER", "SIDE", "STRATEGY", "SYMBOL", "TICKER", "TIME", "TRADER_PRODUCT_HISTORY", "USERNAME", "USER_MARKET", "RANDOM", "NEW", "BY", "FOR", "FROM", "OF", "TO", "AND", "OR", "WHERE", "COMMENT", "NEWLINE", "WS", "QVALUE", "FILE", "'='", "LINE", "ASK", "BID"
    };
    public static final int EOF=-1;
    public static final int T__73=73;
    public static final int ACCEPT=4;
    public static final int CANCEL=5;
    public static final int CONNECT=6;
    public static final int CREATE=7;
    public static final int GET=8;
    public static final int LOGIN=9;
    public static final int LOGOUT=10;
    public static final int REPLACE=11;
    public static final int SELECT=12;
    public static final int SEND=13;
    public static final int SUBSCRIBE=14;
    public static final int WAIT=15;
    public static final int BOOK=16;
    public static final int BUY=17;
    public static final int CAS=18;
    public static final int DURATION=19;
    public static final int HOSTNAME=20;
    public static final int CURRENT_MARKET=21;
    public static final int FILENAME=22;
    public static final int FIRM=23;
    public static final int KEY=24;
    public static final int MARKET_DATA=25;
    public static final int MESSAGE=26;
    public static final int NAME=27;
    public static final int NBBO=28;
    public static final int OPTION=29;
    public static final int ORDER=30;
    public static final int ORDER_HISTORY=31;
    public static final int PASSWORD=32;
    public static final int PREFERENCES=33;
    public static final int PRICE=34;
    public static final int PRODUCT=35;
    public static final int PRODUCTS=36;
    public static final int PRODUCT_CLASS=37;
    public static final int PRODUCT_CLASSES=38;
    public static final int PRODUCT_TYPE=39;
    public static final int PRODUCT_TYPES=40;
    public static final int QUANTITY=41;
    public static final int QUOTE=42;
    public static final int RECAP=43;
    public static final int RFQ=44;
    public static final int ROLE=45;
    public static final int SELL=46;
    public static final int SESSION=47;
    public static final int SESSIONS=48;
    public static final int SEQUENCE_NUMBER=49;
    public static final int SIDE=50;
    public static final int STRATEGY=51;
    public static final int SYMBOL=52;
    public static final int TICKER=53;
    public static final int TIME=54;
    public static final int TRADER_PRODUCT_HISTORY=55;
    public static final int USERNAME=56;
    public static final int USER_MARKET=57;
    public static final int RANDOM=58;
    public static final int NEW=59;
    public static final int BY=60;
    public static final int FOR=61;
    public static final int FROM=62;
    public static final int OF=63;
    public static final int TO=64;
    public static final int AND=65;
    public static final int OR=66;
    public static final int WHERE=67;
    public static final int COMMENT=68;
    public static final int NEWLINE=69;
    public static final int WS=70;
    public static final int QVALUE=71;
    public static final int FILE=72;
    public static final int LINE=74;
    public static final int ASK=75;
    public static final int BID=76;

    // delegates
    // delegators


        public OnyxWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public OnyxWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OnyxWalker.tokenNames; }
    public String getGrammarFileName() { return "OnyxWalker.g"; }


      private Map<String,Object> names;
      private MarketMakerAPI mmAPI;
      private OnyxCASCallback casCallback = new OnyxCASCallback("Onyx");
      private TradingSessionStruct[] sessions;
      private TradingSessionStruct currentSession;
      private SessionProduct selectedSessionProduct;
      Accept accept;
      Cancel cancel;
      Connect connect;
      Create create;
      Get get;
      Login login;
      Logout logout;
      Query query;
      Select select;
      Send send;
      Subscribe subscribe;
      Wait wait;



    // $ANTLR start "commands"
    // OnyxWalker.g:43:1: commands : ( command )* ;
    public final void commands() throws RecognitionException {
        try {
            // OnyxWalker.g:44:3: ( ( command )* )
            // OnyxWalker.g:44:5: ( command )*
            {
            // OnyxWalker.g:44:5: ( command )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ACCEPT||(LA1_0>=CONNECT && LA1_0<=LOGOUT)||LA1_0==SELECT||LA1_0==WAIT||LA1_0==COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // OnyxWalker.g:44:5: command
            	    {
            	    pushFollow(FOLLOW_command_in_commands52);
            	    command();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "commands"


    // $ANTLR start "command"
    // OnyxWalker.g:47:1: command : ( COMMENT | ^( COMMENT LINE ) | ^( CONNECT ^( TO CAS ) ^( WHERE ^( HOSTNAME QVALUE ) ) ) | ^( LOGIN ^( WHERE ^( USERNAME a= QVALUE ) ^( PASSWORD b= QVALUE ) ) ) | ^( WAIT ^( WHERE ^( DURATION QVALUE ) ) ) | LOGOUT | ^( GET SESSIONS ) | ^( SELECT SESSION ^( WHERE ^( NAME a= QVALUE ) ) ) | ^( GET PRODUCT_TYPES ) | ^( GET PRODUCT_CLASSES ^( WHERE ^( PRODUCT_TYPE OPTION ) ) ) | ^( GET PRODUCTS ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( SELECT ^( PRODUCT RANDOM ) ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( ACCEPT QUOTE ^( WHERE ^( QUANTITY a= QVALUE ) ^( ASK b= QVALUE ) ^( BID c= QVALUE ) ) ) | ^( ACCEPT ORDER ^( WHERE ^( SEQUENCE_NUMBER b= QVALUE ) ^( QUANTITY c= QVALUE ) ^( PRICE d= QVALUE ) ^( SIDE BUY ) ) ) | ^( CREATE ^( RANDOM STRATEGY ) ^( WHERE ^( NAME a= QVALUE ) ) ) ^( ACCEPT STRATEGY ^( WHERE ^( NAME a= QVALUE ) ) ) );
    public final void command() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;
        CommonTree d=null;
        CommonTree COMMENT1=null;
        CommonTree QVALUE2=null;
        CommonTree QVALUE3=null;

        try {
            // OnyxWalker.g:48:3: ( COMMENT | ^( COMMENT LINE ) | ^( CONNECT ^( TO CAS ) ^( WHERE ^( HOSTNAME QVALUE ) ) ) | ^( LOGIN ^( WHERE ^( USERNAME a= QVALUE ) ^( PASSWORD b= QVALUE ) ) ) | ^( WAIT ^( WHERE ^( DURATION QVALUE ) ) ) | LOGOUT | ^( GET SESSIONS ) | ^( SELECT SESSION ^( WHERE ^( NAME a= QVALUE ) ) ) | ^( GET PRODUCT_TYPES ) | ^( GET PRODUCT_CLASSES ^( WHERE ^( PRODUCT_TYPE OPTION ) ) ) | ^( GET PRODUCTS ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( SELECT ^( PRODUCT RANDOM ) ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( ACCEPT QUOTE ^( WHERE ^( QUANTITY a= QVALUE ) ^( ASK b= QVALUE ) ^( BID c= QVALUE ) ) ) | ^( ACCEPT ORDER ^( WHERE ^( SEQUENCE_NUMBER b= QVALUE ) ^( QUANTITY c= QVALUE ) ^( PRICE d= QVALUE ) ^( SIDE BUY ) ) ) | ^( CREATE ^( RANDOM STRATEGY ) ^( WHERE ^( NAME a= QVALUE ) ) ) ^( ACCEPT STRATEGY ^( WHERE ^( NAME a= QVALUE ) ) ) )
            int alt2=15;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // OnyxWalker.g:49:3: COMMENT
                    {
                    match(input,COMMENT,FOLLOW_COMMENT_in_command68); 

                    }
                    break;
                case 2 :
                    // OnyxWalker.g:51:3: ^( COMMENT LINE )
                    {
                    COMMENT1=(CommonTree)match(input,COMMENT,FOLLOW_COMMENT_in_command77); 

                    match(input, Token.DOWN, null); 
                    match(input,LINE,FOLLOW_LINE_in_command79); 

                    match(input, Token.UP, null); 

                        System.out.println("WALKER: "+(COMMENT1!=null?COMMENT1.getText():null));
                      

                    }
                    break;
                case 3 :
                    // OnyxWalker.g:56:3: ^( CONNECT ^( TO CAS ) ^( WHERE ^( HOSTNAME QVALUE ) ) )
                    {
                    match(input,CONNECT,FOLLOW_CONNECT_in_command93); 

                    match(input, Token.DOWN, null); 
                    match(input,TO,FOLLOW_TO_in_command96); 

                    match(input, Token.DOWN, null); 
                    match(input,CAS,FOLLOW_CAS_in_command98); 

                    match(input, Token.UP, null); 
                    match(input,WHERE,FOLLOW_WHERE_in_command102); 

                    match(input, Token.DOWN, null); 
                    match(input,HOSTNAME,FOLLOW_HOSTNAME_in_command105); 

                    match(input, Token.DOWN, null); 
                    QVALUE2=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command107); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                     
                        connect = Connect.getInstance();
                        connect.setHostName(Util.dq((QVALUE2!=null?QVALUE2.getText():null)));
                        connect.connectToCAS();
                      

                    }
                    break;
                case 4 :
                    // OnyxWalker.g:63:3: ^( LOGIN ^( WHERE ^( USERNAME a= QVALUE ) ^( PASSWORD b= QVALUE ) ) )
                    {
                    match(input,LOGIN,FOLLOW_LOGIN_in_command123); 

                    match(input, Token.DOWN, null); 
                    match(input,WHERE,FOLLOW_WHERE_in_command126); 

                    match(input, Token.DOWN, null); 
                    match(input,USERNAME,FOLLOW_USERNAME_in_command129); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command133); 

                    match(input, Token.UP, null); 
                    match(input,PASSWORD,FOLLOW_PASSWORD_in_command137); 

                    match(input, Token.DOWN, null); 
                    b=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command141); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        login = Login.getInstance();
                        login.setUserName(Util.dq((a!=null?a.getText():null)));
                        login.setPassword(Util.dq((b!=null?b.getText():null)));
                        login.setCasCallback(casCallback);
                        login.login();
                        mmAPI = login.getMmAPI();
                      

                    }
                    break;
                case 5 :
                    // OnyxWalker.g:73:3: ^( WAIT ^( WHERE ^( DURATION QVALUE ) ) )
                    {
                    match(input,WAIT,FOLLOW_WAIT_in_command157); 

                    match(input, Token.DOWN, null); 
                    match(input,WHERE,FOLLOW_WHERE_in_command160); 

                    match(input, Token.DOWN, null); 
                    match(input,DURATION,FOLLOW_DURATION_in_command163); 

                    match(input, Token.DOWN, null); 
                    QVALUE3=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command165); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        wait = Wait.getInstance();
                        wait.setDuration(Util.dq((QVALUE3!=null?QVALUE3.getText():null)));
                        wait.wait2();
                      

                    }
                    break;
                case 6 :
                    // OnyxWalker.g:80:3: LOGOUT
                    {
                    match(input,LOGOUT,FOLLOW_LOGOUT_in_command180); 

                        logout = Logout.getInstance();
                        logout.setMmAPI(mmAPI);
                        logout.logout();
                      

                    }
                    break;
                case 7 :
                    // OnyxWalker.g:87:3: ^( GET SESSIONS )
                    {
                    match(input,GET,FOLLOW_GET_in_command193); 

                    match(input, Token.DOWN, null); 
                    match(input,SESSIONS,FOLLOW_SESSIONS_in_command195); 

                    match(input, Token.UP, null); 

                        get = Get.getInstance();
                        get.setMmAPI(mmAPI);
                        sessions = get.getSessions(casCallback);
                        for (TradingSessionStruct session : sessions) {
                          System.out.println(session.sessionName);
                        }
                      

                    }
                    break;
                case 8 :
                    // OnyxWalker.g:97:3: ^( SELECT SESSION ^( WHERE ^( NAME a= QVALUE ) ) )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_command209); 

                    match(input, Token.DOWN, null); 
                    match(input,SESSION,FOLLOW_SESSION_in_command211); 
                    match(input,WHERE,FOLLOW_WHERE_in_command214); 

                    match(input, Token.DOWN, null); 
                    match(input,NAME,FOLLOW_NAME_in_command217); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command221); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        select = Select.getInstance();
                        select.setMmAPI(mmAPI);
                        select.selectCurrentSession(Util.dq((a!=null?a.getText():null)));
                        currentSession = select.getCurrentSession();
                      

                    }
                    break;
                case 9 :
                    // OnyxWalker.g:105:3: ^( GET PRODUCT_TYPES )
                    {
                    match(input,GET,FOLLOW_GET_in_command237); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT_TYPES,FOLLOW_PRODUCT_TYPES_in_command239); 

                    match(input, Token.UP, null); 

                        get = Get.getInstance();
                        get.setCurrentSession(currentSession);
                        get.setMmAPI(mmAPI);
                        get.getProductTypes();
                      

                    }
                    break;
                case 10 :
                    // OnyxWalker.g:113:3: ^( GET PRODUCT_CLASSES ^( WHERE ^( PRODUCT_TYPE OPTION ) ) )
                    {
                    match(input,GET,FOLLOW_GET_in_command254); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT_CLASSES,FOLLOW_PRODUCT_CLASSES_in_command256); 
                    match(input,WHERE,FOLLOW_WHERE_in_command259); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT_TYPE,FOLLOW_PRODUCT_TYPE_in_command262); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTION,FOLLOW_OPTION_in_command264); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        get = Get.getInstance();
                        get.setCurrentSession(currentSession);
                        get.setMmAPI(mmAPI);
                        get.setCasCallback(casCallback);
                        get.getProductClassesForSession(ProductTypesOperations.OPTION);
                      

                    }
                    break;
                case 11 :
                    // OnyxWalker.g:122:3: ^( GET PRODUCTS ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) )
                    {
                    match(input,GET,FOLLOW_GET_in_command280); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCTS,FOLLOW_PRODUCTS_in_command282); 
                    match(input,WHERE,FOLLOW_WHERE_in_command285); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT_TYPE,FOLLOW_PRODUCT_TYPE_in_command288); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTION,FOLLOW_OPTION_in_command290); 

                    match(input, Token.UP, null); 
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_command294); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command298); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        get = Get.getInstance();
                        get.setCurrentSession(currentSession);
                        get.setMmAPI(mmAPI);
                        get.setCasCallback(casCallback);
                        get.getProductsForSessionWithSymbolOfType(Util.dq((a!=null?a.getText():null)),ProductTypesOperations.OPTION);
                      

                    }
                    break;
                case 12 :
                    // OnyxWalker.g:131:3: ^( SELECT ^( PRODUCT RANDOM ) ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_command314); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT,FOLLOW_PRODUCT_in_command317); 

                    match(input, Token.DOWN, null); 
                    match(input,RANDOM,FOLLOW_RANDOM_in_command319); 

                    match(input, Token.UP, null); 
                    match(input,WHERE,FOLLOW_WHERE_in_command323); 

                    match(input, Token.DOWN, null); 
                    match(input,PRODUCT_TYPE,FOLLOW_PRODUCT_TYPE_in_command326); 

                    match(input, Token.DOWN, null); 
                    match(input,OPTION,FOLLOW_OPTION_in_command328); 

                    match(input, Token.UP, null); 
                    match(input,SYMBOL,FOLLOW_SYMBOL_in_command332); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command336); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        get = Get.getInstance();
                        get.setCurrentSession(currentSession);
                        get.setMmAPI(mmAPI);
                        get.setCasCallback(casCallback);
                        get.getProductsForSessionWithSymbolOfType(Util.dq((a!=null?a.getText():null)),ProductTypesOperations.OPTION);
                        SessionProduct[] sessionProducts = get.getSessionProducts();
                        selectedSessionProduct = sessionProducts[Util.getRandomInt(sessionProducts.length)];
                      

                    }
                    break;
                case 13 :
                    // OnyxWalker.g:142:3: ^( ACCEPT QUOTE ^( WHERE ^( QUANTITY a= QVALUE ) ^( ASK b= QVALUE ) ^( BID c= QVALUE ) ) )
                    {
                    match(input,ACCEPT,FOLLOW_ACCEPT_in_command352); 

                    match(input, Token.DOWN, null); 
                    match(input,QUOTE,FOLLOW_QUOTE_in_command354); 
                    match(input,WHERE,FOLLOW_WHERE_in_command357); 

                    match(input, Token.DOWN, null); 
                    match(input,QUANTITY,FOLLOW_QUANTITY_in_command360); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command364); 

                    match(input, Token.UP, null); 
                    match(input,ASK,FOLLOW_ASK_in_command368); 

                    match(input, Token.DOWN, null); 
                    b=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command372); 

                    match(input, Token.UP, null); 
                    match(input,BID,FOLLOW_BID_in_command376); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command380); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        accept = Accept.getInstance();
                        accept.setCurrentSession(currentSession);
                        accept.setMmAPI(mmAPI);
                        int quantity = Integer.parseInt(Util.dq((a!=null?a.getText():null)));
                        double ask = Double.parseDouble(Util.dq((b!=null?b.getText():null)));
                        double bid = Double.parseDouble(Util.dq((c!=null?c.getText():null)));
                        accept.acceptQuote(selectedSessionProduct.getProductKey(), quantity, ask, bid);
                      

                    }
                    break;
                case 14 :
                    // OnyxWalker.g:153:3: ^( ACCEPT ORDER ^( WHERE ^( SEQUENCE_NUMBER b= QVALUE ) ^( QUANTITY c= QVALUE ) ^( PRICE d= QVALUE ) ^( SIDE BUY ) ) )
                    {
                    match(input,ACCEPT,FOLLOW_ACCEPT_in_command396); 

                    match(input, Token.DOWN, null); 
                    match(input,ORDER,FOLLOW_ORDER_in_command398); 
                    match(input,WHERE,FOLLOW_WHERE_in_command401); 

                    match(input, Token.DOWN, null); 
                    match(input,SEQUENCE_NUMBER,FOLLOW_SEQUENCE_NUMBER_in_command404); 

                    match(input, Token.DOWN, null); 
                    b=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command408); 

                    match(input, Token.UP, null); 
                    match(input,QUANTITY,FOLLOW_QUANTITY_in_command412); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command416); 

                    match(input, Token.UP, null); 
                    match(input,PRICE,FOLLOW_PRICE_in_command420); 

                    match(input, Token.DOWN, null); 
                    d=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command424); 

                    match(input, Token.UP, null); 
                    match(input,SIDE,FOLLOW_SIDE_in_command428); 

                    match(input, Token.DOWN, null); 
                    match(input,BUY,FOLLOW_BUY_in_command430); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        accept = Accept.getInstance();
                        accept.setCurrentSession(currentSession);
                        accept.setMmAPI(mmAPI);
                        int seqNum = Integer.parseInt(Util.dq((b!=null?b.getText():null)));
                        int quantity = Integer.parseInt(Util.dq((c!=null?c.getText():null)));
                        double price = Double.parseDouble(Util.dq((d!=null?d.getText():null)));
                        accept.acceptOrder(selectedSessionProduct.getProductKey(),login.getUserName(), seqNum, quantity, price, Sides.BUY);
                      

                    }
                    break;
                case 15 :
                    // OnyxWalker.g:164:3: ^( CREATE ^( RANDOM STRATEGY ) ^( WHERE ^( NAME a= QVALUE ) ) ) ^( ACCEPT STRATEGY ^( WHERE ^( NAME a= QVALUE ) ) )
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_command446); 

                    match(input, Token.DOWN, null); 
                    match(input,RANDOM,FOLLOW_RANDOM_in_command449); 

                    match(input, Token.DOWN, null); 
                    match(input,STRATEGY,FOLLOW_STRATEGY_in_command451); 

                    match(input, Token.UP, null); 
                    match(input,WHERE,FOLLOW_WHERE_in_command455); 

                    match(input, Token.DOWN, null); 
                    match(input,NAME,FOLLOW_NAME_in_command458); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command462); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        create = Create.getInstance();
                        if (names.containsKey(Util.dq((a!=null?a.getText():null)))) {
                          throw new RuntimeException("duplicate name");
                        }
                        
                        names.put(Util.dq((a!=null?a.getText():null)), create.createRandomStrategy());
                      
                    match(input,ACCEPT,FOLLOW_ACCEPT_in_command474); 

                    match(input, Token.DOWN, null); 
                    match(input,STRATEGY,FOLLOW_STRATEGY_in_command476); 
                    match(input,WHERE,FOLLOW_WHERE_in_command479); 

                    match(input, Token.DOWN, null); 
                    match(input,NAME,FOLLOW_NAME_in_command482); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,QVALUE,FOLLOW_QVALUE_in_command486); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                        accept = Accept.getInstance();
                        accept.setMmAPI(mmAPI);
                        accept.setCurrentSession(currentSession);
                        accept.acceptSessionStrategy((StrategyRequestStruct)names.get(Util.dq((a!=null?a.getText():null))));
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "command"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\27\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\13\25\uffff";
    static final String DFA2_minS =
        "\1\4\1\2\4\uffff\3\2\3\uffff\1\44\1\43\1\36\10\uffff";
    static final String DFA2_maxS =
        "\2\104\4\uffff\3\2\3\uffff\1\60\1\57\1\52\10\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\3\uffff\1\17\1\2\1\1\3\uffff\1\7\1\11"+
        "\1\12\1\13\1\10\1\14\1\15\1\16";
    static final String DFA2_specialS =
        "\27\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\uffff\1\2\1\11\1\6\1\3\1\5\1\uffff\1\7\2\uffff\1\4"+
            "\64\uffff\1\1",
            "\1\12\1\uffff\1\13\1\uffff\5\13\1\uffff\1\13\2\uffff\1\13"+
            "\64\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "\1\22\1\uffff\1\21\1\uffff\1\20\7\uffff\1\17",
            "\1\24\13\uffff\1\23",
            "\1\26\13\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "47:1: command : ( COMMENT | ^( COMMENT LINE ) | ^( CONNECT ^( TO CAS ) ^( WHERE ^( HOSTNAME QVALUE ) ) ) | ^( LOGIN ^( WHERE ^( USERNAME a= QVALUE ) ^( PASSWORD b= QVALUE ) ) ) | ^( WAIT ^( WHERE ^( DURATION QVALUE ) ) ) | LOGOUT | ^( GET SESSIONS ) | ^( SELECT SESSION ^( WHERE ^( NAME a= QVALUE ) ) ) | ^( GET PRODUCT_TYPES ) | ^( GET PRODUCT_CLASSES ^( WHERE ^( PRODUCT_TYPE OPTION ) ) ) | ^( GET PRODUCTS ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( SELECT ^( PRODUCT RANDOM ) ^( WHERE ^( PRODUCT_TYPE OPTION ) ^( SYMBOL a= QVALUE ) ) ) | ^( ACCEPT QUOTE ^( WHERE ^( QUANTITY a= QVALUE ) ^( ASK b= QVALUE ) ^( BID c= QVALUE ) ) ) | ^( ACCEPT ORDER ^( WHERE ^( SEQUENCE_NUMBER b= QVALUE ) ^( QUANTITY c= QVALUE ) ^( PRICE d= QVALUE ) ^( SIDE BUY ) ) ) | ^( CREATE ^( RANDOM STRATEGY ) ^( WHERE ^( NAME a= QVALUE ) ) ) ^( ACCEPT STRATEGY ^( WHERE ^( NAME a= QVALUE ) ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_command_in_commands52 = new BitSet(new long[]{0x00000000000097D2L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMENT_in_command68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_command77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LINE_in_command79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONNECT_in_command93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TO_in_command96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CAS_in_command98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOSTNAME_in_command105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGIN_in_command123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_command126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_USERNAME_in_command129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PASSWORD_in_command137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_in_command157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_command160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DURATION_in_command163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGOUT_in_command180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_command193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SESSIONS_in_command195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_command209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SESSION_in_command211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_command217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_command237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_TYPES_in_command239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_command254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_CLASSES_in_command256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_TYPE_in_command262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTION_in_command264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_command280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCTS_in_command282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_TYPE_in_command288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTION_in_command290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYMBOL_in_command294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_command314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_in_command317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RANDOM_in_command319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRODUCT_TYPE_in_command326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OPTION_in_command328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYMBOL_in_command332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCEPT_in_command352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QUOTE_in_command354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QUANTITY_in_command360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_command368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BID_in_command376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCEPT_in_command396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ORDER_in_command398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEQUENCE_NUMBER_in_command404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTITY_in_command412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRICE_in_command420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIDE_in_command428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUY_in_command430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_command446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RANDOM_in_command449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRATEGY_in_command451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_command458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCEPT_in_command474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRATEGY_in_command476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_command479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAME_in_command482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_QVALUE_in_command486 = new BitSet(new long[]{0x0000000000000008L});

}