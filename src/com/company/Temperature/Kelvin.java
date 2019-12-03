package com.company.Temperature;

public class Kelvin extends AbstractTemperatureUnit {
    @Override
    public void printConverter() {
        System.out.println(getTemperature() + " K");
    }
}
