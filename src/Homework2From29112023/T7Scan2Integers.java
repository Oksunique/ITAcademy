package Homework2From29112023;
import java.util.Scanner;

public class T7Scan2Integers {
    public static void main(String[] args) {

        Scanner Scan2Integers = new Scanner(System.in);
        System.out.println ("Enter two any integers: ");
        int number1 = Scan2Integers.nextInt();
        int number2 = Scan2Integers.nextInt();

        int sum2Integers = number1 + number2;
        int difference2Integers = number1 - number2;
        int product2Integers = number1 * number2;
        int quotient2Integers = number1 / number2;

        System.out.println("Sum of 2 integers is equal to:"+ sum2Integers);
        System.out.println("Difference of 2 integers is equal to:"+difference2Integers);
        System.out.println("Product of 2 integers is equal to:"+product2Integers);
        System.out.println("Quotient of 2 integers is equal to:"+quotient2Integers);
    }
}
