package homework3From04122023;
import java.util.Scanner;

public class AverageNumberEnteredKeyboard {
    public static void main(String[] args) {
        Scanner NumberEnteredKeyboard = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = NumberEnteredKeyboard.nextInt();

        System.out.println("Enter the second number:");
        int number2 = NumberEnteredKeyboard.nextInt();

        System.out.println("Enter the thrid number:");
        int number3 = NumberEnteredKeyboard.nextInt();

        int averageNumber = number1 > number2 ? (number1 < number3 ? number1 : (number2 > number3 ? number2 : number3))
                : (number2 < number3 ? number2 : (number1 > number3 ? number1 : number3));

        System.out.println("Arifmetic average among the numbers entered from the keyboard: " + averageNumber);
    }
}
