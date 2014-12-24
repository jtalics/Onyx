package com.cboe.onyx.verb;

import com.cboe.idl.cmiSession.TradingSessionStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;
import com.cboe.onyx.Util;

public class Select extends Verb
{
    private MarketMakerAPI mmAPI;
    private TradingSessionStruct currentSession;
    protected static Select self;
    public synchronized static Select getInstance() {
        if (self == null) {
            self = new Select();
        }
        return self;
    }

    public TradingSessionStruct selectCurrentSession(String sessionName) {
        Get g=Get.getInstance();
        g.setMmAPI(mmAPI);
        TradingSessionStruct[] sessions=g.getSessions();
        for (TradingSessionStruct session : sessions) {
            if (session.sessionName.equals(sessionName)) {
                currentSession = session;
            }
        }
        return currentSession;
    }

    public TradingSessionStruct getCurrentSession()
    {
        return currentSession;
    }

    public void setCurrentSession(TradingSessionStruct currentSession)
    {
        this.currentSession = currentSession;
    }

    public void setMmAPI(MarketMakerAPI mmAPI)
    {
        this.mmAPI = mmAPI;
    }

    public MarketMakerAPI getMmAPI()
    {
        return mmAPI;
    }
}
