package Homework5From11122023;
import java.util.Arrays;

public class ArrayPositiveNegativeNumbersDifferentArrays {
    public static void main(String[] args) {
        int[] numbers = {1, -3, -7, 4, -5};

        int[] positiveNumbersArray;
        int[] negativeNumbersArray;

        int сountPositiveNumber = 0;
        int сountNegaitiveNumber = 0;

        // Подсчет количества положительных и отрицательных чисел
        // с помощью цикла for each, в котором в переменную int number будет записан очередной элемент из указанного массива numbers
        for (int number : numbers) {
           if (number > 0) {
               сountPositiveNumber++;
            } else if (number < 0) {
               сountNegaitiveNumber++;
            }
        }
        // из подсчитанных чисел создаю раздельные массивы положительных и отрицательных чисел
        positiveNumbersArray = new int[сountPositiveNumber];
        negativeNumbersArray = new int[сountNegaitiveNumber];

        // Заполняю массива положительными и отрицательными числами
        int сountPositive = 0;
        int сountnNegative = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveNumbersArray[сountPositive] = num;
                сountPositive++;
            } else if (num < 0) {
                negativeNumbersArray[сountnNegative] = num;
                сountnNegative++;
            }
        }

        System.out.println("The source array: " + Arrays.toString(numbers));
        System.out.println("An array of positive numbers: " + Arrays.toString(positiveNumbersArray));
        System.out.println("An array of negative numbers: " + Arrays.toString(negativeNumbersArray));
    }

}
