package homework13From31012024GH;

import java.util.Arrays;
import java.util.List;
/*Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
Используя stream и lambda выполнить следующие действия:
Удалить все содержащие “3”
Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
Отбросить первый и последний элемент
Привести в uppercase
Выдать на печать результат
Напечатать количество оставшихся элементо*/

public class StreamAPILambdaListStringMain {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> result = myList.stream()
               .filter(s -> !s.contains("3"))
               .sorted((s1, s2) -> {
                    char c1 = s1.charAt(1);
                    char c2 = s2.charAt(1);
                    if (c1 != c2) {
                        return c1 - c2;
                    } else {
                        return s2.charAt(0) - s1.charAt(0);
                    }
                })
                .skip(1)
                .limit(myList.size() - 2)
                .map(s3 -> s3.toUpperCase())
                .toList();

        result.forEach(s4 -> System.out.println(s4));

        System.out.println("Number of remaining elements: " + result.size());
    }
}
