package com.yuhui.behaviour_patterns.iterator;

public class ConcreteAggregate implements Aggregate {
    private Integer[] items;

    public ConcreteAggregate() {
        this.items = new Integer[10];
        for (int i = 0; i < 10; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
