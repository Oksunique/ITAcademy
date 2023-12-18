package lesson6;

public class VoidFunctionMaxArrayElement {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int maxElement = array[0];

        for(int i = 1; i < array.length; i += 1) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                }

        }

        System.out.println("The maximum of the array elements is: " + maxElement);
    }
}
