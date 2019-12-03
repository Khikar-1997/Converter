package com.company.Converter;

import com.company.Temperature.AbstractTemperatureUnit;
import com.company.Temperature.Celsius;
import com.company.Temperature.Farenheigth;
import com.company.Temperature.Kelvin;

public class FarenheigthConverter implements Converter {
    @Override
    public AbstractTemperatureUnit convert(AbstractTemperatureUnit unit) {
        double temp;
        if (unit instanceof Celsius) {
            temp = (unit.getTemperature() * 9 / 5) + 32;
        } else if (unit instanceof Kelvin) {
            temp = (((unit.getTemperature() - 273.15) * 9 / 5)) + 32;
        } else {
            temp = unit.getTemperature();
        }
        Farenheigth farenheigth = new Farenheigth();
        farenheigth.setTemperature(temp);
        return farenheigth;
    }
}
