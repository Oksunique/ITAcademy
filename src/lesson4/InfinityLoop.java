package lesson4;

public class InfinityLoop {
    public static void main(String[] args) {

        for (int i=5;i<3;i++) {
            System.out.println("i");
        }

        for (;;) {
            System.out.println("test");
            break;
        }
    }
}
