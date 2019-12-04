package com.company.CurrencyConverter;

import com.company.CurrencyUnit.*;

public class DollarCurrencyConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currencyUnit;
        if (unit instanceof Dram) {
            currencyUnit = unit.getCurrencyUnit() * 0.0021;
        } else if (unit instanceof Euro) {
            currencyUnit = unit.getCurrencyUnit() * 1.11;
        } else if (unit instanceof PoundSterling) {
            currencyUnit = unit.getCurrencyUnit() * 1.29932;
        } else if (unit instanceof Ruble) {
            currencyUnit = unit.getCurrencyUnit() * 0.016;
        } else {
            currencyUnit = unit.getCurrencyUnit();
        }
        Dollar dollar = new Dollar();
        dollar.setCurrencyUnit(currencyUnit);
        return dollar;
    }
}
