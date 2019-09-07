package com.yuhui.creational_patterns.factory_method;

import com.yuhui.creational_patterns.ConcreteProduct2;
import com.yuhui.creational_patterns.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
