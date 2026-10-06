package com.example.geometry;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        printInfo();
    }

    private void printInfo() {
        double perimeter = 2 * (width + height);
        double area = width * height;
        System.out.printf("Прямоугольник: периметр = %.2f, площадь = %.2f%n", perimeter, area);
    }
}