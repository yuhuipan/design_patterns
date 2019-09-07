package com.yuhui.behaviour_patterns.mediator;

public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Calender calender = new Calender();
        CoffeePot coffeePot = new CoffeePot();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, calender, coffeePot, sprinkler);
        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
