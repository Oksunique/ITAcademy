package Homework4From06122023;

public class Asterisks3By5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
