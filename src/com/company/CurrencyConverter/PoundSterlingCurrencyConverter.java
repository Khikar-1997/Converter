package com.company.CurrencyConverter;

import com.company.CurrencyUnit.*;

public class PoundSterlingCurrencyConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currencyUnit;
        if (unit instanceof Dollar) {
            currencyUnit = unit.getCurrencyUnit() * 0.769576;
        } else if (unit instanceof Dram) {
            currencyUnit = unit.getCurrencyUnit() * 0.00161007;
        } else if (unit instanceof Euro) {
            currencyUnit = unit.getCurrencyUnit() * 0.852009;
        } else if (unit instanceof Ruble) {
            currencyUnit = unit.getCurrencyUnit() * 0.0119882;
        } else {
            currencyUnit = unit.getCurrencyUnit();
        }
        PoundSterling poundSterling = new PoundSterling();
        poundSterling.setCurrencyUnit(currencyUnit);
        return poundSterling;
    }
}