package com.triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesTriangleTest {
    @Test
    void testValidIsosceles() {
        assertEquals("Isosceles triangle", IsoscelesTriangle.checkIsosceles(5, 5, 8));
    }
    @Test
    void testIsoscelesPermutations() {
        assertEquals("Isosceles triangle", IsoscelesTriangle.checkIsosceles(3, 3, 4));
        assertEquals("Isosceles triangle", IsoscelesTriangle.checkIsosceles(3, 4, 3));
        assertEquals("Isosceles triangle", IsoscelesTriangle.checkIsosceles(4, 3, 3));
    }
    @Test
    void testZeroSide() {
        assertEquals("Invalid sides", IsoscelesTriangle.checkIsosceles(0, 3, 4));
    }
    @Test
    void testNegativeSide() {
        assertEquals("Invalid sides", IsoscelesTriangle.checkIsosceles(-2, 3, 4));
    }
    @Test
    void testSumOfTwoSidesEqualThird() {
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(1, 2, 3));
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(1, 3, 2));
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(3, 1, 2));
    }
    @Test
    void testSumOfTwoSidesLessThanThird() {
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(1, 2, 4));
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(1, 4, 2));
        assertEquals("Not a triangle", IsoscelesTriangle.checkIsosceles(4, 1, 2));
    }
    @Test
    void testAllZeroSides() {
        assertEquals("Invalid sides", IsoscelesTriangle.checkIsosceles(0, 0, 0));
    }
    @Test
    void testNonIntegerValues() {
        assertEquals("Isosceles triangle", IsoscelesTriangle.checkIsosceles(2.5, 2.5, 3.5));
    }
}
