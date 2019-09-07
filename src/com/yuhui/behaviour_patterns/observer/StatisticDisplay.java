package com.yuhui.behaviour_patterns.observer;

public class StatisticDisplay implements Observer {
    public StatisticDisplay(Subject WeatherData) {
        WeatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
    }
}
