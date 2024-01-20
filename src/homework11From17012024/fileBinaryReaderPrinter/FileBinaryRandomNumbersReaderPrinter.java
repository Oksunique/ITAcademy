package homework11From17012024.fileBinaryReaderPrinter;
import java.io.*;
import java.util.Random;
//Записать в двоичный файл 30 случайных чисел от 1 до 100.
// Прочитать записанный файл . Распечатать числа и их среднее арифметическое
//тут используем классы DataOutputStream и DataInputStream

public class FileBinaryRandomNumbersReaderPrinter {
    public static void main(String[] args) {
        writeRandomNumbersToFile();
        int[] numbers = readNumbersFromFile();
        printNumbersAndAverage(numbers);
    }

    private static void writeRandomNumbersToFile() {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("numbers.bin"))) {
            Random random = new Random();
            for (int i = 0; i < 30; i++) {
                int randomNumber = random.nextInt(100) + 1; // Генерирую случайное число от 1 до 100
                output.writeInt(randomNumber); // Записываю число в двоичный файл
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] readNumbersFromFile() {
        int[] numbers = new int[30];
        try (DataInputStream input = new DataInputStream(new FileInputStream("numbers.bin"))) {
            for (int i = 0; i < 30; i++) {
                numbers[i] = input.readInt(); // Считываю числа из двоичного файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    private static void printNumbersAndAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        double average = (double) sum / numbers.length; // Вычисляю среднее арифметическое
        System.out.println("\nArithmetic average: " + average);
    }
}
