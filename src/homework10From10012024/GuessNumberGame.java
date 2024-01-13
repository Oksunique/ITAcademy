package homework10From10012024;
import java.util.Scanner;
//Реализуйте игру “Угадай число” от 1 до 100 с подсказкой - “искомое число больше/меньше”
//При неправильном вводе, обработайте ошибку и сообщите пользователю

public class GuessNumberGame {
    public static void main(String[] args) {

        int secretNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game 'Guess the number'! Enter a number from 1 to 100:");

        while (true) {
            int guessNumber = 0;
            try {
                //преобразование введенной пользователем строки в целое число с помощью метода Integer.parseInt
                // и считывание введенного пользователем числа с помощью метода (scanner.nextLine())
                guessNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Enter the correct number.");
                continue;
            }

            if (guessNumber < 1 || guessNumber > 100) {
                System.out.println("Error! The number should be from 1 to 100.");
                continue;
            }

            if (guessNumber < secretNumber) {
                System.out.println("The number you're looking for is greater.");
            } else if (guessNumber > secretNumber) {
                System.out.println("The number you're looking for is less.");
            } else {
                System.out.println("Congratulations! You guessed the number" + secretNumber);
                break;
            }
        }
        scanner.close();
    }
}
