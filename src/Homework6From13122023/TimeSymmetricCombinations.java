package Homework6From13122023;

public class TimeSymmetricCombinations {
    public static void main(String[] args) {
        int countSymmetricCombinations = 0;

        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if (isSymmetric(hours, minutes)) {
                    countSymmetricCombinations++;
                }
            }
        }

        System.out.println("The number of symmetric time combinations: " + countSymmetricCombinations);
    }

    // Метод для проверки симметричности комбинации времени
    public static boolean isSymmetric(int hours, int minutes) {
        //Для форматирования использую метод String.format(), где %02d означает, что значения hours и minutes
        // должны быть представлены двумя цифрами, и если значение меньше 10, то перед ним будет добавлен 0
        String time = String.format("%02d:%02d", hours, minutes);
        //Создаю массив partsTime, в котором строка time разделяется по символу ":" с помощью метода split().
        // Т.о., в массиве partsTime будет два элемента: partsTime[0] будет содержать значение часов,
        // а partsTime[1] - значение минут.
        String[] partsTime = time.split(":");
        //Создаю переменную reversedMinutes типа String, в которую сохраняется реверсированная строка partsTime[1].
        // Для этого использую класс StringBuilder: сначала создается экземпляр StringBuilder,
        // передавая в конструктор исходную строку, затем вызывается метод reverse() для реверсирования строки
        // (разворота задом наперёд), а затем метод toString() для преобразования StringBuilder обратно в String.
        String reversedMinutes = new StringBuilder(partsTime[1]).reverse().toString();
        //Проверяю, равна ли строка partsTime[0] строке reversedMinutes,
        // и возвращаю результат с помощью ключевого return.
        return partsTime[0].equals(reversedMinutes);
    }
}
