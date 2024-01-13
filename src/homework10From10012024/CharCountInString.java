package homework10From10012024;
//Реализовать функцию подсчета количества разных символов в строке -
// public Map<Character,Integer> getCharsCount(String s)
//Пример: строка “baaccc” и результат: ‘b’ -1, ‘a’ - 2, ‘c’ - 3

import java.util.HashMap;
import java.util.Map;

public class CharCountInString {
    //создается метод getCharsCount, который принимает на вход строку s и возвращает Map,
    // где ключом является символ из строки, а значением - количество раз, которое этот символ встречается в строке
    public static Map<Character, Integer> getCharsCount(String s) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            // Если символ уже есть в Map, увеличиваем его количество на 1
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Если символа еще нет в Map, добавляем его с количеством 1
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {

        String inputString = "aaaaabbbbbbcccccdddeeefffgg";
        Map<Character, Integer> result = getCharsCount(inputString);

        System.out.println(result);
    }
}
