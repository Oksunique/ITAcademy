package lesson4;

public class Break {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            if (i==68) {
                System.out.println("friend finded");
                System.out.println("Going out");
                break;
            }
            System.out.println("i");
        }
    }
}
