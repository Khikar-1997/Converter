package com.company.Temperature;

public class Farenheigth extends AbstractTemperatureUnit {
    @Override
    public void printConverter() {
        System.out.println(getTemperature() + " F");
    }
}
