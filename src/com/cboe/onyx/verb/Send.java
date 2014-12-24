package com.cboe.onyx.verb;

import com.cboe.application.shared.UnitTestHelper;
import com.cboe.idl.cmiAdmin.MessageStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;

public class Send extends Verb
{
    
    private MarketMakerAPI mmAPI;

    protected static Send self;
    public synchronized static Send getInstance() {
        if (self == null) {
            self = new Send();
        }
        return self;
    }

    private void testSendMessage(String userId)
    {
        String subject = "This is a test subject field.";
        String text = "This is a test text field.";
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing Send Message");
        MessageStruct messageStruct = new MessageStruct(UnitTestHelper.createCurrentDateTimeStruct(), 0, 0, userId, subject, false, text);
        try
        {
            mmAPI.sendMessage(messageStruct);
            System.out.println("Sent:: " + subject);
            System.out.println("From:: " + userId);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
