package com.example.geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        printInfo();
    }

    private void printInfo() {
        double perimeter = 2 * Math.PI * radius; // длина окружности
        double area = Math.PI * radius * radius;
        System.out.printf("Круг: периметр (длина окружности) = %.2f, площадь = %.2f%n", perimeter, area);
    }
}