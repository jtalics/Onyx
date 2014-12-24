package com.cboe.onyx.verb;

import org.antlr.runtime.tree.Tree;

import com.cboe.idl.cmiOrder.OrderIdStruct;
import com.cboe.idl.cmiTraderActivity.ActivityHistoryStruct;
import com.cboe.interfaces.presentation.api.MarketMakerAPI;

public class Query extends Verb
{
    private MarketMakerAPI mmAPI;
    private OrderIdStruct lastOrderIdStruct;
    protected static Query self;
    public synchronized static Query getInstance() {
        if (self == null) {
            self = new Query();
        }
        return self;
    }

    private void testQueryOrderHistory()
    {
        ActivityHistoryStruct activityHistory;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Testing QueryOrderHistory");
        try
        {
            activityHistory = mmAPI.queryOrderHistory(lastOrderIdStruct);
            for (int i = 0; i < activityHistory.activityRecords.length; i++)
            {
                for (int j = 0; j < activityHistory.activityRecords[i].activityFields.length; j++)
                {
                    System.out.println("activityHistory.activityRecords[i].activityFields.length = " + activityHistory.activityRecords[i].activityFields.length); // REMOVE
                    System.out.println("activityHistory.activityRecord[" + i + "].activityField[" + j + "]::" + " name::" + activityHistory.activityRecords[i].activityFields[j].fieldName + " value::" + activityHistory.activityRecords[i].activityFields[j].fieldValue);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }


}
