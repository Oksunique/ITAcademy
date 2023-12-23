package homework8From20122023;

//Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
// Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце,
// а между словами оставить только один пробел.

import java.util.Scanner;

public class StringUnnormalizedRemovedSpaces {

    public static void main(String[] args) {
        Scanner stringUnnormalizedEntered = new Scanner(System.in);

        System.out.println("Enter an unnormalized string:");
        String stringInput = stringUnnormalizedEntered.nextLine();

        // Использую созданный ниже метод normalizeString для приведения строки к нормализованному виду
        String stringNormalized = normalizeString(stringInput);

        System.out.println("Normalized string is: " + stringNormalized);
    }

    public static String normalizeString(String stringInput) {
        // Удаляю пробелы в начале и конце строки, используя метод trim()
        String stringTrimmed = stringInput.trim();

        // Меняю множественные пробелы между словами на одиночные пробелы, спользуя метод replaceAll ()
        // и регулярное выражение, означающее множественные идущие подряд пробелы \s+
        String normalizedString = stringTrimmed.replaceAll("\\s+", " ");

        return normalizedString;
    }
}
