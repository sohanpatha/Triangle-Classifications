import java.util.*;

public class EquilateralTriangle {

    public static boolean isEquilateral(double a, double b, double c) {
       
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }
       
        return (a == b) && (b == c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (isEquilateral(a, b, c))
            System.out.println("Forms an equilateral triangle");
        else
            System.out.println("Does not form an equilateral triangle");
    }
}
