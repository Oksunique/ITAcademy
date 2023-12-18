package Homework3From04122023;
import java.util.Scanner;

public class EvenIntegerKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The integer number " + number + " is even.");
        } else {
            System.out.println("The integer number " + number + " isn't even.");
        }
    }
}
