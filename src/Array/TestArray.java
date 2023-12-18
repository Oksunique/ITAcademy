package Array;

public class TestArray {
    public static void main (String[]args) {
 //       int[] grades = null; //запись массива по умолчанию
        int[] grades = new int[10];
        System.out.println("---->"+ grades [2]);

        grades [2] = 137; //присваивание числа массиву по его индексу
//        String test = "1111";

        System.out.println("---->"+ grades [2]);
    }
}
