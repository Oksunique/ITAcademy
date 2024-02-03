package homework13From31012024GH;

import java.util.Arrays;
import java.util.Collection;

/*Дана коллекция Collection<Integer> col. С помощью stream API:
найти минимальное число
найти максимальное число
найти среднее арифметическое чисел
найти произведение всех чисел
найти сумму всех чисел
найти сумму всех цифр*/

public class StreamAPILambdaCollectionIntegerMain {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(1, 2, 3, 4, 20);

        int minNumber = col.stream()
                .min((a, b) -> a - b)
                .orElseThrow();
        System.out.println("Minimum number: " + minNumber);

        int maxNumber = col.stream()
                .max((a, b) -> a - b)
                .orElseThrow();
        System.out.println("Maximum number: " + maxNumber);

        double average = col.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow();
        System.out.println("Arithmetic mean of numbers: " + average);

        int product = col.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("The product of all numbers: " + product);

        int sum = col.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("The sum of all numbers: " + sum);

        int digitSum = col.stream()
                .map(StreamAPILambdaCollectionIntegerMain::sumOfDigits)
                .reduce(0, (a, b) -> a + b);
        System.out.println("The sum of all digits: " + digitSum);
    }

    private static int sumOfDigits(int num) {
        return String.valueOf(num).chars()
                .map(codePoint -> Character.getNumericValue(codePoint))
                .sum();
    }
}
