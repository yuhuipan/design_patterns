package com.yuhui.behaviour_patterns.memento;

/**
 * CareTaker object
 */
public class Client {
    public static void main(String[] args) {
        // program starts
        Calculator calculator = new CalculatorImpl();

        // assume user enters two number
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(100);

        // first result
        System.out.println(calculator.getCalculationResult());

        // store result of this calculation in case of error
        PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();

        // user enters a number
        calculator.setFirstNumber(17);

        // user enters a wrong second number and calculates result
        calculator.setSecondNumber(-290);

        // calculate result
        System.out.println(calculator.getCalculationResult());

        // user hits CTRL + Z to undo last operation and set last result
        calculator.restorePreviousCalculation(memento);

        // result restored
        System.out.println(calculator.getCalculationResult());


    }
}
