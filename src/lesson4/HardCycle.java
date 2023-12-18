package lesson4;

public class HardCycle {
    public static void main(String[] args) {
        int w = 3;
        int h = 10;



        for (int i = 1; i<=w; i++) {
            for (int j = 1; j<=h; j++) {
                System.out.print(" * ");
            }
            System.out.println("final");
        }
    }
}
