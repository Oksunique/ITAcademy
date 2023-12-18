package Homework6From13122023;
import java.util.Scanner;

public class RootsRealQuadraticEquation {
    public static void main(String[] args) {
        Scanner valuesCoefficient = new Scanner(System.in);

        System.out.println("Enter the values of the coefficients a, b and c of the quadratic equation ax^2 + bx + c = 0:");
        double a = valuesCoefficient.nextDouble();
        double b = valuesCoefficient.nextDouble();
        double c = valuesCoefficient.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + " и " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root: " + root);
        } else {
            System.out.println("There are no roots");
        }
    }
}
