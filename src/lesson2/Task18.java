package lesson2;

public class Task18 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 7;
        boolean d = a * 2 + b + ++c == 18;
        System.out.println( d ? 18 : 12);
    }
}
