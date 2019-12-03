package com.company.Temperature;

public abstract class AbstractTemperatureUnit implements PrintConverter{
    private double temperature;

    public AbstractTemperatureUnit(double temperature) {
        this.temperature = temperature;
    }

    public AbstractTemperatureUnit() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
