package homework2From29112023;
import java.util.Scanner;

public class T10CharacterComparison {
        public static void main(String[] args) {
            Scanner CharacterComparison = new Scanner(System.in);

            System.out.print("Enter the first one character: ");
            char char1 = CharacterComparison.next().charAt(0);

            System.out.print("Enter the second one character:: ");
            char char2 = CharacterComparison.next().charAt(0);

            if (char1 == char2) {
                System.out.println("The characters are the same");
            } else {
                System.out.println("The characters are not the same");
            }
        }
}


