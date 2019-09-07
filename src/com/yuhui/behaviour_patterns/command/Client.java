package com.yuhui.behaviour_patterns.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        invoker.setOnCommand(lightOnCommand,0);
        invoker.setOffCommand(lightOffCommand,0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }
}
