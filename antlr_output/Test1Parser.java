// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\projects\\workspace\\onyx\\Test1.g 2011-04-14 15:11:34

package com.cboe.onyx;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class Test1Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LOGIN", "USERNAME", "PASSWORD", "WHERE", "WS", "VALUE", "NEWLINE", "'='"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int LOGIN=4;
    public static final int USERNAME=5;
    public static final int PASSWORD=6;
    public static final int WHERE=7;
    public static final int WS=8;
    public static final int VALUE=9;
    public static final int NEWLINE=10;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "testerPREV4", "testerPREV2", "testerPREV", "noun", 
        "testerPREV6", "tester", "keyValue", "mapper", "testerPREV3", "testerPREV5"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public Test1Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public Test1Parser(TokenStream input, int port, RecognizerSharedState state) {
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
    public Test1Parser(TokenStream input, DebugEventListener dbg) {
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


    public String[] getTokenNames() { return Test1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\onyx\\Test1.g"; }


    private Map<String, String> _map = new HashMap<String,String>();


    public static class tester_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tester"
    // C:\\projects\\workspace\\onyx\\Test1.g:31:1: tester : a= noun WS b= VALUE ;
    public final Test1Parser.tester_return tester() throws RecognitionException {
        Test1Parser.tester_return retval = new Test1Parser.tester_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token b=null;
        Token WS1=null;
        Test1Parser.noun_return a = null;


        Object b_tree=null;
        Object WS1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "tester");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:32:2: (a= noun WS b= VALUE )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:32:4: a= noun WS b= VALUE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(32,5);
            pushFollow(FOLLOW_noun_in_tester89);
            a=noun();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());
            dbg.location(32,13);
            WS1=(Token)match(input,WS,FOLLOW_WS_in_tester91); 
            dbg.location(32,16);
            b=(Token)match(input,VALUE,FOLLOW_VALUE_in_tester96); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);

            dbg.location(33,2);

            		System.out.println("PARSER: " + (a!=null?input.toString(a.start,a.stop):null)+" "+(b!=null?b.getText():null));
            	

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
        dbg.location(36, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tester");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "tester"

    public static class testerPREV6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV6"
    // C:\\projects\\workspace\\onyx\\Test1.g:38:1: testerPREV6 : a= VALUE WS b= VALUE ;
    public final Test1Parser.testerPREV6_return testerPREV6() throws RecognitionException {
        Test1Parser.testerPREV6_return retval = new Test1Parser.testerPREV6_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token WS2=null;

        Object a_tree=null;
        Object b_tree=null;
        Object WS2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV6");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:39:2: (a= VALUE WS b= VALUE )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:39:4: a= VALUE WS b= VALUE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(39,5);
            a=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV6112); 
            a_tree = (Object)adaptor.create(a);
            adaptor.addChild(root_0, a_tree);

            dbg.location(39,14);
            WS2=(Token)match(input,WS,FOLLOW_WS_in_testerPREV6114); 
            dbg.location(39,17);
            b=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV6119); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);

            dbg.location(40,2);

            		System.out.println("PARSER: "+(a!=null?a.getText():null)+(b!=null?b.getText():null));
            	

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
        dbg.location(43, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV6");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV6"

    public static class testerPREV5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV5"
    // C:\\projects\\workspace\\onyx\\Test1.g:45:1: testerPREV5 : a= noun ( WS )? '=' ( WS )? b= VALUE EOF ;
    public final Test1Parser.testerPREV5_return testerPREV5() throws RecognitionException {
        Test1Parser.testerPREV5_return retval = new Test1Parser.testerPREV5_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token b=null;
        Token WS3=null;
        Token char_literal4=null;
        Token WS5=null;
        Token EOF6=null;
        Test1Parser.noun_return a = null;


        Object b_tree=null;
        Object WS3_tree=null;
        Object char_literal4_tree=null;
        Object WS5_tree=null;
        Object EOF6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV5");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:46:2: (a= noun ( WS )? '=' ( WS )? b= VALUE EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:46:4: a= noun ( WS )? '=' ( WS )? b= VALUE EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(46,5);
            pushFollow(FOLLOW_noun_in_testerPREV5135);
            a=noun();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());
            dbg.location(46,13);
            // C:\\projects\\workspace\\onyx\\Test1.g:46:13: ( WS )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==WS) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Test1.g:46:13: WS
                    {
                    dbg.location(46,13);
                    WS3=(Token)match(input,WS,FOLLOW_WS_in_testerPREV5137); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(46,19);
            char_literal4=(Token)match(input,11,FOLLOW_11_in_testerPREV5141); 
            dbg.location(46,23);
            // C:\\projects\\workspace\\onyx\\Test1.g:46:23: ( WS )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==WS) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Test1.g:46:23: WS
                    {
                    dbg.location(46,23);
                    WS5=(Token)match(input,WS,FOLLOW_WS_in_testerPREV5144); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(46,27);
            b=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV5150); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);

            dbg.location(46,37);
            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_testerPREV5152); 
            dbg.location(47,2);

            		System.out.println((a!=null?input.toString(a.start,a.stop):null) +"="+ (b!=null?b.getText():null));
            	

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
        dbg.location(50, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV5");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV5"

    public static class testerPREV4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV4"
    // C:\\projects\\workspace\\onyx\\Test1.g:52:1: testerPREV4 : a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF ;
    public final Test1Parser.testerPREV4_return testerPREV4() throws RecognitionException {
        Test1Parser.testerPREV4_return retval = new Test1Parser.testerPREV4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token b=null;
        Token d=null;
        Token char_literal7=null;
        Token WS8=null;
        Token char_literal9=null;
        Token EOF10=null;
        Test1Parser.noun_return a = null;

        Test1Parser.noun_return c = null;


        Object b_tree=null;
        Object d_tree=null;
        Object char_literal7_tree=null;
        Object WS8_tree=null;
        Object char_literal9_tree=null;
        Object EOF10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:53:2: (a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:53:4: a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(53,5);
            pushFollow(FOLLOW_noun_in_testerPREV4169);
            a=noun();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());
            dbg.location(53,14);
            char_literal7=(Token)match(input,11,FOLLOW_11_in_testerPREV4171); 
            dbg.location(53,17);
            b=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV4176); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);

            dbg.location(53,26);
            WS8=(Token)match(input,WS,FOLLOW_WS_in_testerPREV4178); 
            dbg.location(53,29);
            pushFollow(FOLLOW_noun_in_testerPREV4183);
            c=noun();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());
            dbg.location(53,38);
            char_literal9=(Token)match(input,11,FOLLOW_11_in_testerPREV4185); 
            dbg.location(53,41);
            d=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV4190); 
            d_tree = (Object)adaptor.create(d);
            adaptor.addChild(root_0, d_tree);

            dbg.location(53,51);
            EOF10=(Token)match(input,EOF,FOLLOW_EOF_in_testerPREV4192); 
            dbg.location(54,2);

            		System.out.println((a!=null?input.toString(a.start,a.stop):null) +"="+ (b!=null?b.getText():null));
            		System.out.println((c!=null?input.toString(c.start,c.stop):null) +"="+ (d!=null?d.getText():null));
            	

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
        dbg.location(58, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV4"

    public static class testerPREV3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV3"
    // C:\\projects\\workspace\\onyx\\Test1.g:60:1: testerPREV3 : a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF ;
    public final Test1Parser.testerPREV3_return testerPREV3() throws RecognitionException {
        Test1Parser.testerPREV3_return retval = new Test1Parser.testerPREV3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token b=null;
        Token d=null;
        Token char_literal11=null;
        Token WS12=null;
        Token char_literal13=null;
        Token EOF14=null;
        Test1Parser.noun_return a = null;

        Test1Parser.noun_return c = null;


        Object b_tree=null;
        Object d_tree=null;
        Object char_literal11_tree=null;
        Object WS12_tree=null;
        Object char_literal13_tree=null;
        Object EOF14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:61:2: (a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:61:4: a= noun '=' b= VALUE WS c= noun '=' d= VALUE EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(61,5);
            pushFollow(FOLLOW_noun_in_testerPREV3209);
            a=noun();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());
            dbg.location(61,14);
            char_literal11=(Token)match(input,11,FOLLOW_11_in_testerPREV3211); 
            dbg.location(61,17);
            b=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV3216); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);

            dbg.location(61,26);
            WS12=(Token)match(input,WS,FOLLOW_WS_in_testerPREV3218); 
            dbg.location(61,29);
            pushFollow(FOLLOW_noun_in_testerPREV3223);
            c=noun();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());
            dbg.location(61,38);
            char_literal13=(Token)match(input,11,FOLLOW_11_in_testerPREV3225); 
            dbg.location(61,41);
            d=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV3230); 
            d_tree = (Object)adaptor.create(d);
            adaptor.addChild(root_0, d_tree);

            dbg.location(61,51);
            EOF14=(Token)match(input,EOF,FOLLOW_EOF_in_testerPREV3232); 
            dbg.location(62,2);

            		_map.put((a!=null?input.toString(a.start,a.stop):null),(b!=null?b.getText():null));
            		_map.put((c!=null?input.toString(c.start,c.stop):null),(d!=null?d.getText():null));
            		for (Map.Entry<String,String> entry : _map.entrySet()) {
            			System.out.println(
            			 	entry.getKey() +" = "+entry.getValue()+" "
            			);
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
        dbg.location(71, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV3"

    public static class testerPREV2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV2"
    // C:\\projects\\workspace\\onyx\\Test1.g:73:1: testerPREV2 : noun '=' VALUE WS noun '=' VALUE EOF ;
    public final Test1Parser.testerPREV2_return testerPREV2() throws RecognitionException {
        Test1Parser.testerPREV2_return retval = new Test1Parser.testerPREV2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        Token VALUE17=null;
        Token WS18=null;
        Token char_literal20=null;
        Token VALUE21=null;
        Token EOF22=null;
        Test1Parser.noun_return noun15 = null;

        Test1Parser.noun_return noun19 = null;


        Object char_literal16_tree=null;
        Object VALUE17_tree=null;
        Object WS18_tree=null;
        Object char_literal20_tree=null;
        Object VALUE21_tree=null;
        Object EOF22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:74:2: ( noun '=' VALUE WS noun '=' VALUE EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:74:4: noun '=' VALUE WS noun '=' VALUE EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(74,4);
            pushFollow(FOLLOW_noun_in_testerPREV2247);
            noun15=noun();

            state._fsp--;

            adaptor.addChild(root_0, noun15.getTree());
            dbg.location(74,12);
            char_literal16=(Token)match(input,11,FOLLOW_11_in_testerPREV2249); 
            dbg.location(74,14);
            VALUE17=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV2252); 
            VALUE17_tree = (Object)adaptor.create(VALUE17);
            adaptor.addChild(root_0, VALUE17_tree);

            dbg.location(74,22);
            WS18=(Token)match(input,WS,FOLLOW_WS_in_testerPREV2254); 
            dbg.location(74,24);
            pushFollow(FOLLOW_noun_in_testerPREV2257);
            noun19=noun();

            state._fsp--;

            adaptor.addChild(root_0, noun19.getTree());
            dbg.location(74,32);
            char_literal20=(Token)match(input,11,FOLLOW_11_in_testerPREV2259); 
            dbg.location(74,34);
            VALUE21=(Token)match(input,VALUE,FOLLOW_VALUE_in_testerPREV2262); 
            VALUE21_tree = (Object)adaptor.create(VALUE21);
            adaptor.addChild(root_0, VALUE21_tree);

            dbg.location(74,43);
            EOF22=(Token)match(input,EOF,FOLLOW_EOF_in_testerPREV2264); 

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
        dbg.location(75, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV2"

    public static class testerPREV_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testerPREV"
    // C:\\projects\\workspace\\onyx\\Test1.g:77:1: testerPREV : mapper[new HashMap<String,String>()] EOF ;
    public final Test1Parser.testerPREV_return testerPREV() throws RecognitionException {
        Test1Parser.testerPREV_return retval = new Test1Parser.testerPREV_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF24=null;
        Test1Parser.mapper_return mapper23 = null;


        Object EOF24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "testerPREV");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:78:2: ( mapper[new HashMap<String,String>()] EOF )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:78:4: mapper[new HashMap<String,String>()] EOF
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(78,4);
            pushFollow(FOLLOW_mapper_in_testerPREV276);
            mapper23=mapper(new HashMap<String,String>());

            state._fsp--;

            adaptor.addChild(root_0, mapper23.getTree());
            dbg.location(78,41);
            EOF24=(Token)match(input,EOF,FOLLOW_EOF_in_testerPREV279); 
            EOF24_tree = (Object)adaptor.create(EOF24);
            adaptor.addChild(root_0, EOF24_tree);

            dbg.location(79,2);

            		for (Map.Entry<String,String> entry : _map.entrySet()) {
            			System.out.println(
            			 	entry.getKey() +" = "+entry.getValue()+" "
            			);
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
        dbg.location(86, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "testerPREV");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "testerPREV"

    public static class mapper_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapper"
    // C:\\projects\\workspace\\onyx\\Test1.g:88:1: mapper[Map map] : ( keyValue[map] ) ( WS keyValue[map] )* ;
    public final Test1Parser.mapper_return mapper(Map map) throws RecognitionException {
        Test1Parser.mapper_return retval = new Test1Parser.mapper_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS26=null;
        Test1Parser.keyValue_return keyValue25 = null;

        Test1Parser.keyValue_return keyValue27 = null;


        Object WS26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mapper");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:89:2: ( ( keyValue[map] ) ( WS keyValue[map] )* )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:89:4: ( keyValue[map] ) ( WS keyValue[map] )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,4);
            // C:\\projects\\workspace\\onyx\\Test1.g:89:4: ( keyValue[map] )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:89:5: keyValue[map]
            {
            dbg.location(89,5);
            pushFollow(FOLLOW_keyValue_in_mapper295);
            keyValue25=keyValue(map);

            state._fsp--;

            adaptor.addChild(root_0, keyValue25.getTree());

            }

            dbg.location(89,19);
            // C:\\projects\\workspace\\onyx\\Test1.g:89:19: ( WS keyValue[map] )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\projects\\workspace\\onyx\\Test1.g:89:20: WS keyValue[map]
            	    {
            	    dbg.location(89,22);
            	    WS26=(Token)match(input,WS,FOLLOW_WS_in_mapper299); 
            	    dbg.location(89,24);
            	    pushFollow(FOLLOW_keyValue_in_mapper302);
            	    keyValue27=keyValue(map);

            	    state._fsp--;

            	    adaptor.addChild(root_0, keyValue27.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


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
        dbg.location(90, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mapper");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mapper"

    public static class keyValue_return extends ParserRuleReturnScope {
        public String key;
        public String val;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyValue"
    // C:\\projects\\workspace\\onyx\\Test1.g:92:1: keyValue[Map map] returns [String key, String val] : noun ( WS )? '=' ( WS )? VALUE ;
    public final Test1Parser.keyValue_return keyValue(Map map) throws RecognitionException {
        Test1Parser.keyValue_return retval = new Test1Parser.keyValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS29=null;
        Token char_literal30=null;
        Token WS31=null;
        Token VALUE32=null;
        Test1Parser.noun_return noun28 = null;


        Object WS29_tree=null;
        Object char_literal30_tree=null;
        Object WS31_tree=null;
        Object VALUE32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "keyValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:93:2: ( noun ( WS )? '=' ( WS )? VALUE )
            dbg.enterAlt(1);

            // C:\\projects\\workspace\\onyx\\Test1.g:93:4: noun ( WS )? '=' ( WS )? VALUE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(93,4);
            pushFollow(FOLLOW_noun_in_keyValue321);
            noun28=noun();

            state._fsp--;

            adaptor.addChild(root_0, noun28.getTree());
            dbg.location(93,11);
            // C:\\projects\\workspace\\onyx\\Test1.g:93:11: ( WS )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==WS) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Test1.g:93:11: WS
                    {
                    dbg.location(93,11);
                    WS29=(Token)match(input,WS,FOLLOW_WS_in_keyValue323); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(93,17);
            char_literal30=(Token)match(input,11,FOLLOW_11_in_keyValue327); 
            dbg.location(93,21);
            // C:\\projects\\workspace\\onyx\\Test1.g:93:21: ( WS )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==WS) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Test1.g:93:21: WS
                    {
                    dbg.location(93,21);
                    WS31=(Token)match(input,WS,FOLLOW_WS_in_keyValue330); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(93,24);
            VALUE32=(Token)match(input,VALUE,FOLLOW_VALUE_in_keyValue334); 
            VALUE32_tree = (Object)adaptor.create(VALUE32);
            adaptor.addChild(root_0, VALUE32_tree);

            dbg.location(94,2);

            		retval.key = (noun28!=null?input.toString(noun28.start,noun28.stop):null); 
            		retval.val = (VALUE32!=null?VALUE32.getText():null);
            		map.put(retval.key,retval.val);
            	

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
        dbg.location(99, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "keyValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "keyValue"

    public static class noun_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "noun"
    // C:\\projects\\workspace\\onyx\\Test1.g:102:1: noun : ( | USERNAME | PASSWORD );
    public final Test1Parser.noun_return noun() throws RecognitionException {
        Test1Parser.noun_return retval = new Test1Parser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USERNAME33=null;
        Token PASSWORD34=null;

        Object USERNAME33_tree=null;
        Object PASSWORD34_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "noun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // C:\\projects\\workspace\\onyx\\Test1.g:103:2: ( | USERNAME | PASSWORD )
            int alt6=3;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case WS:
            case 11:
                {
                alt6=1;
                }
                break;
            case USERNAME:
                {
                alt6=2;
                }
                break;
            case PASSWORD:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\projects\\workspace\\onyx\\Test1.g:104:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\projects\\workspace\\onyx\\Test1.g:104:4: USERNAME
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(104,4);
                    USERNAME33=(Token)match(input,USERNAME,FOLLOW_USERNAME_in_noun353); 
                    USERNAME33_tree = (Object)adaptor.create(USERNAME33);
                    adaptor.addChild(root_0, USERNAME33_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\projects\\workspace\\onyx\\Test1.g:105:4: PASSWORD
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(105,4);
                    PASSWORD34=(Token)match(input,PASSWORD,FOLLOW_PASSWORD_in_noun358); 
                    PASSWORD34_tree = (Object)adaptor.create(PASSWORD34);
                    adaptor.addChild(root_0, PASSWORD34_tree);


                    }
                    break;

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
        dbg.location(106, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "noun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "noun"

    // Delegated rules


 

    public static final BitSet FOLLOW_noun_in_tester89 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_tester91 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_tester96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV6112 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_testerPREV6114 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_testerPREV5135 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_WS_in_testerPREV5137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV5141 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_WS_in_testerPREV5144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV5150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testerPREV5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_testerPREV4169 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV4171 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV4176 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_testerPREV4178 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_noun_in_testerPREV4183 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV4185 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV4190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testerPREV4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_testerPREV3209 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV3211 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV3216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_testerPREV3218 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_noun_in_testerPREV3223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV3225 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testerPREV3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_testerPREV2247 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV2249 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV2252 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WS_in_testerPREV2254 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_noun_in_testerPREV2257 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_testerPREV2259 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_testerPREV2262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testerPREV2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mapper_in_testerPREV276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_testerPREV279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyValue_in_mapper295 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_WS_in_mapper299 = new BitSet(new long[]{0x0000000000000960L});
    public static final BitSet FOLLOW_keyValue_in_mapper302 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_noun_in_keyValue321 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_WS_in_keyValue323 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_keyValue327 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_WS_in_keyValue330 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_VALUE_in_keyValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USERNAME_in_noun353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASSWORD_in_noun358 = new BitSet(new long[]{0x0000000000000002L});

}