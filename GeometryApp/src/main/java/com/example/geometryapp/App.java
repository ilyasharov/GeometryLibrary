package com.example.geometryapp;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometry.utils.UnitConverter;

public class App {
    public static void main(String[] args) {
        new Triangle(3, 4, 5);
        new Rectangle(4, 6);
        new Circle(5);

        double meters = 2.5;
        System.out.printf("%.2f м = %.2f см%n",
                meters, UnitConverter.metersToCentimeters(meters));
    }
}