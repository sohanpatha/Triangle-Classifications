
import java.util.Scanner;

public class ScaleneTriangle {

    public static boolean isScalene(double a, double b, double c) {

        
        if (a <= 0 || b <= 0 || c <= 0) {
            return false; // Negative or zero values → Not valid
        }

        
        if (!(a + b > c && a + c > b && b + c > a)) {
            return false;
        }

        
        return (a != b && b != c && a != c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if (isScalene(a, b, c)) {
            System.out.println("It is a Scalene Triangle ");
        } else {
            System.out.println("Not a Scalene Triangle ");
        }

        sc.close();
    }
}

