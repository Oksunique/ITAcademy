package homework12From24012024;
import java.util.Scanner;

/*Пользователь вводит с клавиатуры значение в массив. После чего запускаются два потока.
Первый поток находит максимум в массиве, второй — минимум. Результаты вычислений возвращаются в метод main()*/

public class MaxMinThreadArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");

        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

//создаю новый поток maxThread, который выполняет код, переданный в лямбда-выражении.
// Лямбда-выражение - это анонимная функция() -> {}, которая содержит следующий код для выполнения в потоке.
        Thread maxThread = new Thread(() -> {
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Maximum: " + max);
        });

        Thread minThread = new Thread(() -> {
            int min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Minimum: " + min);
        });

        maxThread.start();
        minThread.start();
    }
}
