package homework5From11122023;

public class ArraySumDigits {
    public static void main(String[] args) {
        int[] numbers = {111, 111, 111, 111, 111};
        int SumDigits = 0;

//использую цикл for each, в котором в переменную int number будет записан очередной элемент из указанного массива numbers
        for (int number : numbers) {
            SumDigits += getSumOfDigits(number);
        }

        System.out.println("The sum of the digits of the array: " + SumDigits);
    }

    private static int getSumOfDigits(int number) {
        int SumDigits = 0;

        while (number != 0) {
            SumDigits += number % 10;
            number /= 10;
        }

        return SumDigits;
    }
}
