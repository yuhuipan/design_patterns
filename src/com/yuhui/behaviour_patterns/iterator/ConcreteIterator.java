package com.yuhui.behaviour_patterns.iterator;

public class ConcreteIterator<Item> implements Iterator<Item> {
    private Item[] items;
    private int position = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Item next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
