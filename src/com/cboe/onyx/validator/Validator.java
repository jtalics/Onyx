package com.cboe.onyx.validator;

import org.antlr.runtime.tree.Tree;

public abstract class Validator
{
    public static void childCountGreaterThan0(Tree node)
    {
        int childCount = node.getChildCount();
        if (childCount == 0) {
            throw new IllegalArgumentException("at least 1 qualifier is required for " + node.getText());
        }
    }

    public static void childCount0or1(Tree node)
    {
        int childCount = node.getChildCount();
        if (childCount > 1) {
            throw new IllegalArgumentException("1 or 0 qualifier requiredfor " + node.getText());
        }
    }

    public static void childCountEquals0(Tree node)
    {
        int childCount = node.getChildCount();
        if (childCount != 0) {
            throw new IllegalArgumentException("0 qualifier required for " + node.getText());
        }
    }

    public static void childCountEquals1(Tree node)
    {
        int childCount = node.getChildCount();
        if (childCount != 1) {
            throw new IllegalArgumentException("1 qualifier required for " + node.getText());
        }
    }

    public static void childCountEquals2(Tree node)
    {
        int childCount = node.getChildCount();
        if (childCount != 2) {
            throw new IllegalArgumentException("2 qualifiers required for " + node.getText());
        }
    }
}
