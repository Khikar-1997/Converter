package com.company.CurrencyUnit;

public abstract class AbstractCurrencyUnit implements PrintConverter{
    private double currencyUnit;

    public AbstractCurrencyUnit(double currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public AbstractCurrencyUnit() {
    }

    public double getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(double currencyUnit) {
        this.currencyUnit = currencyUnit;
    }
}
