package com.yuhui.behaviour_patterns.mediator;

public class Calender extends Colleague {
    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender(){
        System.out.println("doCalender");
    }
}
