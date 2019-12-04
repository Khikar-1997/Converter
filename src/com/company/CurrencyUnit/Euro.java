package com.company.CurrencyUnit;

public class Euro extends AbstractCurrencyUnit {
    public Euro(double currencyUnit) {
        super(currencyUnit);
    }

    public Euro() {
    }

    @Override
    public void printConverter() {
        System.out.println(getCurrencyUnit() + " EUR");
    }
}
