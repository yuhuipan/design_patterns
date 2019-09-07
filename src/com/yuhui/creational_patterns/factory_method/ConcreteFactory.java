package com.yuhui.creational_patterns.factory_method;

import com.yuhui.creational_patterns.Product;
import com.yuhui.creational_patterns.ConcreteProduct;

public class ConcreteFactory extends Factory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
