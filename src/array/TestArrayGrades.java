package array;

import java.util.Random;

public class TestArrayGrades {
    public static void main (String[]args) {
        Random random = new Random();

        int[] grades = new int[10];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(10);
        }

        for (int grade : grades) {
            System.out.println(grades + " ");
        }
    }
  //  for (int i = 0; i < grades.length; i++) {
  //      if
 //       System.out.println(grades + " ");
    }

 //       grades [0] = 9; //присваивание числа массиву по его индексу
 //       grades [1] = 10;
 //       grades [2] = 5;
 //       grades [3] = 6;grades [4] = 8;
//


 //       System.out.println(grades + " ");
 //   }
//}
