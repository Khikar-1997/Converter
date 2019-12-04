package com.company.CurrencyConverter;

import com.company.CurrencyUnit.*;

public class EuroCurrencyConverter implements Converter {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currencyUnit;
        if (unit instanceof Dollar) {
            currencyUnit = unit.getCurrencyUnit() * 0.9;
        } else if (unit instanceof Dram) {
            currencyUnit = unit.getCurrencyUnit() * 0.0019;
        } else if (unit instanceof PoundSterling) {
            currencyUnit = unit.getCurrencyUnit() * 1.17365;
        } else if (unit instanceof Ruble) {
            currencyUnit = unit.getCurrencyUnit() * 0.014;
        } else {
            currencyUnit = unit.getCurrencyUnit();
        }
        Euro euro = new Euro();
        euro.setCurrencyUnit(currencyUnit);
        return euro;
    }
}
