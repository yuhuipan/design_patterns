package com.yuhui.behaviour_patterns.memento;

/**
 * Originator Interface
 * 原始对象接口
 */
public interface Calculator {
    // create memento
    PreviousCalculationToCareTaker backupLastCalculation();

    // setMemento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
