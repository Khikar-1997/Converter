package com.company.CurrencyUnit;

public class Dollar extends AbstractCurrencyUnit {
    public Dollar(double currencyUnit) {
        super(currencyUnit);
    }

    public Dollar() {
    }

    @Override
    public void printConverter() {
        System.out.println(getCurrencyUnit() + " USD");
    }
}
