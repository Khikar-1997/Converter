package com.company.CurrencyUnit;

public class PoundSterling extends AbstractCurrencyUnit {
    public PoundSterling(double currencyUnit) {
        super(currencyUnit);
    }

    public PoundSterling() {
    }

    @Override
    public void printConverter() {
        System.out.println(getCurrencyUnit() + " GBP");
    }
}
