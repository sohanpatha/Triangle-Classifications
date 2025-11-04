import org.junit.Assert;
import org.junit.Test;

public class ScaleneTriangleTest {

    @Test
    public void testValidScalene() {
        Assert.assertTrue("3,4,5 should be scalene", ScaleneTriangle.isScalene(3, 4, 5));
        System.out.println("✅ Test Passed — 3,4,5 is a valid scalene triangle");
    }

    @Test
    public void testNotScaleneEqualSides() {
        Assert.assertFalse("5,5,8 should not be scalene", ScaleneTriangle.isScalene(5, 5, 8));
        System.out.println("✅ Test Passed — 5,5,8 is NOT a scalene triangle");
    }

    @Test
    public void testNotScaleneTriangleInequality() {
        Assert.assertFalse("1,2,3 cannot form triangle", ScaleneTriangle.isScalene(1, 2, 3));
        System.out.println("✅ Test Passed — 1,2,3 cannot form a triangle");
    }

    @Test
    public void testNegativeValues() {
        Assert.assertFalse("-3,4,5 should be invalid", ScaleneTriangle.isScalene(-3, 4, 5));
        System.out.println("✅ Test Passed — Negative values are not accepted");
    }

    @Test
    public void testDecimalValues() {
        Assert.assertTrue("3.5,4.6,5.7 should be scalene", ScaleneTriangle.isScalene(3.5, 4.6, 5.7));
        System.out.println("✅ Test Passed — Decimal values forming scalene triangle accepted");
    }
}
