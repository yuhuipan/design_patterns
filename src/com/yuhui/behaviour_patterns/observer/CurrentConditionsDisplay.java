package com.yuhui.behaviour_patterns.observer;

public class CurrentConditionsDisplay implements Observer {
    public CurrentConditionsDisplay(Subject WeatherData) {
        WeatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}
