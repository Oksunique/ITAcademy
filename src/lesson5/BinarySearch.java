package lesson5;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchedElement = 8;

        int start = 0;
        int end = array.length - 1;

        int medium = (start + end) / 2;

        if (searchedElement > array[medium]) {
            medium = medium + 1;
        }
        if (searchedElement < array[medium]) {
            end = medium - 1;
        }
        if (searchedElement == array[medium]) {
            System.out.println(medium + " " +array[medium]);
        }

}
}
