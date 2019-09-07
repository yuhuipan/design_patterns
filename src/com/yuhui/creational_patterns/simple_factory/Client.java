package com.yuhui.creational_patterns.simple_factory;

import com.yuhui.creational_patterns.ConcreteProduct;
import com.yuhui.creational_patterns.ConcreteProduct1;
import com.yuhui.creational_patterns.ConcreteProduct2;
import com.yuhui.creational_patterns.Product;

public class Client {
    public static void main(String[] args) {
        int type = 1;
        Product product;
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct();
        }
        // do something with the product
    }
}
