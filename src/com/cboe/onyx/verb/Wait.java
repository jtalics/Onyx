package com.cboe.onyx.verb;

import org.antlr.runtime.tree.Tree;

import com.cboe.onyx.OnyxParser;
import com.cboe.onyx.validator.Validator;

public class Wait extends Verb
{
    private int duration;
    protected static Wait self;
    public synchronized static Wait getInstance() {
        if (self == null) {
            self = new Wait();
        }
        return self;
    }

    public void wait2()
    {
        System.out.println("EXECUTING WAIT");
        if (duration > 0)
        {
            System.out.println("Waiting " + duration + " seconds.");
            try
            {
                Thread.sleep(duration * 1000);
            }
            catch (InterruptedException e)
            {
                // nop
            }
        }
        else
        {
             // TODO: "Press any key to continue"
        }
    }


    public void parse(Tree node, String[] tokenNames)
    {
            Validator.childCount0or1(node);
            for (int i = 0; i < node.getChildCount(); i++ ) {
                Tree child = node.getChild(i);
                Validator.childCountGreaterThan0(child);
                if (child.getType() != OnyxParser.WHERE) {
                    throw new IllegalArgumentException("not a valid qualifier type for "+tokenNames[OnyxParser.WAIT]+": "+child.getText());
                }
                for (int j = 0; j < child.getChildCount(); j++) {
                    Tree gchild = child.getChild(i);
                    Validator.childCountGreaterThan0(gchild);
                    if (gchild.getType() != OnyxParser.DURATION) {
                        throw new IllegalArgumentException("not a valid qualifier type for "+tokenNames[OnyxParser.WHERE]+": "+gchild.getText());
                    }
                    Tree ggchild = gchild.getChild(0);
                    Validator.childCountEquals0(ggchild);
                    if (ggchild.getType() != OnyxParser.WHERE) {
                        throw new IllegalArgumentException("not a valid qualifier type ("+tokenNames[ggchild.getType()]+") for "+tokenNames[OnyxParser.DURATION]+": "+ggchild.getText());
                    }
                    duration = Integer.parseInt(ggchild.getText());
                }
            }
        }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = Integer.parseInt(duration);
    }
}
