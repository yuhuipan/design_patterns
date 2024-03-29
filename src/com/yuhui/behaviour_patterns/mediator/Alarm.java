package com.yuhui.behaviour_patterns.mediator;

public class Alarm extends Colleague {
    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
