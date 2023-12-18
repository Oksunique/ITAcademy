package Homework2From29112023;
import java.util.Scanner;
public class T8RadiusCircleAreaCircumference {
    public static void main(String[] args) {

        Scanner ScanRadiusCircle = new Scanner(System.in);
        System.out.println ("Enter radius of a circle: ");
        double RadiusCircle = ScanRadiusCircle.nextDouble();

        double area = Math.PI * (RadiusCircle * RadiusCircle);
        System.out.println("Area of the circle is equal to: " + area);

        double circumference= Math.PI * 2*RadiusCircle;
        System.out.println("Circumference is equal to: " + circumference) ;
    }
}
