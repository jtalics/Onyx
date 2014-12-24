package com.cboe.onyx.verb;

import org.antlr.runtime.tree.Tree;

import com.cboe.exceptions.AuthorizationException;
import com.cboe.exceptions.CommunicationException;
import com.cboe.exceptions.SystemException;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;

public class Logout extends Verb
{

    private MarketMakerAPI mmAPI;

    protected static Logout self;
    public synchronized static Logout getInstance() {
        if (self == null) {
            self = new Logout();
        }
        return self;
    }

    public void logout()
    {
        System.out.println("EXECUTING LOGOUT");

        try
        {
            mmAPI.logout();
        }
        catch (SystemException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (CommunicationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (AuthorizationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void parse(Tree node, String[] tokenNames)
    {
    }


    public void setMmAPI(MarketMakerAPI mmAPI)
    {
        this.mmAPI = mmAPI;
    }
}
