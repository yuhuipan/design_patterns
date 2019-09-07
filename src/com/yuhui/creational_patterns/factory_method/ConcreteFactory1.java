package com.yuhui.creational_patterns.factory_method;

import com.yuhui.creational_patterns.ConcreteProduct1;
import com.yuhui.creational_patterns.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
