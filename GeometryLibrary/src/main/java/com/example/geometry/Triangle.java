package com.example.geometry;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        printInfo();
    }

    private void printInfo() {
        double perimeter = a + b + c;
        double p = perimeter / 2.0;
        
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Треугольник: периметр = %.2f, площадь = %.2f%n", perimeter, area);
    }
}
