import org.junit.Test;
import static org.junit.Assert.*;

public class EquilateralTriangleTest {

    @Test
    public void testEquilateralTriangle1() {
        boolean result = EquilateralTriangle.isEquilateral(5, 5, 5);
        assertTrue("5, 5, 5 should form an equilateral triangle", result);
    }

    @Test
    public void testEquilateralTriangle2() {
        boolean result = EquilateralTriangle.isEquilateral(7.2, 7.2, 7.2);
        assertTrue("7.2, 7.2, 7.2 should form an equilateral triangle", result);
    }

    @Test
    public void testNotEquilateral() {
        boolean result = EquilateralTriangle.isEquilateral(3, 4, 5);
        assertFalse("3, 4, 5 should not form an equilateral triangle", result);
    }

    @Test
    public void testInvalidTriangle() {
        boolean result = EquilateralTriangle.isEquilateral(1, 2, 3);
        assertFalse("1, 2, 3 should not form a valid triangle", result);
    }

    @Test
    public void testZeroSide() {
        boolean result = EquilateralTriangle.isEquilateral(0, 5, 5);
        assertFalse("Zero-length side should not form a triangle", result);
    }
}
