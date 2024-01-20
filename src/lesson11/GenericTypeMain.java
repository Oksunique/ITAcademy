package lesson11;

public class GenericTypeMain {
    public static void main(String[] args) {
        NumberBox<Integer> box = new NumberBox<>();
        box.setItem(11);

        NumberBox<Long> longBox = new NumberBox<>();
        longBox.setItem(12l);

     
    }

}
