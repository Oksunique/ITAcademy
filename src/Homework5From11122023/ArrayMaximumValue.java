package Homework5From11122023;

public class ArrayMaximumValue {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};

        int MaximumValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > MaximumValue) {

                MaximumValue = array[i];
            }
        }

        System.out.println("The maximum value from the array: " + MaximumValue);
    }
}
