package Homework4From06122023;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scannerNumber.nextInt();
        int factorial = 1;
        int i;

        if (number < 0) {
            System.out.println("Please enter a number greater than 0!");
        } else {
            for ( i = 1 ; i <= number ; i++ )
                factorial = factorial*i;
            System.out.println("Factorial " + number + " is " + factorial);
        }

    }


}


