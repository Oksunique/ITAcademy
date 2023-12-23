package homework8From20122023;
//Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.

import java.util.Scanner;

public class StringPartsReplacement {

    public static void main(String[] args) {
        Scanner stringEntered = new Scanner(System.in);

        System.out.println("Enter the string:");
        String stringInput = stringEntered.nextLine();

        if (stringInput.startsWith("abc")) {
            stringInput = stringInput.replaceFirst("abc", "www");
        } else {
            stringInput += "zzz";
        }

        System.out.println("The result is: " + stringInput);
    }
}
