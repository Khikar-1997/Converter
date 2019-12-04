package com.company.CurrencyConverter;

import com.company.CurrencyUnit.AbstractCurrencyUnit;

public interface Converter {
    AbstractCurrencyUnit convert(AbstractCurrencyUnit unit);
}
