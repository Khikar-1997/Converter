package com.company;

import com.company.Converter.CelsiusConverter;
import com.company.Converter.Converter;
import com.company.Converter.FarenheigthConverter;
import com.company.Converter.KelvinConverter;
import com.company.Temperature.AbstractTemperatureUnit;
import com.company.Temperature.Celsius;
import com.company.Temperature.Farenheigth;
import com.company.Temperature.Kelvin;

public class Main {

    public static void main(String[] args) {
        Celsius celsius = new Celsius();
        celsius.setTemperature(100);

        Kelvin kelvin = new Kelvin();
        kelvin.setTemperature(200);

        Farenheigth farenheigth = new Farenheigth();
        farenheigth.setTemperature(100);

        Converter farenheigthConverter = new FarenheigthConverter();
        AbstractTemperatureUnit convertCelsiusToFarenheigth = farenheigthConverter.convert(celsius);
        System.out.print("Celsius to Farenheigth = ");
        convertCelsiusToFarenheigth.printConverter();
        AbstractTemperatureUnit convertKelvinToFarenheigth = farenheigthConverter.convert(kelvin);
        System.out.print("Kelvin to Farenheigth = ");
        convertKelvinToFarenheigth.printConverter();
        AbstractTemperatureUnit convertFarenheigthToFarenheigth = farenheigthConverter.convert(farenheigth);
        System.out.print("Farenheigth to Farenheigth = ");
        convertFarenheigthToFarenheigth.printConverter();

        System.out.println();

        Converter celsiusConverter = new CelsiusConverter();
        AbstractTemperatureUnit convertFarenheigthToCelsius = celsiusConverter.convert(farenheigth);
        System.out.print("Farenheigth to Celsius = ");
        convertFarenheigthToCelsius.printConverter();
        AbstractTemperatureUnit convertKelvinToCelsius = celsiusConverter.convert(kelvin);
        System.out.print("Kelvin to Celsius = ");
        convertKelvinToCelsius.printConverter();
        AbstractTemperatureUnit convertCelsiusToCelsius = celsiusConverter.convert(celsius);
        System.out.print("Celsius to Celsius = ");
        convertCelsiusToCelsius.printConverter();

        System.out.println();

        Converter kelvinConverter = new KelvinConverter();
        AbstractTemperatureUnit convertCelsiusToKelvin = kelvinConverter.convert(celsius);
        System.out.print("Celsius to Kelvin = ");
        convertCelsiusToKelvin.printConverter();
        AbstractTemperatureUnit convertFarenheigthToKelvin = kelvinConverter.convert(farenheigth);
        System.out.print("Farenheigth to Kelvin = ");
        convertFarenheigthToKelvin.printConverter();
        AbstractTemperatureUnit convertKelvinToKelvin = kelvinConverter.convert(kelvin);
        System.out.print("Kelvin to Kelvin = ");
        convertKelvinToKelvin.printConverter();
    }
}
