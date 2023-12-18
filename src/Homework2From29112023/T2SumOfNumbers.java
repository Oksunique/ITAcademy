package Homework2From29112023;

public class T2SumOfNumbers {
    public static void main(String[] args) {
        int abcd = 5678;

        int ab = abcd / 100;
        int cd = abcd % 100;

        int sum = ab + cd;

        System.out.println("SumOfNumbers ab and cd: " + sum);
    }
}


