package homework13From31012024GH;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* Дана коллекция Collection<String> col. С помощью Stream API:
        узнать, содержит ли какая-нибудь из строк слово login
        найти самую длинную строку
        найти самую короткую строку
        найти строки-слова (не содержат пробелов и знаков препинания)
        получить все слова используемые в строках*/

public class StreamAPILambdaCollectionStringMain {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("Winter 2024", "Summer", "login", "Spring");

        boolean containsLogin = col.stream()
                .anyMatch(s -> s.contains("login"));
        System.out.println("Contains 'login': " + containsLogin);

        String longestString = col.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("");
        System.out.println("Longest string: " + longestString);

        String shortestString = col.stream()
                .min((s1, s2) -> s1.length() - s2.length())
                .orElse("");
        System.out.println("Shortest string: " + shortestString);

           List<String> words = col.stream()
                .filter(s -> s.matches("\\b\\w+\\b"))
                .toList();
        System.out.println("Words only: " + words);

        List<String> allWords = col.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .distinct()
                .toList();
        System.out.println("All words: " + allWords);
    }
}
