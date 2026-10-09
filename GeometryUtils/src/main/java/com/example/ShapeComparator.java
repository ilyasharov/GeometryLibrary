package com.example.geometry.utils;

import com.example.geometry.Circle;

public final class ShapeComparator {

    private ShapeComparator() {}

    /**
     * Сравнивает площади двух фигур.
     * @return отрицательное, если areaA < areaB; 0, если равны; положительное, если areaA > areaB
     */
    public static int compareAreas(double areaA, double areaB, double epsilon) {
        if (Math.abs(areaA - areaB) < epsilon) {
            return 0;
        }
        return Double.compare(areaA, areaB);
    }

    /** Сравнение двух кругов по площади. */
    public static int compareCircles(Circle c1, Circle c2) {
        return 0;
    }

}