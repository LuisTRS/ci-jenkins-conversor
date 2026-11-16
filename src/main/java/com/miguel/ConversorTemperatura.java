package com.miguel;

public class ConversorTemperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32.0
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) / 1.8;
    }
}