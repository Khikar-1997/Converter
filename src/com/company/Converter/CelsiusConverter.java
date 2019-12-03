package com.company.Converter;

import com.company.Temperature.AbstractTemperatureUnit;
import com.company.Temperature.Celsius;
import com.company.Temperature.Farenheigth;
import com.company.Temperature.Kelvin;

public class CelsiusConverter implements Converter {

    @Override
    public AbstractTemperatureUnit convert(AbstractTemperatureUnit unit) {
        double temp;
        if (unit instanceof Farenheigth) {
            temp = (unit.getTemperature() - 32) * 5 / 9;
        } else if (unit instanceof Kelvin) {
            temp = unit.getTemperature() - 273.15;
        } else {
            temp = unit.getTemperature();
        }
        Celsius celsius = new Celsius();
        celsius.setTemperature(temp);
        return celsius;
    }
}
