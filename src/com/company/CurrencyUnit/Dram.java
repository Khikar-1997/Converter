package com.company.CurrencyUnit;

public class Dram extends AbstractCurrencyUnit {
    public Dram(double currencyUnit) {
        super(currencyUnit);
    }

    public Dram() {
    }

    @Override
    public void printConverter() {
        System.out.println(getCurrencyUnit() + " AMD");
    }
}
