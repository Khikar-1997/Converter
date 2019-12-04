package com.company.CurrencyUnit;

public class Ruble extends AbstractCurrencyUnit {
    public Ruble(double currencyUnit) {
        super(currencyUnit);
    }

    public Ruble() {
    }

    @Override
    public void printConverter() {
        System.out.println(getCurrencyUnit() + " RUB");
    }
}
