package com.cboe.onyx.verb;

import java.util.Random;

import org.antlr.runtime.tree.Tree;

import com.cboe.idl.cmiConstants.Sides;
import com.cboe.idl.cmiStrategy.StrategyLegStruct;
import com.cboe.idl.cmiStrategy.StrategyRequestStruct;
import com.cboe.interfaces.presentation.product.SessionProduct;

public class Create extends Verb
{
    private static Random random = new Random();
    private SessionProduct[] products;
    protected static Create self;
    public synchronized static Create getInstance() {
        if (self == null) {
            self = new Create();
        }
        return self;
    }

    public StrategyRequestStruct createRandomStrategy()
    {
        StrategyRequestStruct strategyRequestStruct = new StrategyRequestStruct();
        int legCount = random.nextInt(3) + 2;
        strategyRequestStruct.strategyLegs = new StrategyLegStruct[legCount];
        for (int leg = 0; leg < legCount; leg++)
        {
            int productKey = products[random.nextInt(products.length)].getProductKey();
            int ratioQuantity = random.nextInt(2)+1;
            char side = random.nextInt(2) == 0 ? Sides.BUY : Sides.SELL;
            strategyRequestStruct.strategyLegs[leg] = new StrategyLegStruct(productKey, ratioQuantity, side);
        }
        return strategyRequestStruct;
    }


}
