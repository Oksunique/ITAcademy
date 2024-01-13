package homework2From29112023;
import java.util.Scanner;

public class T9SidesTriangle {
    public static void main(String[] args) {

        Scanner ScanSidesTriangle = new Scanner(System.in);
        System.out.println ("Enter sides of a Triangle: ");

        int STa = ScanSidesTriangle.nextInt();
        int STb = ScanSidesTriangle.nextInt();
        int STc = ScanSidesTriangle.nextInt();

        if (STa + STb >= STc & STa + STc >= STb & STb + STc >= STa)
            System.out.println("The triangle is possible");
        else
            System.out.println("The triangle is not possible");
    }
}
