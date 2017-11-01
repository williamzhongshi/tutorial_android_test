package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void toFahrenheitisCorrect() throws Exception {
        assertEquals( "Wrong value converting to celsius", 212, ConverterUtil.convertCelsiusToFahrenheit(100), 0.01);
    }
    @Test
    public void toCelsius_isCorrect() throws Exception {
        assertEquals( "Wrong value converting to celsius", 100, ConverterUtil.convertFahrenheitToCelsius(212), 0.01);
    }
}