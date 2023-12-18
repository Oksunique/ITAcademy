package Homework3From04122023;
import java.util.Scanner;

public class FingerNumberName {
    public static void main(String[] args) {
        Scanner fingerNumberEntered = new Scanner(System.in);
        System.out.print("Enter the sequence number of the finger (from 1 to 5): ");
        int fingerNumber = fingerNumberEntered.nextInt();

        String fingerName;

        switch (fingerNumber) {
            case 1:
                fingerName = "the thumb of the hand";
                break;
            case 2:
                fingerName = "the index finger of the hand";
                break;
            case 3:
                fingerName = "the middle finger of the hand";
                break;
            case 4:
                fingerName = "the ring finger of the hand";
                break;
            case 5:
                fingerName = "the little finger of the hand";
                break;
            default:
                fingerName = "non-existent for normal human";
                break;
        }

        System.out.println("The finger with number " + fingerNumber + " is called " + fingerName);
    }
}
