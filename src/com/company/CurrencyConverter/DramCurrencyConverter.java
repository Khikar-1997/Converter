package com.company.CurrencyConverter;

import com.company.CurrencyUnit.*;

public class DramCurrencyConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currencyUnit;
        if (unit instanceof Dollar) {
            currencyUnit = unit.getCurrencyUnit() * 477.4;
        } else if (unit instanceof Euro) {
            currencyUnit = unit.getCurrencyUnit() * 528.39;
        } else if (unit instanceof PoundSterling) {
            currencyUnit = unit.getCurrencyUnit() * 621.167;
        } else if (unit instanceof Ruble) {
            currencyUnit = unit.getCurrencyUnit() * 7.49;
        } else {
            currencyUnit = unit.getCurrencyUnit();
        }
        Dram dram = new Dram();
        dram.setCurrencyUnit(currencyUnit);
        return dram;
    }
}
