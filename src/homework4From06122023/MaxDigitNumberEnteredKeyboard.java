package homework4From06122023;
import java.util.Scanner;

public class MaxDigitNumberEnteredKeyboard {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scannerNumber.nextInt();

        int digitIndex = 0;
        int index = 0;
        int temp = number;

        int maxDigit = 0;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
                digitIndex = index;
            }
            temp = temp/10;
            index = index+1;
        }

        System.out.println("The maximum digit of the number: " + maxDigit);
        System.out.println("Index of the maximum digit of the number: " + digitIndex);
    }
}
