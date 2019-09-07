package com.yuhui.behaviour_patterns.iterator;


/**
 * 聚合类，其中 createIterator() 方法可以产生一个 Iterator
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
