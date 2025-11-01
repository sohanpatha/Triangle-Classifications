package com.triangle;

public class IsoscelesTriangle {

    public static String checkIsosceles(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid sides";
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Not a triangle";
        }
        if (a == b || b == c || a == c) {
            return "Isosceles triangle";
        }
        return "Not an isosceles triangle";
    }
}

