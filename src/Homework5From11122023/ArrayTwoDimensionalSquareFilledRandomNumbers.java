package Homework5From11122023;
import java.util.Random;

public class ArrayTwoDimensionalSquareFilledRandomNumbers {
    public static void main(String[] args) {
        int sizeArray  = 5; // размер массива
        int[][] arrayTwoDimensionalSquare = new int[sizeArray][sizeArray]; // создаем двумерный массив размером n x n

        // заполняем массив случайными числами
        Random randomNumbersArray = new Random();
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                if (i == j) { // числа по диагонали равны 0
                    arrayTwoDimensionalSquare[i][j] = 0;
                } else if (i < j) { // вверху от пересечения диагоналей положительные числа
                    arrayTwoDimensionalSquare[i][j] = randomNumbersArray.nextInt(100) + 1; // случайное положительное число от 1 до 100
                } else { // снизу от пересечения диагоналей положительные числа
                    arrayTwoDimensionalSquare[i][j] = -1 * (randomNumbersArray.nextInt(100) + 1); // случайное отрицательное число от -1 до -100
                }
            }
        }

        // выводим массив на экран
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                System.out.print(arrayTwoDimensionalSquare[i][j] + "\t");
            }
            System.out.println();
        }

        // находим сумму всех элементов
        int sumAllElements = 0;
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                sumAllElements += arrayTwoDimensionalSquare[i][j];
            }
        }
        System.out.println("The sum of all the elements is: " + sumAllElements);

        // находим среднее арифметическое элементов, которые больше суммы всех элементов
        int countNumberGreaterSumAllElements = 0;
        int totalSumNumberGreaterSumAllElements = 0;
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                if (arrayTwoDimensionalSquare[i][j] > sumAllElements) {
                    totalSumNumberGreaterSumAllElements += arrayTwoDimensionalSquare[i][j];
                    countNumberGreaterSumAllElements++;
                }
            }
        }
        double averageGreaterNumber = (double) totalSumNumberGreaterSumAllElements / countNumberGreaterSumAllElements;
        System.out.println("The average is: " + averageGreaterNumber);
    }
}
