package Homework4From06122023;
import java.util.Scanner;

public class SumAndProductDigitsNumber {public static void main(String[] args) {
    Scanner scannerNumber = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = scannerNumber.nextInt();

    int sum = 0;
    int product = 1;

    while (number != 0) {
        int digitOfNumber = number % 10;
        sum = sum+digitOfNumber;
        product = product*digitOfNumber;
        number =number/ 10;
    }

    System.out.println("The sum of digits of number is: " + sum);
    System.out.println("The product of digits of number is: " + product);
}
}
