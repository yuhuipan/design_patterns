package com.yuhui.creational_patterns.prototype;

/**
 * 使用原型实例指定要创建对象的类型，通过复制这个原型来创建新对象。
 */
public class ConcretePrototype extends Prototype {
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
