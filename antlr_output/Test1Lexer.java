// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\projects\\workspace\\onyx\\Test1.g 2011-04-14 15:11:34
 
package com.cboe.onyx;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Test1Lexer extends Lexer {
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

    public Test1Lexer() {;} 
    public Test1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Test1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\projects\\workspace\\onyx\\Test1.g"; }

    // $ANTLR start "LOGIN"
    public final void mLOGIN() throws RecognitionException {
        try {
            int _type = LOGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:13:7: ( 'login' )
            // C:\\projects\\workspace\\onyx\\Test1.g:13:9: 'login'
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

    // $ANTLR start "USERNAME"
    public final void mUSERNAME() throws RecognitionException {
        try {
            int _type = USERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:14:10: ( 'username' )
            // C:\\projects\\workspace\\onyx\\Test1.g:14:12: 'username'
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

    // $ANTLR start "PASSWORD"
    public final void mPASSWORD() throws RecognitionException {
        try {
            int _type = PASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:15:10: ( 'password' )
            // C:\\projects\\workspace\\onyx\\Test1.g:15:12: 'password'
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

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:16:7: ( 'where' )
            // C:\\projects\\workspace\\onyx\\Test1.g:16:9: 'where'
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

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:17:7: ( '=' )
            // C:\\projects\\workspace\\onyx\\Test1.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:109:2: ( ( '\\r' )? '\\n' )
            // C:\\projects\\workspace\\onyx\\Test1.g:109:4: ( '\\r' )? '\\n'
            {
            // C:\\projects\\workspace\\onyx\\Test1.g:109:4: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\projects\\workspace\\onyx\\Test1.g:109:4: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

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
            // C:\\projects\\workspace\\onyx\\Test1.g:113:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\projects\\workspace\\onyx\\Test1.g:113:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\projects\\workspace\\onyx\\Test1.g:113:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\projects\\workspace\\onyx\\Test1.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "VALUE"
    public final void mVALUE() throws RecognitionException {
        try {
            int _type = VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\projects\\workspace\\onyx\\Test1.g:116:6: ( ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' ) )
            // C:\\projects\\workspace\\onyx\\Test1.g:117:2: ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' )
            {
            // C:\\projects\\workspace\\onyx\\Test1.g:117:2: ( '\"' (~ '\"' )* '\"' | '\\'' (~ '\\'' )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\projects\\workspace\\onyx\\Test1.g:117:4: '\"' (~ '\"' )* '\"'
                    {
                    match('\"'); 
                    // C:\\projects\\workspace\\onyx\\Test1.g:117:8: (~ '\"' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\projects\\workspace\\onyx\\Test1.g:117:9: ~ '\"'
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
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // C:\\projects\\workspace\\onyx\\Test1.g:118:5: '\\'' (~ '\\'' )* '\\''
                    {
                    match('\''); 
                    // C:\\projects\\workspace\\onyx\\Test1.g:118:10: (~ '\\'' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\projects\\workspace\\onyx\\Test1.g:118:11: ~ '\\''
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
                    	    break loop4;
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
    // $ANTLR end "VALUE"

    public void mTokens() throws RecognitionException {
        // C:\\projects\\workspace\\onyx\\Test1.g:1:8: ( LOGIN | USERNAME | PASSWORD | WHERE | T__11 | NEWLINE | WS | VALUE )
        int alt6=8;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:10: LOGIN
                {
                mLOGIN(); 

                }
                break;
            case 2 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:16: USERNAME
                {
                mUSERNAME(); 

                }
                break;
            case 3 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:25: PASSWORD
                {
                mPASSWORD(); 

                }
                break;
            case 4 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:34: WHERE
                {
                mWHERE(); 

                }
                break;
            case 5 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:40: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:46: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 7 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:54: WS
                {
                mWS(); 

                }
                break;
            case 8 :
                // C:\\projects\\workspace\\onyx\\Test1.g:1:57: VALUE
                {
                mVALUE(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\6\uffff\1\10\1\12\3\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\11\5\uffff\1\12\1\11\3\uffff";
    static final String DFA6_maxS =
        "\1\167\5\uffff\1\12\1\40\3\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\10\1\6";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\1\7\2\uffff\1\6\22\uffff\1\10\1\uffff\1\11\4\uffff\1"+
            "\11\25\uffff\1\5\56\uffff\1\1\3\uffff\1\3\4\uffff\1\2\1\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\7",
            "\2\10\2\uffff\1\10\22\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LOGIN | USERNAME | PASSWORD | WHERE | T__11 | NEWLINE | WS | VALUE );";
        }
    }
 

}