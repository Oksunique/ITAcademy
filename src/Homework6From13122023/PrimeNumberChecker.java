package Homework6From13122023;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner enteredNumber = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = enteredNumber.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " - prime number");
        } else {
            System.out.println(number + " - not prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
