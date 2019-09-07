package com.yuhui.behaviour_patterns.iterator;

/**
 * - java.util.Iterator
 * - java.util.Enumeration
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
