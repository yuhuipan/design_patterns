package com.yuhui.behaviour_patterns.iterator;

/**
 * hasNext(),next()
 */
public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
