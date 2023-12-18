package lesson3;
import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookAlgebra = sc.nextInt();
        int bookGeometry = sc.nextInt();
        int students = sc.nextInt();
        if (students == bookAlgebra) {
            if (students == bookGeometry) {
                System.out.println("Все ученики имеют по книжке");
            } else {
                System.out.println("Ученики имеют только все книжки по алгебре");
            }
        } else if (students == bookGeometry) {
            System.out.println("Ученики имеют только все книжки по геометрии");
        } else {
            System.out.println("Не хватает книг у каждого ученика");
        }
    }
}
