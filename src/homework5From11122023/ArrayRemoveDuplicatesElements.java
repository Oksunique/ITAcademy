package homework5From11122023;
import java.util.HashSet;

public class ArrayRemoveDuplicatesElements {
    public static void main(String[] args) {
        int[] arrayElements = {2, 2, 3, 4, 2, 3, 5, 6, 15, 8, 1};

        // Создаю специальную структуру HashSet для хранения уникальных элементов
        HashSet<Integer> set = new HashSet<>();

        // Прохожу по массиву и добавляю каждый элемент в HashSet
        for (int i = 0; i < arrayElements.length; i++) {
            set.add(arrayElements[i]);
        }

        // Создаю новый массив для хранения уникальных элементов
        int[] arrayUniqueElements = new int[set.size()];

        // Для прохода по HashSet и добавление каждого элемента в новый массив использую цикл for each,
        // в котором в переменную int еlement будет записан очередной элемент из указанного массива set
        int countIndexElement = 0;

        for (int еlement : set) {
            arrayUniqueElements[countIndexElement++] = еlement;
        }

        for (int i = 0; i < arrayUniqueElements.length; i++) {
            System.out.print(arrayUniqueElements[i] + " ");
        }
    }
}
