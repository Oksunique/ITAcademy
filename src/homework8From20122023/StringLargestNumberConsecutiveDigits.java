package homework8From20122023;

//Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.

public class StringLargestNumberConsecutiveDigits {
    public static void main(String[] args) {
        String text = "Homework8From20122023task4778899987";

        System.out.println("String: " + text);

        // Нахожу наибольшее количество идущих подряд цифр, используя цикл for,с помощью которого проходит итерация
        // по всем символам text
        int countMaxDigits = 0;
        int countCurrentDigits = 0;

        for (int i = 0; i < text.length(); i++) {
            //для поиска символа строки text объявляю переменную characterText и присваиваю ей значение,
            // использую метод charAt()
            char characterText = text.charAt(i);
            // проверяю символы строки text, являются ли они цифрами, используя метод isDigit()
            if (Character.isDigit(characterText)) {
                countCurrentDigits++;
            } else {
                if (countCurrentDigits > countMaxDigits) {
                    countMaxDigits = countCurrentDigits;
                }
                countCurrentDigits = 0;
            }
        }
        // После завершения цикла по проверке всех символов text, проверяю
        // является ли текущее значение countCurrentDigits больше максимального countMaxDigits, и, если да,
        // то максимальному значению присваивается текушее, и оно выводится на панель
        if (countCurrentDigits > countMaxDigits) {
            countMaxDigits = countCurrentDigits;
        }

        System.out.println("The largest number of consecutive digits: " + countMaxDigits);
    }
}
