package homework6From13122023;

public class ArrayMaximumElementEvenIndexes {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        int maxElement = array[0];

        for (int i = 2; i < array.length; i += 2) {
            if (array[i] > maxElement) {

                maxElement = array[i];
            }
        }

        System.out.println("The maximum of the array elements with even index: " + maxElement);
    }
}
