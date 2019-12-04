package com.company;

import com.company.CurrencyConverter.*;
import com.company.CurrencyUnit.*;

public class Main {

    public static void main(String[] args) {
        Dollar dollar = new Dollar(100);
        Dram dram = new Dram(400);
        Euro euro = new Euro(100);
        PoundSterling poundSterling = new PoundSterling(100);
        Ruble ruble = new Ruble(200);

        Converter dollarCurrencyConverter = new DollarCurrencyConverter();
        AbstractCurrencyUnit convertDramToDollar = dollarCurrencyConverter.convert(dram);
        System.out.print("Dram to Dollar = ");
        convertDramToDollar.printConverter();
        AbstractCurrencyUnit convertEuroToDollar = dollarCurrencyConverter.convert(euro);
        System.out.print("Euro to Dollar = ");
        convertEuroToDollar.printConverter();
        AbstractCurrencyUnit convertPoundSterlingToDollar = dollarCurrencyConverter.convert(poundSterling);
        System.out.print("Pound-sterling to Dollar = ");
        convertPoundSterlingToDollar.printConverter();
        AbstractCurrencyUnit convertRubleToDollar = dollarCurrencyConverter.convert(ruble);
        System.out.print("Ruble to Dollar = ");
        convertRubleToDollar.printConverter();
        AbstractCurrencyUnit convertDollarToDollar = dollarCurrencyConverter.convert(dollar);
        System.out.print("Dollar to Dollar = ");
        convertDollarToDollar.printConverter();

        System.out.println();

        Converter dramCurrencyConverter = new DramCurrencyConverter();
        AbstractCurrencyUnit convertDollarToDram = dramCurrencyConverter.convert(dollar);
        System.out.print("Dollar to Dram = ");
        convertDollarToDram.printConverter();
        AbstractCurrencyUnit convertEuroToDram = dramCurrencyConverter.convert(euro);
        System.out.print("Euro to Dram = ");
        convertEuroToDram.printConverter();
        AbstractCurrencyUnit convertPoundSterlingToDram = dramCurrencyConverter.convert(poundSterling);
        System.out.print("Pound-sterling to Dram = ");
        convertPoundSterlingToDram.printConverter();
        AbstractCurrencyUnit convertRubleToDram = dramCurrencyConverter.convert(ruble);
        System.out.print("Ruble to Dram = ");
        convertRubleToDram.printConverter();
        AbstractCurrencyUnit convertDramToDram = dramCurrencyConverter.convert(dram);
        System.out.print("Dram to Dram = ");
        convertDramToDram.printConverter();

        System.out.println();

        Converter euroCurrencyConverter = new EuroCurrencyConverter();
        AbstractCurrencyUnit convertDollarToEuro = euroCurrencyConverter.convert(dollar);
        System.out.print("Dollar to Euro = ");
        convertDollarToEuro.printConverter();
        AbstractCurrencyUnit convertDramToEuro = euroCurrencyConverter.convert(dram);
        System.out.print("Dram to Euro = ");
        convertDramToEuro.printConverter();
        AbstractCurrencyUnit convertPoundSterlingToEuro = euroCurrencyConverter.convert(poundSterling);
        System.out.print("Pound-sterling to Euro = ");
        convertPoundSterlingToEuro.printConverter();
        AbstractCurrencyUnit convertRubleToEuro = euroCurrencyConverter.convert(ruble);
        System.out.print("Ruble to Euro = ");
        convertRubleToEuro.printConverter();
        AbstractCurrencyUnit convertEuroToEuro = euroCurrencyConverter.convert(euro);
        System.out.print("Euro to Euro = ");
        convertEuroToEuro.printConverter();

        System.out.println();

        Converter poundSterlingCurrencyConverter = new PoundSterlingCurrencyConverter();
        AbstractCurrencyUnit convertDollarToPoundSterling = poundSterlingCurrencyConverter.convert(dollar);
        System.out.print("Dollar to Pound-sterling = ");
        convertDollarToPoundSterling.printConverter();
        AbstractCurrencyUnit convertDramToPoundSterling = poundSterlingCurrencyConverter.convert(dram);
        System.out.print("Dram to Pound-sterling = ");
        convertDramToPoundSterling.printConverter();
        AbstractCurrencyUnit convertEuroToPoundSterling = poundSterlingCurrencyConverter.convert(euro);
        System.out.print("Euro to Pound-sterling = ");
        convertEuroToPoundSterling.printConverter();
        AbstractCurrencyUnit convertRubleToPoundSterling = poundSterlingCurrencyConverter.convert(ruble);
        System.out.print("Ruble to Pound-sterling = ");
        convertRubleToPoundSterling.printConverter();
        AbstractCurrencyUnit convertPoundSterlingToPoundSterling = poundSterlingCurrencyConverter.convert(poundSterling);
        System.out.print("Pound-sterling to Pound-sterling = ");
        convertPoundSterlingToPoundSterling.printConverter();

        System.out.println();

        Converter rubleCurrencyConverter = new RubleCurrencyConverter();
        AbstractCurrencyUnit convertDollarToRuble = rubleCurrencyConverter.convert(dollar);
        System.out.print("Dollar to Ruble = ");
        convertDollarToRuble.printConverter();
        AbstractCurrencyUnit convertDramToRuble = rubleCurrencyConverter.convert(dram);
        System.out.print("Dram to Ruble = ");
        convertDramToRuble.printConverter();
        AbstractCurrencyUnit convertEuroToRuble = rubleCurrencyConverter.convert(euro);
        System.out.print("Euro to Ruble = ");
        convertEuroToRuble.printConverter();
        AbstractCurrencyUnit convertPoundSterlingToRuble = rubleCurrencyConverter.convert(poundSterling);
        System.out.print("Pound-sterling to Ruble = ");
        convertPoundSterlingToRuble.printConverter();
        AbstractCurrencyUnit convertRubletoRuble = rubleCurrencyConverter.convert(ruble);
        System.out.print("Ruble to Ruble = ");
        convertRubletoRuble.printConverter();
    }
}