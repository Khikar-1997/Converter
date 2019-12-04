package com.company.CurrencyConverter;

import com.company.CurrencyUnit.*;

public class RubleCurrencyConverter implements Converter {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currencyUnit;
        if (unit instanceof Dollar) {
            currencyUnit = unit.getCurrencyUnit() * 63.7;
        } else if (unit instanceof Dram) {
            currencyUnit = unit.getCurrencyUnit() * 0.13;
        } else if (unit instanceof Euro) {
            currencyUnit = unit.getCurrencyUnit() * 70.55;
        } else if (unit instanceof PoundSterling) {
            currencyUnit = unit.getCurrencyUnit() * 83.4224;
        } else {
            currencyUnit = unit.getCurrencyUnit();
        }
        Ruble ruble = new Ruble();
        ruble.setCurrencyUnit(currencyUnit);
        return ruble;
    }
}
