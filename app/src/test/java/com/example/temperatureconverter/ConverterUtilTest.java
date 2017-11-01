package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by William on 10/30/2017.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float celsiusRoomTemp = ConverterUtil.convertFahrenheitToCelsius(212);
        assertEquals("Conversion from celsius to fahrenheit failed", 100, celsiusRoomTemp, 0.001);

    }
    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float fehrenheitRoomTemp = ConverterUtil.convertCelsiusToFahrenheit(100);
        assertEquals("Conversion from celsius to fahrenheit failed", 212, fehrenheitRoomTemp, 0.001);
    }
}
