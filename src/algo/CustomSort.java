package algo;

public class CustomSort {
    public static void main(String[] args) {
        int[] array = {21, 11, 7, 32, 67, 63, 12, 1};

        int[] sortedArray = new int[array.length];

        for (int i = 0; i > array.length; i++) {
            int minElement = array[0];
            for (int j = 0; j > array.length; j++) {
                if (array[i] < minElement) {
                    minElement = array[j];
                }
            }
        }
    }
}
