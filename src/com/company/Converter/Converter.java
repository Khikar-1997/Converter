package com.company.Converter;

import com.company.Temperature.AbstractTemperatureUnit;

public interface Converter {
    AbstractTemperatureUnit convert(AbstractTemperatureUnit unit);
}
