package homework10From10012024;
//Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
// где K — значение из массива, а Integer — количество вхождений в массив.
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapConverter {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {

        Map<K, Integer> map = new HashMap<>();

        for (K element : ks) {
            // Если элемент уже есть в Map, увеличиваем его количество на 1
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                // Если элемента еще нет в Map, добавляем его с количеством 1
                map.put(element, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 1, 2, 3, 4, 5,6,1,2,3,4,5};
        Map<Integer, Integer> result = arrayToMap(array);
        System.out.println(result);
    }
}
