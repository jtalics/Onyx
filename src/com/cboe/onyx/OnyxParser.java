// $ANTLR 3.3 Nov 30, 2010 12:45:30 Onyx.g 2011-04-25 09:15:48

package com.cboe.onyx;
import com.cboe.onyx.verb.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class OnyxParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCEPT", "CANCEL", "CONNECT", "CREATE", "GET", "LOGIN", "LOGOUT", "REPLACE", "SELECT", "SEND", "SUBSCRIBE", "WAIT", "BOOK", "BUY", "CAS", "DURATION", "HOSTNAME", "CURRENT_MARKET", "FILENAME", "FIRM", "KEY", "MARKET_DATA", "MESSAGE", "NAME", "NBBO", "OPTION", "ORDER", "ORDER_HISTORY", "PASSWORD", "PREFERENCES", "PRICE", "PRODUCT", "PRODUCTS", "PRODUCT_CLASS", "PRODUCT_CLASSES", "PRODUCT_TYPE", "PRODUCT_TYPES", "QUANTITY", "QUOTE", "RECAP", "RFQ", "ROLE", "SELL", "SESSION", "SESSIONS", "SEQUENCE_NUMBER", "SIDE", "STRATEGY", "SYMBOL", "TICKER", "TIME", "TRADER_PRODUCT_HISTORY", "USERNAME", "USER_MARKET", "RANDOM", "NEW", "BY", "FOR", "FROM", "OF", "TO", "AND", "OR", "WHERE", "COMMENT", "NEWLINE", "WS", "QVALUE", "FILE", "'='"
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

    // delegates
    // delegators


        public OnyxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OnyxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OnyxParser.tokenNames; }
    public String getGrammarFileName() { return "Onyx.g"; }


    //private List<Integer[]> sentences;


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // Onyx.g:98:1: command : ( NEWLINE )* ( sentence | comment )? ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF ;
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

        try {
            // Onyx.g:99:3: ( ( NEWLINE )* ( sentence | comment )? ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF )
            // Onyx.g:99:5: ( NEWLINE )* ( sentence | comment )? ( ( NEWLINE )+ ( sentence | comment ) )* ( NEWLINE )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // Onyx.g:99:12: ( NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Onyx.g:99:12: NEWLINE
            	    {
            	    NEWLINE1=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command666); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Onyx.g:99:15: ( sentence | comment )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=ACCEPT && LA2_0<=WAIT)||LA2_0==WS) ) {
                alt2=1;
            }
            else if ( (LA2_0==COMMENT) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // Onyx.g:99:16: sentence
                    {
                    pushFollow(FOLLOW_sentence_in_command671);
                    sentence2=sentence();

                    state._fsp--;

                    adaptor.addChild(root_0, sentence2.getTree());

                    }
                    break;
                case 2 :
                    // Onyx.g:99:25: comment
                    {
                    pushFollow(FOLLOW_comment_in_command673);
                    comment3=comment();

                    state._fsp--;


                    }
                    break;

            }

            // Onyx.g:99:36: ( ( NEWLINE )+ ( sentence | comment ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // Onyx.g:99:37: ( NEWLINE )+ ( sentence | comment )
            	    {
            	    // Onyx.g:99:44: ( NEWLINE )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==NEWLINE) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // Onyx.g:99:44: NEWLINE
            	    	    {
            	    	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command679); 

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

            	    // Onyx.g:99:47: ( sentence | comment )
            	    int alt4=2;
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

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // Onyx.g:99:48: sentence
            	            {
            	            pushFollow(FOLLOW_sentence_in_command684);
            	            sentence5=sentence();

            	            state._fsp--;

            	            adaptor.addChild(root_0, sentence5.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // Onyx.g:99:57: comment
            	            {
            	            pushFollow(FOLLOW_comment_in_command686);
            	            comment6=comment();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Onyx.g:99:76: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Onyx.g:99:76: NEWLINE
            	    {
            	    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_command692); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_command696); 

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
        return retval;
    }
    // $ANTLR end "command"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // Onyx.g:105:1: comment : COMMENT (~ NEWLINE )* ;
    public final OnyxParser.comment_return comment() throws RecognitionException {
        OnyxParser.comment_return retval = new OnyxParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMENT9=null;
        Token set10=null;

        Object COMMENT9_tree=null;
        Object set10_tree=null;

        try {
            // Onyx.g:106:3: ( COMMENT (~ NEWLINE )* )
            // Onyx.g:106:5: COMMENT (~ NEWLINE )*
            {
            root_0 = (Object)adaptor.nil();

            COMMENT9=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment717); 
            COMMENT9_tree = (Object)adaptor.create(COMMENT9);
            adaptor.addChild(root_0, COMMENT9_tree);

            // Onyx.g:106:13: (~ NEWLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=ACCEPT && LA7_0<=COMMENT)||(LA7_0>=WS && LA7_0<=73)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Onyx.g:106:14: ~ NEWLINE
            	    {
            	    set10=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ACCEPT && input.LA(1)<=COMMENT)||(input.LA(1)>=WS && input.LA(1)<=73) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set10));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


                System.out.println("UNPARSED COMMENT: "+input.toString(retval.start,input.LT(-1)) +": DONE");
              

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
        return retval;
    }
    // $ANTLR end "comment"

    public static class sentence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sentence"
    // Onyx.g:112:1: sentence : ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )? ;
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

        try {
            // Onyx.g:113:1: ( ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )? )
            // Onyx.g:113:3: ( WS )? verb ( WS directObjectPhrase )? ( ( WS prepositionalPhrase ) | ( WS whereClause ) )* ( WS )?
            {
            root_0 = (Object)adaptor.nil();

            // Onyx.g:113:5: ( WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Onyx.g:113:5: WS
                    {
                    WS11=(Token)match(input,WS,FOLLOW_WS_in_sentence739); 

                    }
                    break;

            }

            pushFollow(FOLLOW_verb_in_sentence743);
            verb12=verb();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(verb12.getTree(), root_0);
            // Onyx.g:113:14: ( WS directObjectPhrase )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WS) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=BOOK && LA9_1<=NEW)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // Onyx.g:113:15: WS directObjectPhrase
                    {
                    WS13=(Token)match(input,WS,FOLLOW_WS_in_sentence747); 
                    pushFollow(FOLLOW_directObjectPhrase_in_sentence750);
                    directObjectPhrase14=directObjectPhrase();

                    state._fsp--;

                    adaptor.addChild(root_0, directObjectPhrase14.getTree());

                    }
                    break;

            }

            // Onyx.g:113:40: ( ( WS prepositionalPhrase ) | ( WS whereClause ) )*
            loop10:
            do {
                int alt10=3;
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


                switch (alt10) {
            	case 1 :
            	    // Onyx.g:113:41: ( WS prepositionalPhrase )
            	    {
            	    // Onyx.g:113:41: ( WS prepositionalPhrase )
            	    // Onyx.g:113:42: WS prepositionalPhrase
            	    {
            	    WS15=(Token)match(input,WS,FOLLOW_WS_in_sentence756); 
            	    pushFollow(FOLLOW_prepositionalPhrase_in_sentence759);
            	    prepositionalPhrase16=prepositionalPhrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, prepositionalPhrase16.getTree());

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Onyx.g:113:67: ( WS whereClause )
            	    {
            	    // Onyx.g:113:67: ( WS whereClause )
            	    // Onyx.g:113:68: WS whereClause
            	    {
            	    WS17=(Token)match(input,WS,FOLLOW_WS_in_sentence763); 
            	    pushFollow(FOLLOW_whereClause_in_sentence766);
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

            // Onyx.g:113:89: ( WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Onyx.g:113:89: WS
                    {
                    WS19=(Token)match(input,WS,FOLLOW_WS_in_sentence771); 

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "sentence"

    public static class directObjectPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directObjectPhrase"
    // Onyx.g:119:1: directObjectPhrase : nounPhrase ;
    public final OnyxParser.directObjectPhrase_return directObjectPhrase() throws RecognitionException {
        OnyxParser.directObjectPhrase_return retval = new OnyxParser.directObjectPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OnyxParser.nounPhrase_return nounPhrase20 = null;



        try {
            // Onyx.g:120:1: ( nounPhrase )
            // Onyx.g:120:3: nounPhrase
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_nounPhrase_in_directObjectPhrase786);
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
        return retval;
    }
    // $ANTLR end "directObjectPhrase"

    public static class prepositionalPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prepositionalPhrase"
    // Onyx.g:123:1: prepositionalPhrase : preposition WS nounPhrase ;
    public final OnyxParser.prepositionalPhrase_return prepositionalPhrase() throws RecognitionException {
        OnyxParser.prepositionalPhrase_return retval = new OnyxParser.prepositionalPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS22=null;
        OnyxParser.preposition_return preposition21 = null;

        OnyxParser.nounPhrase_return nounPhrase23 = null;


        Object WS22_tree=null;

        try {
            // Onyx.g:124:1: ( preposition WS nounPhrase )
            // Onyx.g:124:3: preposition WS nounPhrase
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_preposition_in_prepositionalPhrase795);
            preposition21=preposition();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(preposition21.getTree(), root_0);
            WS22=(Token)match(input,WS,FOLLOW_WS_in_prepositionalPhrase798); 
            pushFollow(FOLLOW_nounPhrase_in_prepositionalPhrase801);
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
        return retval;
    }
    // $ANTLR end "prepositionalPhrase"

    public static class nounPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nounPhrase"
    // Onyx.g:127:1: nounPhrase : nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )* ;
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

        try {
            // Onyx.g:128:1: ( nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )* )
            // Onyx.g:128:4: nounAdjectivesPhrase ( WS conjunction WS nounAdjectivesPhrase )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_nounAdjectivesPhrase_in_nounPhrase811);
            nounAdjectivesPhrase24=nounAdjectivesPhrase();

            state._fsp--;

            adaptor.addChild(root_0, nounAdjectivesPhrase24.getTree());
            // Onyx.g:128:25: ( WS conjunction WS nounAdjectivesPhrase )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=AND && LA12_1<=OR)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // Onyx.g:128:26: WS conjunction WS nounAdjectivesPhrase
            	    {
            	    WS25=(Token)match(input,WS,FOLLOW_WS_in_nounPhrase814); 
            	    pushFollow(FOLLOW_conjunction_in_nounPhrase817);
            	    conjunction26=conjunction();

            	    state._fsp--;

            	    WS27=(Token)match(input,WS,FOLLOW_WS_in_nounPhrase820); 
            	    pushFollow(FOLLOW_nounAdjectivesPhrase_in_nounPhrase823);
            	    nounAdjectivesPhrase28=nounAdjectivesPhrase();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nounAdjectivesPhrase28.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "nounPhrase"

    public static class nounAdjectivesPhrase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nounAdjectivesPhrase"
    // Onyx.g:131:1: nounAdjectivesPhrase : ( adjective WS )* noun ;
    public final OnyxParser.nounAdjectivesPhrase_return nounAdjectivesPhrase() throws RecognitionException {
        OnyxParser.nounAdjectivesPhrase_return retval = new OnyxParser.nounAdjectivesPhrase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WS30=null;
        OnyxParser.adjective_return adjective29 = null;

        OnyxParser.noun_return noun31 = null;


        Object WS30_tree=null;

        try {
            // Onyx.g:132:1: ( ( adjective WS )* noun )
            // Onyx.g:132:3: ( adjective WS )* noun
            {
            root_0 = (Object)adaptor.nil();

            // Onyx.g:132:3: ( adjective WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RANDOM && LA13_0<=NEW)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Onyx.g:132:4: adjective WS
            	    {
            	    pushFollow(FOLLOW_adjective_in_nounAdjectivesPhrase836);
            	    adjective29=adjective();

            	    state._fsp--;

            	    adaptor.addChild(root_0, adjective29.getTree());
            	    WS30=(Token)match(input,WS,FOLLOW_WS_in_nounAdjectivesPhrase838); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_noun_in_nounAdjectivesPhrase843);
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
        return retval;
    }
    // $ANTLR end "nounAdjectivesPhrase"

    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // Onyx.g:135:1: whereClause : WHERE WS keyVal ( WS keyVal )* ;
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

        try {
            // Onyx.g:136:3: ( WHERE WS keyVal ( WS keyVal )* )
            // Onyx.g:136:5: WHERE WS keyVal ( WS keyVal )*
            {
            root_0 = (Object)adaptor.nil();

            WHERE32=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause855); 
            WHERE32_tree = (Object)adaptor.create(WHERE32);
            root_0 = (Object)adaptor.becomeRoot(WHERE32_tree, root_0);

            WS33=(Token)match(input,WS,FOLLOW_WS_in_whereClause858); 
            pushFollow(FOLLOW_keyVal_in_whereClause861);
            keyVal34=keyVal();

            state._fsp--;

            adaptor.addChild(root_0, keyVal34.getTree());
            // Onyx.g:136:23: ( WS keyVal )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=BOOK && LA14_1<=USER_MARKET)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // Onyx.g:136:24: WS keyVal
            	    {
            	    WS35=(Token)match(input,WS,FOLLOW_WS_in_whereClause864); 
            	    pushFollow(FOLLOW_keyVal_in_whereClause867);
            	    keyVal36=keyVal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, keyVal36.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // Onyx.g:139:1: keyVal returns [String key, String val] : a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun ) ;
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

        try {
            // Onyx.g:140:1: (a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun ) )
            // Onyx.g:140:3: a= noun ( WS )? '=' ( WS )? b= ( QVALUE | noun )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_noun_in_keyVal886);
            a=noun();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(a.getTree(), root_0);
            // Onyx.g:140:13: ( WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Onyx.g:140:13: WS
                    {
                    WS37=(Token)match(input,WS,FOLLOW_WS_in_keyVal889); 

                    }
                    break;

            }

            char_literal38=(Token)match(input,73,FOLLOW_73_in_keyVal893); 
            // Onyx.g:140:23: ( WS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==WS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Onyx.g:140:23: WS
                    {
                    WS39=(Token)match(input,WS,FOLLOW_WS_in_keyVal896); 

                    }
                    break;

            }

            // Onyx.g:140:28: ( QVALUE | noun )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==QVALUE) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=BOOK && LA17_0<=USER_MARKET)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // Onyx.g:140:29: QVALUE
                    {
                    QVALUE40=(Token)match(input,QVALUE,FOLLOW_QVALUE_in_keyVal903); 
                    QVALUE40_tree = (Object)adaptor.create(QVALUE40);
                    adaptor.addChild(root_0, QVALUE40_tree);


                    }
                    break;
                case 2 :
                    // Onyx.g:140:36: noun
                    {
                    pushFollow(FOLLOW_noun_in_keyVal905);
                    noun41=noun();

                    state._fsp--;

                    adaptor.addChild(root_0, noun41.getTree());

                    }
                    break;

            }

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
        return retval;
    }
    // $ANTLR end "keyVal"

    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // Onyx.g:143:1: verb : ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT );
    public final OnyxParser.verb_return verb() throws RecognitionException {
        OnyxParser.verb_return retval = new OnyxParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;

        Object set42_tree=null;

        try {
            // Onyx.g:144:3: ( ACCEPT | CANCEL | CONNECT | CREATE | GET | LOGIN | LOGOUT | REPLACE | SELECT | SEND | SUBSCRIBE | WAIT )
            // Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            set42=(Token)input.LT(1);
            if ( (input.LA(1)>=ACCEPT && input.LA(1)<=WAIT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set42));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "verb"

    public static class noun_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "noun"
    // Onyx.g:158:1: noun : ( BOOK | BUY | CAS | CURRENT_MARKET | DURATION | FILENAME | FIRM | HOSTNAME | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUANTITY | QUOTE | RECAP | RFQ | ROLE | SELL | SEQUENCE_NUMBER | SESSION | SESSIONS | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET );
    public final OnyxParser.noun_return noun() throws RecognitionException {
        OnyxParser.noun_return retval = new OnyxParser.noun_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try {
            // Onyx.g:159:3: ( BOOK | BUY | CAS | CURRENT_MARKET | DURATION | FILENAME | FIRM | HOSTNAME | KEY | MARKET_DATA | MESSAGE | NAME | NBBO | OPTION | ORDER | ORDER_HISTORY | PASSWORD | PREFERENCES | PRICE | PRODUCT | PRODUCTS | PRODUCT_CLASS | PRODUCT_CLASSES | PRODUCT_TYPE | PRODUCT_TYPES | QUANTITY | QUOTE | RECAP | RFQ | ROLE | SELL | SEQUENCE_NUMBER | SESSION | SESSIONS | SIDE | STRATEGY | SYMBOL | TICKER | TIME | TRADER_PRODUCT_HISTORY | USERNAME | USER_MARKET )
            // Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            set43=(Token)input.LT(1);
            if ( (input.LA(1)>=BOOK && input.LA(1)<=USER_MARKET) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set43));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "noun"

    public static class conjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conjunction"
    // Onyx.g:203:1: conjunction : ( AND | OR );
    public final OnyxParser.conjunction_return conjunction() throws RecognitionException {
        OnyxParser.conjunction_return retval = new OnyxParser.conjunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;

        Object set44_tree=null;

        try {
            // Onyx.g:204:1: ( AND | OR )
            // Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            set44=(Token)input.LT(1);
            if ( (input.LA(1)>=AND && input.LA(1)<=OR) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set44));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "conjunction"

    public static class preposition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preposition"
    // Onyx.g:208:1: preposition : ( BY | FOR | FROM | OF | TO );
    public final OnyxParser.preposition_return preposition() throws RecognitionException {
        OnyxParser.preposition_return retval = new OnyxParser.preposition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // Onyx.g:209:1: ( BY | FOR | FROM | OF | TO )
            // Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=BY && input.LA(1)<=TO) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set45));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "preposition"

    public static class adjective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "adjective"
    // Onyx.g:216:1: adjective : ( RANDOM | NEW );
    public final OnyxParser.adjective_return adjective() throws RecognitionException {
        OnyxParser.adjective_return retval = new OnyxParser.adjective_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // Onyx.g:217:1: ( RANDOM | NEW )
            // Onyx.g:
            {
            root_0 = (Object)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( (input.LA(1)>=RANDOM && input.LA(1)<=NEW) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set46));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        "\1\105\1\4\2\uffff";
    static final String DFA5_maxS =
        "\1\105\1\106\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\14\3\64\uffff\1\3\1\1\1\3",
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
            return "()* loopback of 99:36: ( ( NEWLINE )+ ( sentence | comment ) )*";
        }
    }
 

    public static final BitSet FOLLOW_NEWLINE_in_command666 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000070L});
    public static final BitSet FOLLOW_sentence_in_command671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_comment_in_command673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_command679 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000070L});
    public static final BitSet FOLLOW_sentence_in_command684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_comment_in_command686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NEWLINE_in_command692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_command696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_comment717 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000000000003DFL});
    public static final BitSet FOLLOW_set_in_comment720 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x00000000000003DFL});
    public static final BitSet FOLLOW_WS_in_sentence739 = new BitSet(new long[]{0x000000000000FFF0L,0x0000000000000040L});
    public static final BitSet FOLLOW_verb_in_sentence743 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_sentence747 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_directObjectPhrase_in_sentence750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_sentence756 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_prepositionalPhrase_in_sentence759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_sentence763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_whereClause_in_sentence766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_sentence771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounPhrase_in_directObjectPhrase786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preposition_in_prepositionalPhrase795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_prepositionalPhrase798 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_nounPhrase_in_prepositionalPhrase801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nounAdjectivesPhrase_in_nounPhrase811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_nounPhrase814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_conjunction_in_nounPhrase817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_nounPhrase820 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_nounAdjectivesPhrase_in_nounPhrase823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_adjective_in_nounAdjectivesPhrase836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_nounAdjectivesPhrase838 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_noun_in_nounAdjectivesPhrase843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_whereClause858 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_keyVal_in_whereClause861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_WS_in_whereClause864 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L});
    public static final BitSet FOLLOW_keyVal_in_whereClause867 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_noun_in_keyVal886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000240L});
    public static final BitSet FOLLOW_WS_in_keyVal889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_keyVal893 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_WS_in_keyVal896 = new BitSet(new long[]{0x0FFFFFFFFFFF0000L,0x0000000000000080L});
    public static final BitSet FOLLOW_QVALUE_in_keyVal903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_noun_in_keyVal905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_verb0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_noun0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_conjunction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preposition0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_adjective0 = new BitSet(new long[]{0x0000000000000002L});

}