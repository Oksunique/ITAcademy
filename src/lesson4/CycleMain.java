package lesson4;

public class CycleMain {
    public static void main(String[] args) {
        for (int i = 5;i >= 0;i--) {
            System.out.println(i);
    }
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
