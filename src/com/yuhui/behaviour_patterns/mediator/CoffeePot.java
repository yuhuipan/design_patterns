package com.yuhui.behaviour_patterns.mediator;

public class CoffeePot extends Colleague {
    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot");
    }
}
