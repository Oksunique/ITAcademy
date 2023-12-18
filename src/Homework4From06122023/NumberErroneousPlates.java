package Homework4From06122023;

public class NumberErroneousPlates {
    public static void main(String[] args) {
        int countOfErroneousPlates = 0;
        for (int i = 1; i <= 50000; i++) {
            String number = String.format("%05d", i);
            if (number.contains("2")) {
                countOfErroneousPlates++;
            }
        }
        System.out.println("The number of erroneous plates: " + countOfErroneousPlates);
    }
}
