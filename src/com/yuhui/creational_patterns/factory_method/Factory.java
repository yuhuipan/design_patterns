package com.yuhui.creational_patterns.factory_method;

import com.yuhui.creational_patterns.Product;

public abstract class Factory {
    abstract Product factoryMethod();

    public void doSomthing() {
        Product product = factoryMethod();
        // do something with the product
    }
}
