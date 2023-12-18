package lesson5;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 5, 8, 7, 10, 9, -2, -9};
        int[] newArray = Arrays.copyOf(array, array.length+1);
    }
}
