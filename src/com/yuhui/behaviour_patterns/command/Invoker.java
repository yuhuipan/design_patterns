package com.yuhui.behaviour_patterns.command;

/**
 * 遥控器
 */
public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private final int SLOT_NUM = 7;

    public Invoker() {
        this.onCommands = new Command[SLOT_NUM];
        this.offCommands = new Command[SLOT_NUM];
    }

    public void setOnCommand(Command onCommand, int slot) {
        this.onCommands[slot] = onCommand;
    }

    public void setOffCommand(Command offCommand, int slot) {
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
