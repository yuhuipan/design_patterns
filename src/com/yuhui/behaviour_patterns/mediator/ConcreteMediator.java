package com.yuhui.behaviour_patterns.mediator;

/**
 * 集中相关对象之间复杂的沟通和控制方式
 * <p>
 * java.util.Timer
 * java.util.concurrent.Executor#execute()
 * submit() and invokeXXX() methods of java.util.concurrent.ExecutorService
 * scheduleXXX() methods of java.util.concurrent.ScheduledExecutorService
 * java.lang.reflect.Method#invoke()
 */
public class ConcreteMediator extends Mediator {
    private Alarm alarm;
    private Calender calender;
    private CoffeePot coffeePot;
    private Sprinkler sprinkler;

    public ConcreteMediator(Alarm alarm, Calender calender, CoffeePot coffeePot, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.calender = calender;
        this.coffeePot = coffeePot;
        this.sprinkler = sprinkler;
    }

    public ConcreteMediator() {

    }

    @Override
    void doEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                break;
            case "calender":
                doCalender();
                break;
            case "coffeePot":
                doCoffeePot();
                break;
            default:
                doSprinkler();
        }
    }

    private void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    private void doCalender() {
        // ...
    }

    private void doCoffeePot() {
        // ...
    }

    private void doSprinkler() {
        // ...
    }
}
