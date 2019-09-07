package com.yuhui.behaviour_patterns.mediator;

public class Sprinkler extends Colleague {
    @Override
    void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler");
    }
}
