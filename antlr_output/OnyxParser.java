// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\projects\\workspace\\onyx\\Onyx.g 2011-04-20 15:53:14

package com.cboe.onyx;
import com.cboe.onyx.verb.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class OnyxParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "CANCEL", "CONNECT", "CREATE", "GET", "LOGIN", "LOGOUT", "REPLACE", "SELECT", "SEND", "SUBSCRIBE", "WAIT", "CAS", "DURATION", "HOSTNAME", "BOOK", "CURRENT_MARKET", "FILENAME", "FIRM", "KEY", "MARKET_DATA", "MESSAGE", "NAME", "NBBO", "OPTION", "ORDER", "ORDER_HISTORY", "PASSWORD", "PREFERENCES", "PRICE", "PRODUCT", "PRODUCTS", "PRODUCT_CLASS", "PRODUCT_CLASSES", "PRODUCT_TYPE", "PRODUCT_TYPES", "QUOTE", "RECAP", "RFQ", "ROLE", "SESSION", "SESSIONS", "SIDE", "STRATEGY", "SYMBOL", "TICKER", "TIME", "TRADER_PRODUCT_HISTORY", "USERNAME", "USER_MARKET", "RANDOM", "NEW", "BY", "FOR", "FROM", "OF", "TO", "AND", "OR", "WHERE", "COMMENT", "NEWLINE", "WS", "QVALUE", "FILE", "'='"
    };
    public static final int EOF=-1;
    public static final int T__69=69;
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
    public static final int CAS=16;
    public static final int DURATION=17;
    public static final int HOSTNAME=18;
    public static final int BOOK=19;
    public static final int CURRENT_MARKET=20;
    public static final int FILENAME=21;
    public static final int FIRM=22;
    public static final int KEY=23;
    public static final int MARKET_DATA=24;
    public static final int MESSAGE=25;
    public static final int NAME=26;
    public static final int NBBO=27;
    public static final int OPTION=28;
    public static final int ORDER=29;
    public static final int ORDER_HISTORY=30;
    public static final int PASSWORD=31;
    public static final int PREFERENCES=32;
    public static final int PRICE=33;
    public static final int PRODUCT=34;
    public static final int PRODUCTS=35;
    public static final int PRODUCT_CLASS=36;
    public static final int PRODUCT_CLASSES=37;
    public static final int PRODUCT_TYPE=38;
    public static final int PRODUCT_TYPES=39;
    public static final int QUOTE=40;
    public static final int RECAP=41;
    public static final int RFQ=42;
    public static final int ROLE=43;
    public static final int SESSION=44;
    public static final int SESSIONS=45;
    public static final int SIDE=46;
    public static final int STRATEGY=47;
    public static final int SYMBOL=48;
    public static final int TICKER=49;
    public static final int TIME=50;
    public static final int TRADER_PRODUCT_HISTORY=51;
    public static final int USERNAME=52;
    public static final int USER_MARKET=53;
    public static final int RANDOM=54;
    public static final int NEW=55;
    public static final int BY=56;
    public static final int FOR=57;
    public static final int FROM=58;
    public static final int OF=59;
    public static final int TO=60;
    public static final int AND=61;
    public static final int OR=62;
    public static final int WHERE=63;
    public static final int COMMENT=64;
    public static final int NEWLINE=65;
    public static final int WS=66;
    public static final int QVALUE=67;
    public static final int FILE=68;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "whereClause", "nounAdjectivesPhrase", "conjunction", 
        "sentence", "keyVal", "verb", "noun", "directObjectPhrase", "preposition", 
        "command", "adjective", "comment", "nounPhrase", "prepositionalPhrase"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public OnyxParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public OnyxParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public OnyxParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return OnyxParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\onyx\\Onyx.g"; }


    //private List<Integer[]> sentences;


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // C:\\projects\\workspace\\onyx\\Onyx.g:93:1: command : ( NEWLINE )* ( sentence | comment ) ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF ;
    public final OnyxParser.command_return command() throws RecognitionException {
        OnyxParser.command_return retval = new OnyxParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE1=null;
        Token NEWLINE4=null;
        Token NEWLINE7=null;
        Token EOF8=null;
        OnyxParser.sentence_return sentence2 = null;

        OnyxParser.comment_return comment3 = null;

        OnyxParser.sentence_return sentence5 = null;

        OnyxParser.comment_return comment6 = null;


        Object NEWLINE1_tree=null;
        Object NEWLINE4_tree=null;
        Object NEWLINE7_tree=null;
        Object EOF8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:94:3: ( ( NEWLINE )* ( sentence | comment ) ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:94:5: ( NEWLINE )* ( sentence | comment ) ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(94,12);
            // C:\\projects\\workspace\\onyx\\Onyx.g:94:12: ( NEWLINE )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:12: NEWLINE
            	    {
            	    dbg.location(94,12);
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command629); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(94,15);
            // C:\\projects\\workspace\\onyx\\Onyx.g:94:15: ( sentence | comment )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=ACCEPT && LA2_0<=WAIT)||LA2_0==WS) ) {
                alt2=1;
            }
            else if ( (LA2_0==COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:94:16: sentence
                    {
                    dbg.location(94,16);
                    pushFollow(FOLLOW_sentence_in_command634);
                    sentence2=sentence();

                    state._fsp--;

                    adaptor.addChild(root_0, sentence2.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:94:26: comment
                    {
                    dbg.location(94,33);
                    pushFollow(FOLLOW_comment_in_command637);
                    comment3=comment();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(94,36);
            // C:\\projects\\workspace\\onyx\\Onyx.g:94:36: ( ( NEWLINE )+ ( sentence | comment ) )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                try {
                    isCyclicDecision = true;
                    alt5 = dfa5.predict(input);
                }
                catch (NoViableAltException nvae) {
                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:37: ( NEWLINE )+ ( sentence | comment )
            	    {
            	    dbg.location(94,44);
            	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:44: ( NEWLINE )+
            	    int cnt3=0;
            	    try { dbg.enterSubRule(3);

            	    loop3:
            	    do {
            	        int alt3=2;
            	        try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==NEWLINE) ) {
            	            alt3=1;
            	        }


            	        } finally {dbg.exitDecision(3);}

            	        switch (alt3) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:44: NEWLINE
            	    	    {
            	    	    dbg.location(94,44);
            	    	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command642); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(3);}

            	    dbg.location(94,47);
            	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:47: ( sentence | comment )
            	    int alt4=2;
            	    try { dbg.enterSubRule(4);
            	    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            	    int LA4_0 = input.LA(1);

            	    if ( ((LA4_0>=ACCEPT && LA4_0<=WAIT)||LA4_0==WS) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==COMMENT) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(4);}

            	    switch (alt4) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\projects\\workspace\\onyx\\Onyx.g:94:48: sentence
            	            {
            	            dbg.location(94,48);
            	            pushFollow(FOLLOW_sentence_in_command647);
            	            sentence5=sentence();

            	            state._fsp--;

            	            adaptor.addChild(root_0, sentence5.getTree());

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\projects\\workspace\\onyx\\Onyx.g:94:57: comment
            	            {
            	            dbg.location(94,64);
            	            pushFollow(FOLLOW_comment_in_command649);
            	            comment6=comment();

            	            state._fsp--;


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(4);}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}

            dbg.location(94,76);
            // C:\\projects\\workspace\\onyx\\Onyx.g:94:76: ( NEWLINE )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:94:76: NEWLINE
            	    {
            	    dbg.location(94,76);
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command655); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(94,82);
            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_command659); 
            dbg.location(95,3);

                System.out.println(input.toString(retval.start,input.LT(-1)));
              

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(98, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // C:\\projects\\workspace\\onyx\\Onyx.g:100:1: comment : COMMENT (~ NEWLINE )* ;
    public final OnyxParser.comment_return comment() throws RecognitionException {
        OnyxParser.comment_return retval = new OnyxParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMENT9=null;
        Token set10=null;

        Object COMMENT9_tree=null;
        Object set10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:101:3: ( COMMENT (~ NEWLINE )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:101:5: COMMENT (~ NEWLINE )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(101,5);
            COMMENT9=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment680); 
            COMMENT9_tree = (Object)adaptor.create(COMMENT9);
            adaptor.addChild(root_0, COMMENT9_tree);

            dbg.location(101,13);
            // C:\\projects\\workspace\\onyx\\Onyx.g:101:13: (~ NEWLINE )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=ACCEPT && LA7_0<=COMMENT)||(LA7_0>=WS && LA7_0<=69)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:101:14: ~ NEWLINE
            	    {
            	    dbg.location(101,14);
            	    set10=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ACCEPT && input.LA(1)<=COMMENT)||(input.LA(1)>=WS && input.LA(1)<=69) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set10));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(102,3);

                System.out.println("UNPARSED COMMENT: "+input.toString(retval.start,input.LT(-1)));
              

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(105, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comment"

    public static class sentence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentence"
    // C:\\projects\\workspace\\onyx\\Onyx.g:107:1: sentence : ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )? ;
    public final OnyxParser.sentence_return sentence() throws RecognitionException {
        OnyxParser.sentence_return retval = new OnyxParser.sentence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS11=null;
        Token WS13=null;
        Token WS15=null;
        Token WS17=null;
        Token WS19=null;
        OnyxParser.verb_return verb12 = null;

        OnyxParser.directObjectPhrase_return directObjectPhrase14 = null;

        OnyxParser.prepositionalPhrase_return prepositionalPhrase16 = null;

        OnyxParser.whereClause_return whereClause18 = null;


        Object WS11_tree=null;
        Object WS13_tree=null;
        Object WS15_tree=null;
        Object WS17_tree=null;
        Object WS19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sentence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:108:1: ( ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )? )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:108:3: ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(108,5);
            // C:\\projects\\workspace\\onyx\\Onyx.g:108:5: ( WS )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==WS) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:108:5: WS
                    {
                    dbg.location(108,5);
                    WS11=(Token)match(input,WS,FOLLOW_WS_in_sentence702); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(108,12);
            pushFollow(FOLLOW_verb_in_sentence706);
            verb12=verb();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(verb12.getTree(), root_0);
            dbg.location(108,14);
            // C:\\projects\\workspace\\onyx\\Onyx.g:108:14: ( WS directObjectPhrase )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==WS) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=CAS && LA9_1<=NEW)) ) {
                    alt9=1;
                }
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:108:15: WS directObjectPhrase
                    {
                    dbg.location(108,17);
                    WS13=(Token)match(input,WS,FOLLOW_WS_in_sentence710); 
                    dbg.location(108,19);
                    pushFollow(FOLLOW_directObjectPhrase_in_sentence713);
                    directObjectPhrase14=directObjectPhrase();

                    state._fsp--;

                    adaptor.addChild(root_0, directObjectPhrase14.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(108,40);
            // C:\\projects\\workspace\\onyx\\Onyx.g:108:40: ( ( WS prepositionalPhrase ) | ( WS whereClause ) )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=3;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==WS) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=BY && LA10_1<=TO)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_1==WHERE) ) {
                        alt10=2;
                    }


                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:41: ( WS prepositionalPhrase )
            	    {
            	    dbg.location(108,41);
            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:41: ( WS prepositionalPhrase )
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:42: WS prepositionalPhrase
            	    {
            	    dbg.location(108,44);
            	    WS15=(Token)match(input,WS,FOLLOW_WS_in_sentence719); 
            	    dbg.location(108,46);
            	    pushFollow(FOLLOW_prepositionalPhrase_in_sentence722);
            	    prepositionalPhrase16=prepositionalPhrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepositionalPhrase16.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:67: ( WS whereClause )
            	    {
            	    dbg.location(108,67);
            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:67: ( WS whereClause )
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:108:68: WS whereClause
            	    {
            	    dbg.location(108,70);
            	    WS17=(Token)match(input,WS,FOLLOW_WS_in_sentence726); 
            	    dbg.location(108,72);
            	    pushFollow(FOLLOW_whereClause_in_sentence729);
            	    whereClause18=whereClause();

            	    state._fsp--;

            	    adaptor.addChild(root_0, whereClause18.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}

            dbg.location(108,89);
            // C:\\projects\\workspace\\onyx\\Onyx.g:108:89: ( WS )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==WS) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:108:89: WS
                    {
                    dbg.location(108,89);
                    WS19=(Token)match(input,WS,FOLLOW_WS_in_sentence734); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(109,1);

            System.out.println(input.toString(retval.start,input.LT(-1)));


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sentence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sentence"

    public static class directObjectPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directObjectPhrase"
    // C:\\projects\\workspace\\onyx\\Onyx.g:114:1: directObjectPhrase : nounPhrase ;
    public final OnyxParser.directObjectPhrase_return directObjectPhrase() throws RecognitionException {
        OnyxParser.directObjectPhrase_return retval = new OnyxParser.directObjectPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OnyxParser.nounPhrase_return nounPhrase20 = null;



        try { dbg.enterRule(getGrammarFileName(), "directObjectPhrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:115:1: ( nounPhrase )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:115:3: nounPhrase
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(115,3);
            pushFollow(FOLLOW_nounPhrase_in_directObjectPhrase749);
            nounPhrase20=nounPhrase();

            state._fsp--;

            adaptor.addChild(root_0, nounPhrase20.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(116, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "directObjectPhrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "directObjectPhrase"

    public static class prepositionalPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepositionalPhrase"
    // C:\\projects\\workspace\\onyx\\Onyx.g:118:1: prepositionalPhrase : preposition WS nounPhrase ;
    public final OnyxParser.prepositionalPhrase_return prepositionalPhrase() throws RecognitionException {
        OnyxParser.prepositionalPhrase_return retval = new OnyxParser.prepositionalPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS22=null;
        OnyxParser.preposition_return preposition21 = null;

        OnyxParser.nounPhrase_return nounPhrase23 = null;


        Object WS22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prepositionalPhrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:119:1: ( preposition WS nounPhrase )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:119:3: preposition WS nounPhrase
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(119,14);
            pushFollow(FOLLOW_preposition_in_prepositionalPhrase758);
            preposition21=preposition();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(preposition21.getTree(), root_0);
            dbg.location(119,18);
            WS22=(Token)match(input,WS,FOLLOW_WS_in_prepositionalPhrase761); 
            dbg.location(119,20);
            pushFollow(FOLLOW_nounPhrase_in_prepositionalPhrase764);
            nounPhrase23=nounPhrase();

            state._fsp--;

            adaptor.addChild(root_0, nounPhrase23.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(120, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prepositionalPhrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prepositionalPhrase"

    public static class nounPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nounPhrase"
    // C:\\projects\\workspace\\onyx\\Onyx.g:122:1: nounPhrase : nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )* ;
    public final OnyxParser.nounPhrase_return nounPhrase() throws RecognitionException {
        OnyxParser.nounPhrase_return retval = new OnyxParser.nounPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS25=null;
        Token WS27=null;
        OnyxParser.nounAdjectivesPhrase_return nounAdjectivesPhrase24 = null;

        OnyxParser.conjunction_return conjunction26 = null;

        OnyxParser.nounAdjectivesPhrase_return nounAdjectivesPhrase28 = null;


        Object WS25_tree=null;
        Object WS27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nounPhrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:123:1: ( nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:123:4: nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(123,4);
            pushFollow(FOLLOW_nounAdjectivesPhrase_in_nounPhrase774);
            nounAdjectivesPhrase24=nounAdjectivesPhrase();

            state._fsp--;

            adaptor.addChild(root_0, nounAdjectivesPhrase24.getTree());
            dbg.location(123,25);
            // C:\\projects\\workspace\\onyx\\Onyx.g:123:25: ( WS conjunction WS nounAdjectivesPhrase )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=AND && LA12_1<=OR)) ) {
                        alt12=1;
                    }


                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:123:26: WS conjunction WS nounAdjectivesPhrase
            	    {
            	    dbg.location(123,28);
            	    WS25=(Token)match(input,WS,FOLLOW_WS_in_nounPhrase777); 
            	    dbg.location(123,41);
            	    pushFollow(FOLLOW_conjunction_in_nounPhrase780);
            	    conjunction26=conjunction();

            	    state._fsp--;

            	    dbg.location(123,45);
            	    WS27=(Token)match(input,WS,FOLLOW_WS_in_nounPhrase783); 
            	    dbg.location(123,47);
            	    pushFollow(FOLLOW_nounAdjectivesPhrase_in_nounPhrase786);
            	    nounAdjectivesPhrase28=nounAdjectivesPhrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nounAdjectivesPhrase28.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(124, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nounPhrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nounPhrase"

    public static class nounAdjectivesPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nounAdjectivesPhrase"
    // C:\\projects\\workspace\\onyx\\Onyx.g:126:1: nounAdjectivesPhrase : ( adjective WS )* noun ;
    public final OnyxParser.nounAdjectivesPhrase_return nounAdjectivesPhrase() throws RecognitionException {
        OnyxParser.nounAdjectivesPhrase_return retval = new OnyxParser.nounAdjectivesPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS30=null;
        OnyxParser.adjective_return adjective29 = null;

        OnyxParser.noun_return noun31 = null;


        Object WS30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "nounAdjectivesPhrase");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:127:1: ( ( adjective WS )* noun )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:127:3: ( adjective WS )* noun
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,3);
            // C:\\projects\\workspace\\onyx\\Onyx.g:127:3: ( adjective WS )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RANDOM && LA13_0<=NEW)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:127:4: adjective WS
            	    {
            	    dbg.location(127,4);
            	    pushFollow(FOLLOW_adjective_in_nounAdjectivesPhrase799);
            	    adjective29=adjective();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adjective29.getTree());
            	    dbg.location(127,16);
            	    WS30=(Token)match(input,WS,FOLLOW_WS_in_nounAdjectivesPhrase801); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(127,24);
            pushFollow(FOLLOW_noun_in_nounAdjectivesPhrase806);
            noun31=noun();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(noun31.getTree(), root_0);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(128, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nounAdjectivesPhrase");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nounAdjectivesPhrase"

    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // C:\\projects\\workspace\\onyx\\Onyx.g:130:1: whereClause : WHERE WS keyVal ( WS keyVal )* ;
    public final OnyxParser.whereClause_return whereClause() throws RecognitionException {
        OnyxParser.whereClause_return retval = new OnyxParser.whereClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE32=null;
        Token WS33=null;
        Token WS35=null;
        OnyxParser.keyVal_return keyVal34 = null;

        OnyxParser.keyVal_return keyVal36 = null;


        Object WHERE32_tree=null;
        Object WS33_tree=null;
        Object WS35_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whereClause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:131:3: ( WHERE WS keyVal ( WS keyVal )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:131:5: WHERE WS keyVal ( WS keyVal )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(131,10);
            WHERE32=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause818); 
            WHERE32_tree = (Object)adaptor.create(WHERE32);
            root_0 = (Object)adaptor.becomeRoot(WHERE32_tree, root_0);

            dbg.location(131,14);
            WS33=(Token)match(input,WS,FOLLOW_WS_in_whereClause821); 
            dbg.location(131,16);
            pushFollow(FOLLOW_keyVal_in_whereClause824);
            keyVal34=keyVal();

            state._fsp--;

            adaptor.addChild(root_0, keyVal34.getTree());
            dbg.location(131,23);
            // C:\\projects\\workspace\\onyx\\Onyx.g:131:23: ( WS keyVal )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=CAS && LA14_1<=USER_MARKET)) ) {
                        alt14=1;
                    }


                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Onyx.g:131:24: WS keyVal
            	    {
            	    dbg.location(131,26);
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_whereClause827); 
            	    dbg.location(131,28);
            	    pushFollow(FOLLOW_keyVal_in_whereClause830);
            	    keyVal36=keyVal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, keyVal36.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(132, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whereClause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whereClause"

    public static class keyVal_return extends ParserRuleReturnScope {
        public String key;
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyVal"
    // C:\\projects\\workspace\\onyx\\Onyx.g:134:1: keyVal returns [String key, String val] : a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun ) ;
    public final OnyxParser.keyVal_return keyVal() throws RecognitionException {
        OnyxParser.keyVal_return retval = new OnyxParser.keyVal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token b=null;
        Token WS37=null;
        Token char_literal38=null;
        Token WS39=null;
        Token QVALUE40=null;
        OnyxParser.noun_return a = null;

        OnyxParser.noun_return noun41 = null;


        Object b_tree=null;
        Object WS37_tree=null;
        Object char_literal38_tree=null;
        Object WS39_tree=null;
        Object QVALUE40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "keyVal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:135:1: (a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun ) )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:135:3: a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(135,4);
            pushFollow(FOLLOW_noun_in_keyVal849);
            a=noun();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(a.getTree(), root_0);
            dbg.location(135,13);
            // C:\\projects\\workspace\\onyx\\Onyx.g:135:13: ( WS )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==WS) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:135:13: WS
                    {
                    dbg.location(135,13);
                    WS37=(Token)match(input,WS,FOLLOW_WS_in_keyVal852); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(135,19);
            char_literal38=(Token)match(input,69,FOLLOW_69_in_keyVal856); 
            dbg.location(135,23);
            // C:\\projects\\workspace\\onyx\\Onyx.g:135:23: ( WS )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==WS) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:135:23: WS
                    {
                    dbg.location(135,23);
                    WS39=(Token)match(input,WS,FOLLOW_WS_in_keyVal859); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(135,27);
            // C:\\projects\\workspace\\onyx\\Onyx.g:135:28: ( QVALUE | noun )
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==QVALUE) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=CAS && LA17_0<=USER_MARKET)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:135:29: QVALUE
                    {
                    dbg.location(135,29);
                    QVALUE40=(Token)match(input,QVALUE,FOLLOW_QVALUE_in_keyVal866); 
                    QVALUE40_tree = (Object)adaptor.create(QVALUE40);
                    adaptor.addChild(root_0, QVALUE40_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\onyx\\Onyx.g:135:36: noun
                    {
                    dbg.location(135,36);
                    pushFollow(FOLLOW_noun_in_keyVal868);
                    noun41=noun();

                    state._fsp--;

                    adaptor.addChild(root_0, noun41.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}

            dbg.location(135,42);
            retval.key = (a!=null?input.toString(a.start,a.stop):null); retval.val = (b!=null?b.getText():null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(136, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "keyVal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "keyVal"

    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // C:\\projects\\workspace\\onyx\\Onyx.g:138:1: verb : ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT );
    public final OnyxParser.verb_return verb() throws RecognitionException {
        OnyxParser.verb_return retval = new OnyxParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "verb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:139:3: ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,3);
            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=ACCEPT && input.LA(1)<=WAIT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set42));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(151, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "verb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "verb"

    public static class noun_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "noun"
    // C:\\projects\\workspace\\onyx\\Onyx.g:153:1: noun : ( BOOK | CAS | CURRENT_MARKET | DURATION | FILENAME | FIRM | HOSTNAME | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUOTE | RECAP | RFQ | ROLE | SESSION | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET | SESSIONS );
    public final OnyxParser.noun_return noun() throws RecognitionException {
        OnyxParser.noun_return retval = new OnyxParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:154:3: ( BOOK | CAS | CURRENT_MARKET | DURATION | FILENAME | FIRM | HOSTNAME | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUOTE | RECAP | RFQ | ROLE | SESSION | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET | SESSIONS )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(154,3);
            set43=(Token)input.LT(1);
            if ( (input.LA(1)>=CAS && input.LA(1)<=USER_MARKET) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set43));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(192, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "noun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "noun"

    public static class conjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // C:\\projects\\workspace\\onyx\\Onyx.g:194:1: conjunction : ( AND | OR );
    public final OnyxParser.conjunction_return conjunction() throws RecognitionException {
        OnyxParser.conjunction_return retval = new OnyxParser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;

        Object set44_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "conjunction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:195:1: ( AND | OR )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(195,1);
            set44=(Token)input.LT(1);
            if ( (input.LA(1)>=AND && input.LA(1)<=OR) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set44));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(197, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conjunction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conjunction"

    public static class preposition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preposition"
    // C:\\projects\\workspace\\onyx\\Onyx.g:199:1: preposition : ( BY | FOR | FROM | OF | TO );
    public final OnyxParser.preposition_return preposition() throws RecognitionException {
        OnyxParser.preposition_return retval = new OnyxParser.preposition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "preposition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:200:1: ( BY | FOR | FROM | OF | TO )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(200,1);
            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=BY && input.LA(1)<=TO) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set45));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(205, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "preposition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "preposition"

    public static class adjective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adjective"
    // C:\\projects\\workspace\\onyx\\Onyx.g:207:1: adjective : ( RANDOM | NEW );
    public final OnyxParser.adjective_return adjective() throws RecognitionException {
        OnyxParser.adjective_return retval = new OnyxParser.adjective_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "adjective");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Onyx.g:208:1: ( RANDOM | NEW )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(208,1);
            set46=(Token)input.LT(1);
            if ( (input.LA(1)>=RANDOM && input.LA(1)<=NEW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set46));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(210, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "adjective");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "adjective"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\2\2\2\uffff";
    static final String DFA5_minS =
        "\1\101\1\4\2\uffff";
    static final String DFA5_maxS =
        "\1\101\1\102\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\14\3\60\uffff\1\3\1\1\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 94:36: ( ( NEWLINE )+ ( sentence | comment ) )*";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_NEWLINE_in_command629 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_sentence_in_command634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_command637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_command642 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_sentence_in_command647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_command649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_command655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_command659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_comment680 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003DL});
    public static final BitSet FOLLOW_set_in_comment683 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000000000003DL});
    public static final BitSet FOLLOW_WS_in_sentence702 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000004L});
    public static final BitSet FOLLOW_verb_in_sentence706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_sentence710 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_directObjectPhrase_in_sentence713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_sentence719 = new BitSet(new long[]{0x1F00000000000000L});
    public static final BitSet FOLLOW_prepositionalPhrase_in_sentence722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_sentence726 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_whereClause_in_sentence729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_sentence734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounPhrase_in_directObjectPhrase749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_prepositionalPhrase758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_prepositionalPhrase761 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_nounPhrase_in_prepositionalPhrase764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounAdjectivesPhrase_in_nounPhrase774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_nounPhrase777 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_conjunction_in_nounPhrase780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_nounPhrase783 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_nounAdjectivesPhrase_in_nounPhrase786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_adjective_in_nounAdjectivesPhrase799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_nounAdjectivesPhrase801 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_noun_in_nounAdjectivesPhrase806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_whereClause821 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_keyVal_in_whereClause824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_whereClause827 = new BitSet(new long[]{0x00FFFFFFFFFF0000L});
    public static final BitSet FOLLOW_keyVal_in_whereClause830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_noun_in_keyVal849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_keyVal852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_keyVal856 = new BitSet(new long[]{0x00FFFFFFFFFF0000L,0x000000000000000CL});
    public static final BitSet FOLLOW_WS_in_keyVal859 = new BitSet(new long[]{0x00FFFFFFFFFF0000L,0x0000000000000008L});
    public static final BitSet FOLLOW_QVALUE_in_keyVal866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_keyVal868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verb0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_noun0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conjunction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preposition0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_adjective0 = new BitSet(new long[]{0x0000000000000002L});

}