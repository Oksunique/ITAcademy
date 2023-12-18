package lesson3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner ScanSidesTriangle = new Scanner(System.in);
        System.out.println ("Enter the age: ");

        int STa = ScanSidesTriangle.nextInt();
        int STb = ScanSidesTriangle.nextInt();
        int STc = ScanSidesTriangle.nextInt();

        if (STa + STb >= STc & STa + STc >= STb & STb + STc >= STa)
            System.out.println("It is allowed to go for a walk alone");
        else
            System.out.println("It is not allowed to go for a walk alone");
    }
}

