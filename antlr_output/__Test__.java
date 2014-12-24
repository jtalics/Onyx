import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.cboe.onyx.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        OnyxLexer lex = new OnyxLexer(new ANTLRFileStream("C:\\projects\\workspace\\onyx\\antlr_output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        OnyxParser g = new OnyxParser(tokens, 49100, null);
        try {
            g.command();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}