package homework5From11122023;

public class ArrayMinimumElementOddIndexes {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        int minOddIndexElement = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] < minOddIndexElement) {
                minOddIndexElement = array[i];
            }
        }

        System.out.println("The minimum element with an odd index: " + minOddIndexElement);
    }
}
