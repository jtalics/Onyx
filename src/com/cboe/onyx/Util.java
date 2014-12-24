package com.cboe.onyx;
import java.util.Random;

public class Util
{
    static Random random = new Random();
    // De-quote a string
    public static String dq(String s)
    {
        if (s.isEmpty())
        {
            return s;
        }
        int start = 0;
        if (s.length() > 1)
        {
            if (s.charAt(0) == '\'' || s.charAt(0) == '\"')
            {
                start = 1;
            }
        }
        int stop = s.length();
        if (stop > 1)
        {
            if (s.charAt(stop - 1) == '\'' || s.charAt(stop - 1) == '\"')
            {
                stop--;
            }
        }
        String retval = s.substring(start, stop);
        return retval;
    }

    public static void removeComments(byte[][] buffers)
    {
        boolean transfer = true;
        for (int j = 0; j < buffers.length; j++)
        {
            byte[] buffer = buffers[j];
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (i < buffer.length)
            {
                if (buffer[i] == '#')
                {
                    transfer = false;
                }
                else if (buffer[i] == 13)
                {
                    // turn transfer back on but don't transfer this EOL
                    sb.append((char) buffer[i++]); // \n
                    // \r DOS
                    transfer = true;
                }
                if (transfer)
                {
                    sb.append((char) buffer[i]);
                }
                i++;
            }
            buffers[j] = sb.toString().getBytes();
        }
    }
    
    public static int getRandomInt(int sup) {
        return random.nextInt(sup);
    }
    
    public static int getRandomOrderId()
    {
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int orderId;
        orderId = random.nextInt(range) + min;
        return orderId;
    }
    
    public static int positiveRandomInt() {
        int retVal = random.nextInt();
        if ( retVal < 0 ) {
            retVal = -retVal;
        }
        return retVal;
    }

}
