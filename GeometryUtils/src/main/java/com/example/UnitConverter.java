package com.example.geometry.utils;

public final class UnitConverter {

    private UnitConverter() {} // утилитный класс — не создаём экземпляры

    public static double metersToCentimeters(double meters) {
        return meters * 100.0;
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100.0;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double cm) {
        return cm / 2.54;
    }
}