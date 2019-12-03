package com.company.Temperature;

public class Celsius extends AbstractTemperatureUnit implements PrintConverter {
    @Override
    public void printConverter() {
        System.out.println(getTemperature() + " °C");
    }
}
