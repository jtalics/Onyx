// $ANTLR 3.3 Nov 30, 2010 12:45:30 Onyx.g 2011-04-25 09:15:48
 
package com.cboe.onyx;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OnyxLexer extends Lexer {
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

    // delegates
    // delegators

    public OnyxLexer() {;} 
    public OnyxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OnyxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Onyx.g"; }

    // $ANTLR start "ACCEPT"
    public final void mACCEPT() throws RecognitionException {
        try {
            int _type = ACCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:11:8: ( 'accept' )
            // Onyx.g:11:10: 'accept'
            {
            match("accept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCEPT"

    // $ANTLR start "CANCEL"
    public final void mCANCEL() throws RecognitionException {
        try {
            int _type = CANCEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:12:8: ( 'cancel' )
            // Onyx.g:12:10: 'cancel'
            {
            match("cancel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CANCEL"

    // $ANTLR start "CONNECT"
    public final void mCONNECT() throws RecognitionException {
        try {
            int _type = CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:13:9: ( 'connect' )
            // Onyx.g:13:11: 'connect'
            {
            match("connect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONNECT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:14:8: ( 'create' )
            // Onyx.g:14:10: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:15:5: ( 'get' )
            // Onyx.g:15:7: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "LOGIN"
    public final void mLOGIN() throws RecognitionException {
        try {
            int _type = LOGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:16:7: ( 'login' )
            // Onyx.g:16:9: 'login'
            {
            match("login"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGIN"

    // $ANTLR start "LOGOUT"
    public final void mLOGOUT() throws RecognitionException {
        try {
            int _type = LOGOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:17:8: ( 'logout' )
            // Onyx.g:17:10: 'logout'
            {
            match("logout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGOUT"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:18:9: ( 'replace' )
            // Onyx.g:18:11: 'replace'
            {
            match("replace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:19:8: ( 'select' )
            // Onyx.g:19:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SEND"
    public final void mSEND() throws RecognitionException {
        try {
            int _type = SEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:20:6: ( 'send' )
            // Onyx.g:20:8: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEND"

    // $ANTLR start "SUBSCRIBE"
    public final void mSUBSCRIBE() throws RecognitionException {
        try {
            int _type = SUBSCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:21:11: ( 'subscribe' )
            // Onyx.g:21:13: 'subscribe'
            {
            match("subscribe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBSCRIBE"

    // $ANTLR start "WAIT"
    public final void mWAIT() throws RecognitionException {
        try {
            int _type = WAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:22:6: ( 'wait' )
            // Onyx.g:22:8: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WAIT"

    // $ANTLR start "BOOK"
    public final void mBOOK() throws RecognitionException {
        try {
            int _type = BOOK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:23:6: ( 'book' )
            // Onyx.g:23:8: 'book'
            {
            match("book"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOK"

    // $ANTLR start "BUY"
    public final void mBUY() throws RecognitionException {
        try {
            int _type = BUY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:24:5: ( 'buy' )
            // Onyx.g:24:7: 'buy'
            {
            match("buy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BUY"

    // $ANTLR start "CAS"
    public final void mCAS() throws RecognitionException {
        try {
            int _type = CAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:25:5: ( 'cas' )
            // Onyx.g:25:7: 'cas'
            {
            match("cas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAS"

    // $ANTLR start "DURATION"
    public final void mDURATION() throws RecognitionException {
        try {
            int _type = DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:26:10: ( 'duration' )
            // Onyx.g:26:12: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DURATION"

    // $ANTLR start "HOSTNAME"
    public final void mHOSTNAME() throws RecognitionException {
        try {
            int _type = HOSTNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:27:10: ( 'hostname' )
            // Onyx.g:27:12: 'hostname'
            {
            match("hostname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOSTNAME"

    // $ANTLR start "CURRENT_MARKET"
    public final void mCURRENT_MARKET() throws RecognitionException {
        try {
            int _type = CURRENT_MARKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:28:16: ( 'currentMarket' )
            // Onyx.g:28:18: 'currentMarket'
            {
            match("currentMarket"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURRENT_MARKET"

    // $ANTLR start "FILENAME"
    public final void mFILENAME() throws RecognitionException {
        try {
            int _type = FILENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:29:10: ( 'filename' )
            // Onyx.g:29:12: 'filename'
            {
            match("filename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILENAME"

    // $ANTLR start "FIRM"
    public final void mFIRM() throws RecognitionException {
        try {
            int _type = FIRM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:30:6: ( 'firm' )
            // Onyx.g:30:8: 'firm'
            {
            match("firm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRM"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:31:5: ( 'key' )
            // Onyx.g:31:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "MARKET_DATA"
    public final void mMARKET_DATA() throws RecognitionException {
        try {
            int _type = MARKET_DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:32:13: ( 'marketData' )
            // Onyx.g:32:15: 'marketData'
            {
            match("marketData"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MARKET_DATA"

    // $ANTLR start "MESSAGE"
    public final void mMESSAGE() throws RecognitionException {
        try {
            int _type = MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:33:9: ( 'message' )
            // Onyx.g:33:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MESSAGE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:34:6: ( 'name' )
            // Onyx.g:34:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "NBBO"
    public final void mNBBO() throws RecognitionException {
        try {
            int _type = NBBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:35:6: ( 'nbbo' )
            // Onyx.g:35:8: 'nbbo'
            {
            match("nbbo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NBBO"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:36:8: ( 'option' )
            // Onyx.g:36:10: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTION"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:37:7: ( 'order' )
            // Onyx.g:37:9: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "ORDER_HISTORY"
    public final void mORDER_HISTORY() throws RecognitionException {
        try {
            int _type = ORDER_HISTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:38:15: ( 'orderHistory' )
            // Onyx.g:38:17: 'orderHistory'
            {
            match("orderHistory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER_HISTORY"

    // $ANTLR start "PASSWORD"
    public final void mPASSWORD() throws RecognitionException {
        try {
            int _type = PASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:39:10: ( 'password' )
            // Onyx.g:39:12: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASSWORD"

    // $ANTLR start "PREFERENCES"
    public final void mPREFERENCES() throws RecognitionException {
        try {
            int _type = PREFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:40:13: ( 'preferences' )
            // Onyx.g:40:15: 'preferences'
            {
            match("preferences"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFERENCES"

    // $ANTLR start "PRICE"
    public final void mPRICE() throws RecognitionException {
        try {
            int _type = PRICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:41:7: ( 'price' )
            // Onyx.g:41:9: 'price'
            {
            match("price"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRICE"

    // $ANTLR start "PRODUCT"
    public final void mPRODUCT() throws RecognitionException {
        try {
            int _type = PRODUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:42:9: ( 'product' )
            // Onyx.g:42:11: 'product'
            {
            match("product"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCT"

    // $ANTLR start "PRODUCTS"
    public final void mPRODUCTS() throws RecognitionException {
        try {
            int _type = PRODUCTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:43:10: ( 'products' )
            // Onyx.g:43:12: 'products'
            {
            match("products"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCTS"

    // $ANTLR start "PRODUCT_CLASS"
    public final void mPRODUCT_CLASS() throws RecognitionException {
        try {
            int _type = PRODUCT_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:44:15: ( 'productClass' )
            // Onyx.g:44:17: 'productClass'
            {
            match("productClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCT_CLASS"

    // $ANTLR start "PRODUCT_CLASSES"
    public final void mPRODUCT_CLASSES() throws RecognitionException {
        try {
            int _type = PRODUCT_CLASSES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:45:17: ( 'productClasses' )
            // Onyx.g:45:19: 'productClasses'
            {
            match("productClasses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCT_CLASSES"

    // $ANTLR start "PRODUCT_TYPE"
    public final void mPRODUCT_TYPE() throws RecognitionException {
        try {
            int _type = PRODUCT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:46:14: ( 'productType' )
            // Onyx.g:46:16: 'productType'
            {
            match("productType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCT_TYPE"

    // $ANTLR start "PRODUCT_TYPES"
    public final void mPRODUCT_TYPES() throws RecognitionException {
        try {
            int _type = PRODUCT_TYPES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:47:15: ( 'productTypes' )
            // Onyx.g:47:17: 'productTypes'
            {
            match("productTypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCT_TYPES"

    // $ANTLR start "QUANTITY"
    public final void mQUANTITY() throws RecognitionException {
        try {
            int _type = QUANTITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:48:10: ( 'quantity' )
            // Onyx.g:48:12: 'quantity'
            {
            match("quantity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUANTITY"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:49:7: ( 'quote' )
            // Onyx.g:49:9: 'quote'
            {
            match("quote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "RECAP"
    public final void mRECAP() throws RecognitionException {
        try {
            int _type = RECAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:50:7: ( 'recap' )
            // Onyx.g:50:9: 'recap'
            {
            match("recap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECAP"

    // $ANTLR start "RFQ"
    public final void mRFQ() throws RecognitionException {
        try {
            int _type = RFQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:51:5: ( 'rfq' )
            // Onyx.g:51:7: 'rfq'
            {
            match("rfq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RFQ"

    // $ANTLR start "ROLE"
    public final void mROLE() throws RecognitionException {
        try {
            int _type = ROLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:52:6: ( 'role' )
            // Onyx.g:52:8: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROLE"

    // $ANTLR start "SELL"
    public final void mSELL() throws RecognitionException {
        try {
            int _type = SELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:53:6: ( 'sell' )
            // Onyx.g:53:8: 'sell'
            {
            match("sell"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELL"

    // $ANTLR start "SESSION"
    public final void mSESSION() throws RecognitionException {
        try {
            int _type = SESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:54:9: ( 'session' )
            // Onyx.g:54:11: 'session'
            {
            match("session"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SESSION"

    // $ANTLR start "SESSIONS"
    public final void mSESSIONS() throws RecognitionException {
        try {
            int _type = SESSIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:55:10: ( 'sessions' )
            // Onyx.g:55:12: 'sessions'
            {
            match("sessions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SESSIONS"

    // $ANTLR start "SEQUENCE_NUMBER"
    public final void mSEQUENCE_NUMBER() throws RecognitionException {
        try {
            int _type = SEQUENCE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:56:17: ( 'sequenceNumber' )
            // Onyx.g:56:19: 'sequenceNumber'
            {
            match("sequenceNumber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEQUENCE_NUMBER"

    // $ANTLR start "SIDE"
    public final void mSIDE() throws RecognitionException {
        try {
            int _type = SIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:57:6: ( 'side' )
            // Onyx.g:57:8: 'side'
            {
            match("side"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIDE"

    // $ANTLR start "STRATEGY"
    public final void mSTRATEGY() throws RecognitionException {
        try {
            int _type = STRATEGY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:58:10: ( 'strategy' )
            // Onyx.g:58:12: 'strategy'
            {
            match("strategy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRATEGY"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:59:8: ( 'symbol' )
            // Onyx.g:59:10: 'symbol'
            {
            match("symbol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "TICKER"
    public final void mTICKER() throws RecognitionException {
        try {
            int _type = TICKER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:60:8: ( 'ticker' )
            // Onyx.g:60:10: 'ticker'
            {
            match("ticker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TICKER"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:61:6: ( 'time' )
            // Onyx.g:61:8: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "TRADER_PRODUCT_HISTORY"
    public final void mTRADER_PRODUCT_HISTORY() throws RecognitionException {
        try {
            int _type = TRADER_PRODUCT_HISTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:62:24: ( 'traderProductHistory' )
            // Onyx.g:62:26: 'traderProductHistory'
            {
            match("traderProductHistory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRADER_PRODUCT_HISTORY"

    // $ANTLR start "USERNAME"
    public final void mUSERNAME() throws RecognitionException {
        try {
            int _type = USERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:63:10: ( 'username' )
            // Onyx.g:63:12: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USERNAME"

    // $ANTLR start "USER_MARKET"
    public final void mUSER_MARKET() throws RecognitionException {
        try {
            int _type = USER_MARKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:64:13: ( 'userMarket' )
            // Onyx.g:64:15: 'userMarket'
            {
            match("userMarket"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USER_MARKET"

    // $ANTLR start "RANDOM"
    public final void mRANDOM() throws RecognitionException {
        try {
            int _type = RANDOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:65:8: ( 'random' )
            // Onyx.g:65:10: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANDOM"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:66:5: ( 'new' )
            // Onyx.g:66:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:67:4: ( 'by' )
            // Onyx.g:67:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:68:5: ( 'for' )
            // Onyx.g:68:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:69:6: ( 'from' )
            // Onyx.g:69:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:70:4: ( 'of' )
            // Onyx.g:70:6: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:71:4: ( 'to' )
            // Onyx.g:71:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:72:5: ( 'and' )
            // Onyx.g:72:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:73:4: ( 'or' )
            // Onyx.g:73:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:74:7: ( 'where' )
            // Onyx.g:74:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:75:9: ( '#' )
            // Onyx.g:75:11: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:76:7: ( '=' )
            // Onyx.g:76:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "FILE"
    public final void mFILE() throws RecognitionException {
        try {
            int _type = FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:230:1: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' )+ )
            // Onyx.g:230:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' )+
            {
            // Onyx.g:230:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '.' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Onyx.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:234:1: ( ( ( '\\r' )? '\\n' ) )
            // Onyx.g:234:3: ( ( '\\r' )? '\\n' )
            {
            // Onyx.g:234:3: ( ( '\\r' )? '\\n' )
            // Onyx.g:234:4: ( '\\r' )? '\\n'
            {
            // Onyx.g:234:4: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Onyx.g:234:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:238:1: ( ( ' ' | '\\t' )+ )
            // Onyx.g:238:3: ( ' ' | '\\t' )+
            {
            // Onyx.g:238:3: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Onyx.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "QVALUE"
    public final void mQVALUE() throws RecognitionException {
        try {
            int _type = QVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Onyx.g:253:7: ( ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' ) )
            // Onyx.g:254:3: ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' )
            {
            // Onyx.g:254:3: ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Onyx.g:254:5: '\"' (~ '\"' )* '\"'
                    {
                    match('\"'); 
                    // Onyx.g:254:9: (~ '\"' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Onyx.g:254:10: ~ '\"'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // Onyx.g:255:7: '\\'' (~ '\\'' )* '\\''
                    {
                    match('\''); 
                    // Onyx.g:255:12: (~ '\\'' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Onyx.g:255:13: ~ '\\''
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QVALUE"

    public void mTokens() throws RecognitionException {
        // Onyx.g:1:8: ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT | BOOK | BUY | CAS | DURATION | HOSTNAME | CURRENT_MARKET | FILENAME | FIRM | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUANTITY | QUOTE | RECAP | RFQ | ROLE | SELL | SESSION | SESSIONS | SEQUENCE_NUMBER | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET | RANDOM | NEW | BY | FOR | FROM | OF | TO | AND | OR | WHERE | COMMENT | T__73 | FILE | NEWLINE | WS | QVALUE )
        int alt7=70;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Onyx.g:1:10: ACCEPT
                {
                mACCEPT(); 

                }
                break;
            case 2 :
                // Onyx.g:1:17: CANCEL
                {
                mCANCEL(); 

                }
                break;
            case 3 :
                // Onyx.g:1:24: CONNECT
                {
                mCONNECT(); 

                }
                break;
            case 4 :
                // Onyx.g:1:32: CREATE
                {
                mCREATE(); 

                }
                break;
            case 5 :
                // Onyx.g:1:39: GET
                {
                mGET(); 

                }
                break;
            case 6 :
                // Onyx.g:1:43: LOGIN
                {
                mLOGIN(); 

                }
                break;
            case 7 :
                // Onyx.g:1:49: LOGOUT
                {
                mLOGOUT(); 

                }
                break;
            case 8 :
                // Onyx.g:1:56: REPLACE
                {
                mREPLACE(); 

                }
                break;
            case 9 :
                // Onyx.g:1:64: SELECT
                {
                mSELECT(); 

                }
                break;
            case 10 :
                // Onyx.g:1:71: SEND
                {
                mSEND(); 

                }
                break;
            case 11 :
                // Onyx.g:1:76: SUBSCRIBE
                {
                mSUBSCRIBE(); 

                }
                break;
            case 12 :
                // Onyx.g:1:86: WAIT
                {
                mWAIT(); 

                }
                break;
            case 13 :
                // Onyx.g:1:91: BOOK
                {
                mBOOK(); 

                }
                break;
            case 14 :
                // Onyx.g:1:96: BUY
                {
                mBUY(); 

                }
                break;
            case 15 :
                // Onyx.g:1:100: CAS
                {
                mCAS(); 

                }
                break;
            case 16 :
                // Onyx.g:1:104: DURATION
                {
                mDURATION(); 

                }
                break;
            case 17 :
                // Onyx.g:1:113: HOSTNAME
                {
                mHOSTNAME(); 

                }
                break;
            case 18 :
                // Onyx.g:1:122: CURRENT_MARKET
                {
                mCURRENT_MARKET(); 

                }
                break;
            case 19 :
                // Onyx.g:1:137: FILENAME
                {
                mFILENAME(); 

                }
                break;
            case 20 :
                // Onyx.g:1:146: FIRM
                {
                mFIRM(); 

                }
                break;
            case 21 :
                // Onyx.g:1:151: KEY
                {
                mKEY(); 

                }
                break;
            case 22 :
                // Onyx.g:1:155: MARKET_DATA
                {
                mMARKET_DATA(); 

                }
                break;
            case 23 :
                // Onyx.g:1:167: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 24 :
                // Onyx.g:1:175: NAME
                {
                mNAME(); 

                }
                break;
            case 25 :
                // Onyx.g:1:180: NBBO
                {
                mNBBO(); 

                }
                break;
            case 26 :
                // Onyx.g:1:185: OPTION
                {
                mOPTION(); 

                }
                break;
            case 27 :
                // Onyx.g:1:192: ORDER
                {
                mORDER(); 

                }
                break;
            case 28 :
                // Onyx.g:1:198: ORDER_HISTORY
                {
                mORDER_HISTORY(); 

                }
                break;
            case 29 :
                // Onyx.g:1:212: PASSWORD
                {
                mPASSWORD(); 

                }
                break;
            case 30 :
                // Onyx.g:1:221: PREFERENCES
                {
                mPREFERENCES(); 

                }
                break;
            case 31 :
                // Onyx.g:1:233: PRICE
                {
                mPRICE(); 

                }
                break;
            case 32 :
                // Onyx.g:1:239: PRODUCT
                {
                mPRODUCT(); 

                }
                break;
            case 33 :
                // Onyx.g:1:247: PRODUCTS
                {
                mPRODUCTS(); 

                }
                break;
            case 34 :
                // Onyx.g:1:256: PRODUCT_CLASS
                {
                mPRODUCT_CLASS(); 

                }
                break;
            case 35 :
                // Onyx.g:1:270: PRODUCT_CLASSES
                {
                mPRODUCT_CLASSES(); 

                }
                break;
            case 36 :
                // Onyx.g:1:286: PRODUCT_TYPE
                {
                mPRODUCT_TYPE(); 

                }
                break;
            case 37 :
                // Onyx.g:1:299: PRODUCT_TYPES
                {
                mPRODUCT_TYPES(); 

                }
                break;
            case 38 :
                // Onyx.g:1:313: QUANTITY
                {
                mQUANTITY(); 

                }
                break;
            case 39 :
                // Onyx.g:1:322: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 40 :
                // Onyx.g:1:328: RECAP
                {
                mRECAP(); 

                }
                break;
            case 41 :
                // Onyx.g:1:334: RFQ
                {
                mRFQ(); 

                }
                break;
            case 42 :
                // Onyx.g:1:338: ROLE
                {
                mROLE(); 

                }
                break;
            case 43 :
                // Onyx.g:1:343: SELL
                {
                mSELL(); 

                }
                break;
            case 44 :
                // Onyx.g:1:348: SESSION
                {
                mSESSION(); 

                }
                break;
            case 45 :
                // Onyx.g:1:356: SESSIONS
                {
                mSESSIONS(); 

                }
                break;
            case 46 :
                // Onyx.g:1:365: SEQUENCE_NUMBER
                {
                mSEQUENCE_NUMBER(); 

                }
                break;
            case 47 :
                // Onyx.g:1:381: SIDE
                {
                mSIDE(); 

                }
                break;
            case 48 :
                // Onyx.g:1:386: STRATEGY
                {
                mSTRATEGY(); 

                }
                break;
            case 49 :
                // Onyx.g:1:395: SYMBOL
                {
                mSYMBOL(); 

                }
                break;
            case 50 :
                // Onyx.g:1:402: TICKER
                {
                mTICKER(); 

                }
                break;
            case 51 :
                // Onyx.g:1:409: TIME
                {
                mTIME(); 

                }
                break;
            case 52 :
                // Onyx.g:1:414: TRADER_PRODUCT_HISTORY
                {
                mTRADER_PRODUCT_HISTORY(); 

                }
                break;
            case 53 :
                // Onyx.g:1:437: USERNAME
                {
                mUSERNAME(); 

                }
                break;
            case 54 :
                // Onyx.g:1:446: USER_MARKET
                {
                mUSER_MARKET(); 

                }
                break;
            case 55 :
                // Onyx.g:1:458: RANDOM
                {
                mRANDOM(); 

                }
                break;
            case 56 :
                // Onyx.g:1:465: NEW
                {
                mNEW(); 

                }
                break;
            case 57 :
                // Onyx.g:1:469: BY
                {
                mBY(); 

                }
                break;
            case 58 :
                // Onyx.g:1:472: FOR
                {
                mFOR(); 

                }
                break;
            case 59 :
                // Onyx.g:1:476: FROM
                {
                mFROM(); 

                }
                break;
            case 60 :
                // Onyx.g:1:481: OF
                {
                mOF(); 

                }
                break;
            case 61 :
                // Onyx.g:1:484: TO
                {
                mTO(); 

                }
                break;
            case 62 :
                // Onyx.g:1:487: AND
                {
                mAND(); 

                }
                break;
            case 63 :
                // Onyx.g:1:491: OR
                {
                mOR(); 

                }
                break;
            case 64 :
                // Onyx.g:1:494: WHERE
                {
                mWHERE(); 

                }
                break;
            case 65 :
                // Onyx.g:1:500: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 66 :
                // Onyx.g:1:508: T__73
                {
                mT__73(); 

                }
                break;
            case 67 :
                // Onyx.g:1:514: FILE
                {
                mFILE(); 

                }
                break;
            case 68 :
                // Onyx.g:1:519: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 69 :
                // Onyx.g:1:527: WS
                {
                mWS(); 

                }
                break;
            case 70 :
                // Onyx.g:1:530: QVALUE
                {
                mQVALUE(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\23\26\6\uffff\25\26\1\137\14\26\1\156\1\157\5\26\1\171"+
        "\2\26\1\174\1\26\1\176\3\26\1\u0082\3\26\1\u0087\15\26\1\u0096\1"+
        "\uffff\4\26\1\u009b\1\26\1\u009d\4\26\1\u00a2\2\26\2\uffff\11\26"+
        "\1\uffff\2\26\1\uffff\1\26\1\uffff\3\26\1\uffff\4\26\1\uffff\1\u00b8"+
        "\2\26\1\u00bb\1\u00bc\3\26\1\u00c0\2\26\1\u00c3\1\26\1\u00c5\1\uffff"+
        "\3\26\1\u00c9\1\uffff\1\u00ca\1\uffff\2\26\1\u00cd\1\u00ce\1\uffff"+
        "\11\26\1\u00d8\7\26\1\u00e1\2\26\1\u00e4\1\uffff\2\26\2\uffff\3"+
        "\26\1\uffff\2\26\1\uffff\1\u00ec\1\uffff\3\26\2\uffff\2\26\2\uffff"+
        "\1\26\1\u00f4\2\26\1\u00f7\2\26\1\u00fa\1\26\1\uffff\3\26\1\u00ff"+
        "\1\u0100\1\26\1\u0102\1\26\1\uffff\1\u0104\1\26\1\uffff\1\u0106"+
        "\1\u0107\4\26\1\u010c\1\uffff\5\26\1\u0112\1\26\1\uffff\2\26\1\uffff"+
        "\2\26\1\uffff\1\u0118\3\26\2\uffff\1\u011c\1\uffff\1\26\1\uffff"+
        "\1\u011e\2\uffff\1\u0120\3\26\1\uffff\4\26\1\u0128\1\uffff\3\26"+
        "\1\u012f\1\26\1\uffff\3\26\1\uffff\1\26\1\uffff\1\u0135\1\uffff"+
        "\2\26\1\u0138\1\u0139\1\u013a\1\u013b\1\26\1\uffff\1\26\1\u013e"+
        "\1\26\1\u0140\2\26\1\uffff\1\u0143\1\26\1\u0145\2\26\1\uffff\1\26"+
        "\1\u0149\4\uffff\2\26\1\uffff\1\26\1\uffff\2\26\1\uffff\1\26\1\uffff"+
        "\3\26\1\uffff\1\u0153\5\26\1\u0159\2\26\1\uffff\1\26\1\u015d\1\26"+
        "\1\u0160\1\26\1\uffff\2\26\1\u0164\1\uffff\1\u0166\1\u0167\1\uffff"+
        "\1\26\1\u0169\1\26\1\uffff\1\26\2\uffff\1\26\1\uffff\1\u016d\1\u016e"+
        "\1\26\2\uffff\5\26\1\u0175\1\uffff";
    static final String DFA7_eofS =
        "\u0176\uffff";
    static final String DFA7_minS =
        "\1\11\1\143\1\141\1\145\1\157\1\141\1\145\1\141\1\157\1\165\1\157"+
        "\1\151\1\145\2\141\1\146\1\141\1\165\1\151\1\163\6\uffff\1\143\1"+
        "\144\2\156\1\145\1\162\1\164\1\147\1\143\1\161\1\154\1\156\1\154"+
        "\1\142\1\144\1\162\1\155\1\151\1\145\1\157\1\171\1\56\1\162\1\163"+
        "\1\154\1\162\1\157\1\171\1\162\1\163\1\155\1\142\1\167\1\164\2\56"+
        "\1\163\1\145\1\141\1\143\1\141\1\56\2\145\1\56\1\143\1\56\1\156"+
        "\1\141\1\162\1\56\1\151\1\154\1\141\1\56\1\145\1\144\1\145\1\144"+
        "\1\163\1\165\1\163\1\145\1\141\1\142\1\164\1\162\1\153\1\56\1\uffff"+
        "\1\141\1\164\1\145\1\155\1\56\1\155\1\56\1\153\1\163\1\145\1\157"+
        "\1\56\1\151\1\145\2\uffff\1\163\1\146\1\143\1\144\1\156\1\164\1"+
        "\153\1\145\1\144\1\uffff\1\162\1\160\1\uffff\1\145\1\uffff\1\145"+
        "\1\164\1\145\1\uffff\1\156\1\165\1\141\1\160\1\uffff\1\56\1\157"+
        "\1\143\2\56\1\151\1\145\1\143\1\56\1\164\1\157\1\56\1\145\1\56\1"+
        "\uffff\1\164\2\156\1\56\1\uffff\1\56\1\uffff\1\145\1\141\2\56\1"+
        "\uffff\1\157\1\162\1\167\2\145\1\165\1\164\2\145\1\56\1\145\1\115"+
        "\1\164\1\154\1\143\1\145\1\156\1\56\1\164\1\143\1\56\1\uffff\1\155"+
        "\1\164\2\uffff\1\157\1\156\1\162\1\uffff\1\145\1\154\1\uffff\1\56"+
        "\1\uffff\1\151\2\141\2\uffff\1\164\1\147\2\uffff\1\156\1\56\1\157"+
        "\1\162\1\56\1\143\1\151\1\56\1\162\1\uffff\1\162\2\141\2\56\1\164"+
        "\1\56\1\164\1\uffff\1\56\1\145\1\uffff\2\56\1\156\1\143\1\151\1"+
        "\147\1\56\1\uffff\1\157\2\155\1\104\1\145\1\56\1\151\1\uffff\1\162"+
        "\1\145\1\uffff\2\164\1\uffff\1\56\1\120\1\155\1\162\2\uffff\1\56"+
        "\1\uffff\1\115\1\uffff\1\56\2\uffff\1\56\1\145\1\142\1\171\1\uffff"+
        "\1\156\2\145\1\141\1\56\1\uffff\1\163\1\144\1\156\1\56\1\171\1\uffff"+
        "\1\162\1\145\1\153\1\uffff\1\141\1\uffff\1\56\1\uffff\1\116\1\145"+
        "\4\56\1\164\1\uffff\1\164\1\56\1\143\1\56\1\154\1\171\1\uffff\1"+
        "\56\1\157\1\56\1\145\1\162\1\uffff\1\165\1\56\4\uffff\1\141\1\157"+
        "\1\uffff\1\145\1\uffff\1\141\1\160\1\uffff\1\144\1\uffff\1\164\1"+
        "\153\1\155\1\uffff\1\56\1\162\2\163\1\145\1\165\1\56\1\145\1\142"+
        "\1\uffff\1\171\1\56\1\163\1\56\1\143\1\uffff\1\164\1\145\1\56\1"+
        "\uffff\2\56\1\uffff\1\164\1\56\1\162\1\uffff\1\163\2\uffff\1\110"+
        "\1\uffff\2\56\1\151\2\uffff\1\163\1\164\1\157\1\162\1\171\1\56\1"+
        "\uffff";
    static final String DFA7_maxS =
        "\1\172\1\156\1\165\1\145\2\157\1\171\1\150\1\171\1\165\1\157\1"+
        "\162\3\145\2\162\1\165\1\162\1\163\6\uffff\1\143\1\144\1\163\1\156"+
        "\1\145\1\162\1\164\1\147\1\160\1\161\1\154\1\156\1\163\1\142\1\144"+
        "\1\162\1\155\1\151\1\145\1\157\1\171\1\172\1\162\1\163\2\162\1\157"+
        "\1\171\1\162\1\163\1\155\1\142\1\167\1\164\2\172\1\163\2\157\1\155"+
        "\1\141\1\172\2\145\1\172\1\143\1\172\1\156\1\141\1\162\1\172\1\157"+
        "\1\154\1\141\1\172\1\145\1\144\1\154\1\144\1\163\1\165\1\163\1\145"+
        "\1\141\1\142\1\164\1\162\1\153\1\172\1\uffff\1\141\1\164\1\145\1"+
        "\155\1\172\1\155\1\172\1\153\1\163\1\145\1\157\1\172\1\151\1\145"+
        "\2\uffff\1\163\1\146\1\143\1\144\1\156\1\164\1\153\1\145\1\144\1"+
        "\uffff\1\162\1\160\1\uffff\1\145\1\uffff\1\145\1\164\1\145\1\uffff"+
        "\1\156\1\165\1\141\1\160\1\uffff\1\172\1\157\1\143\2\172\1\151\1"+
        "\145\1\143\1\172\1\164\1\157\1\172\1\145\1\172\1\uffff\1\164\2\156"+
        "\1\172\1\uffff\1\172\1\uffff\1\145\1\141\2\172\1\uffff\1\157\1\162"+
        "\1\167\2\145\1\165\1\164\2\145\1\172\1\145\1\156\1\164\1\154\1\143"+
        "\1\145\1\156\1\172\1\164\1\143\1\172\1\uffff\1\155\1\164\2\uffff"+
        "\1\157\1\156\1\162\1\uffff\1\145\1\154\1\uffff\1\172\1\uffff\1\151"+
        "\2\141\2\uffff\1\164\1\147\2\uffff\1\156\1\172\1\157\1\162\1\172"+
        "\1\143\1\151\1\172\1\162\1\uffff\1\162\2\141\2\172\1\164\1\172\1"+
        "\164\1\uffff\1\172\1\145\1\uffff\2\172\1\156\1\143\1\151\1\147\1"+
        "\172\1\uffff\1\157\2\155\1\104\1\145\1\172\1\151\1\uffff\1\162\1"+
        "\145\1\uffff\2\164\1\uffff\1\172\1\120\1\155\1\162\2\uffff\1\172"+
        "\1\uffff\1\115\1\uffff\1\172\2\uffff\1\172\1\145\1\142\1\171\1\uffff"+
        "\1\156\2\145\1\141\1\172\1\uffff\1\163\1\144\1\156\1\172\1\171\1"+
        "\uffff\1\162\1\145\1\153\1\uffff\1\141\1\uffff\1\172\1\uffff\1\116"+
        "\1\145\4\172\1\164\1\uffff\1\164\1\172\1\143\1\172\1\154\1\171\1"+
        "\uffff\1\172\1\157\1\172\1\145\1\162\1\uffff\1\165\1\172\4\uffff"+
        "\1\141\1\157\1\uffff\1\145\1\uffff\1\141\1\160\1\uffff\1\144\1\uffff"+
        "\1\164\1\153\1\155\1\uffff\1\172\1\162\2\163\1\145\1\165\1\172\1"+
        "\145\1\142\1\uffff\1\171\1\172\1\163\1\172\1\143\1\uffff\1\164\1"+
        "\145\1\172\1\uffff\2\172\1\uffff\1\164\1\172\1\162\1\uffff\1\163"+
        "\2\uffff\1\110\1\uffff\2\172\1\151\2\uffff\1\163\1\164\1\157\1\162"+
        "\1\171\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\24\uffff\1\101\1\102\1\103\1\104\1\105\1\106\105\uffff\1\71\16"+
        "\uffff\1\77\1\74\11\uffff\1\75\2\uffff\1\76\1\uffff\1\17\3\uffff"+
        "\1\5\4\uffff\1\51\16\uffff\1\16\4\uffff\1\72\1\uffff\1\25\4\uffff"+
        "\1\70\25\uffff\1\52\2\uffff\1\53\1\12\3\uffff\1\57\2\uffff\1\14"+
        "\1\uffff\1\15\3\uffff\1\24\1\73\2\uffff\1\30\1\31\11\uffff\1\63"+
        "\10\uffff\1\6\2\uffff\1\50\7\uffff\1\100\7\uffff\1\33\2\uffff\1"+
        "\37\2\uffff\1\47\4\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\7\1\uffff"+
        "\1\67\1\11\4\uffff\1\61\5\uffff\1\32\5\uffff\1\62\3\uffff\1\3\1"+
        "\uffff\1\10\1\uffff\1\54\7\uffff\1\27\6\uffff\1\40\5\uffff\1\55"+
        "\2\uffff\1\60\1\20\1\21\1\23\2\uffff\1\35\1\uffff\1\41\2\uffff\1"+
        "\46\1\uffff\1\65\3\uffff\1\13\11\uffff\1\26\5\uffff\1\66\3\uffff"+
        "\1\36\2\uffff\1\44\3\uffff\1\34\1\uffff\1\42\1\45\1\uffff\1\22\3"+
        "\uffff\1\56\1\43\6\uffff\1\64";
    static final String DFA7_specialS =
        "\u0176\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\30\1\27\2\uffff\1\27\22\uffff\1\30\1\uffff\1\31\1\24\3\uffff"+
            "\1\31\6\uffff\1\26\1\uffff\12\26\3\uffff\1\25\3\uffff\32\26"+
            "\4\uffff\1\26\1\uffff\1\1\1\10\1\2\1\11\1\26\1\13\1\3\1\12\2"+
            "\26\1\14\1\4\1\15\1\16\1\17\1\20\1\21\1\5\1\6\1\22\1\23\1\26"+
            "\1\7\3\26",
            "\1\32\12\uffff\1\33",
            "\1\34\15\uffff\1\35\2\uffff\1\36\2\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\45\3\uffff\1\42\1\43\10\uffff\1\44",
            "\1\46\3\uffff\1\50\12\uffff\1\51\1\47\3\uffff\1\52",
            "\1\53\6\uffff\1\54",
            "\1\55\5\uffff\1\56\3\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62\5\uffff\1\63\2\uffff\1\64",
            "\1\65",
            "\1\66\3\uffff\1\67",
            "\1\70\1\71\2\uffff\1\72",
            "\1\75\11\uffff\1\73\1\uffff\1\74",
            "\1\76\20\uffff\1\77",
            "\1\100",
            "\1\101\5\uffff\1\103\2\uffff\1\102",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107\4\uffff\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\14\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\1\uffff\1\124\2\uffff\1\126\1\uffff\1\125",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\140",
            "\1\141",
            "\1\142\5\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\3\26"+
            "\1\155\26\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\160",
            "\1\161\3\uffff\1\162\5\uffff\1\163",
            "\1\164\15\uffff\1\165",
            "\1\166\11\uffff\1\167",
            "\1\170",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\172",
            "\1\173",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\175",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0083\5\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\6\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u009c",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00b9",
            "\1\u00ba",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c1",
            "\1\u00c2",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c4",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00d9",
            "\1\u00db\40\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00e2",
            "\1\u00e3",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "",
            "\1\u00f2",
            "\1\26\1\uffff\12\26\7\uffff\7\26\1\u00f3\22\26\4\uffff\1\26"+
            "\1\uffff\32\26",
            "\1\u00f5",
            "\1\u00f6",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00f8",
            "\1\u00f9",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0101",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0103",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0105",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0113",
            "",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u011d",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22"+
            "\26\1\u011f\7\26",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\26\1\uffff\12\26\7\uffff\2\26\1\u012d\20\26\1\u012e\6\26"+
            "\4\uffff\1\26\1\uffff\22\26\1\u012c\7\26",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u013f",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0144",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "",
            "",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u015e",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22"+
            "\26\1\u015f\7\26",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26"+
            "\1\u0165\25\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u0168",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u016a",
            "",
            "\1\u016b",
            "",
            "",
            "\1\u016c",
            "",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u016f",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\26\1\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT | BOOK | BUY | CAS | DURATION | HOSTNAME | CURRENT_MARKET | FILENAME | FIRM | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUANTITY | QUOTE | RECAP | RFQ | ROLE | SELL | SESSION | SESSIONS | SEQUENCE_NUMBER | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET | RANDOM | NEW | BY | FOR | FROM | OF | TO | AND | OR | WHERE | COMMENT | T__73 | FILE | NEWLINE | WS | QVALUE );";
        }
    }
 

}