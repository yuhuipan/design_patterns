package com.yuhui.entity;

public class Cat {
    private int speed;

    public Cat() {
    }

    public Cat(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "speed=" + speed +
                '}';
    }
}
