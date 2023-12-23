package homework8From20122023;

//Регулярные выражения - это шаблон для поиска строки в тексте
// RegEx. Шестнадцатеричный цвет. Символ # (необязательно), затем слово, состоящее из букв от //a до f или цифр,
// длиной 3 или 6: Пример: FFFFFF #000 101011
//Peгyляpнoe выpaжeниe для вaлидaции шecтнaдцaтepичнoгo koдa цвeтa: ^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$
//Oбъяcнeниe peгyляpнoгo выpaжeния:
// ^ - нaчaлo cтpokи
// # - cтpoka дoлжнa нaчинaтьcя c cиmвoлa "#" (пример: #1f1f1F)
// ( - нaчaлo гpyппы 1
// [A-Fa-f0-9]{6} - любыe cиmвoлы из cпиcka в koличecтвe 6 штyk (пример: #1а2в3F, #123abF)
// |- или
// [A-Fa-f0-9]{3} - любыe cиmвoлы из cпиcka в koличecтвe 3 штykи (пример: #F00, #1F2)
// )- koнeц гpyппы 1
// $ - koнeц cтpokи

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressionHexadecimalColorValidation {

    public static void main(String[] args) {
        String hexadecimalColor1 = "ABCDEF"; // валидный шестнадцатеричный цвет
        String hexadecimalColor2 = "#123"; // валидный шестнадцатеричный цвет
        String hexadecimalColor3 = "123456"; // валидный шестнадцатеричный цвет
        String hexadecimalColor4 = "#GFC"; // невалидный шестнадцатеричный цвет
        String hexadecimalColor5 = "12345"; // невалидный шестнадцатеричный цвет

        // Cоздаю объект класса Pattern для проверки соответствия регулярному выражению шестнадцатеричного цвета,
        // используя метод compile(" ")
        Pattern patternHexadecimalColor = Pattern.compile("^#?[a-fA-F0-9]{3}([a-fA-F0-9]{3})?$");

        // Создаю объект класса Matcher для проверки  цвета по порядку их объявления,
        // используя метод matcher(), который осуществляет поиск совпадений по шаблону
        // и методmatches(), который принимает регулярное выражение
        // и возвращает true, если строка соответствует этому выражению. Иначе возвращает false.
        Matcher matcherHexadecimalColor1 = patternHexadecimalColor.matcher(hexadecimalColor1);
        System.out.println(hexadecimalColor1 + ": " + matcherHexadecimalColor1.matches());

        Matcher matcherHexadecimalColor2 = patternHexadecimalColor.matcher(hexadecimalColor2);
        System.out.println(hexadecimalColor2 + ": " + matcherHexadecimalColor2.matches());

        Matcher matcherHexadecimalColor3 = patternHexadecimalColor.matcher(hexadecimalColor3);
        System.out.println(hexadecimalColor3 + ": " + matcherHexadecimalColor3.matches());

        Matcher matcherHexadecimalColor4 = patternHexadecimalColor.matcher(hexadecimalColor4);
        System.out.println(hexadecimalColor4 + ": " + matcherHexadecimalColor4.matches());

        Matcher matcherHexadecimalColor5 = patternHexadecimalColor.matcher(hexadecimalColor5);
        System.out.println(hexadecimalColor5 + ": " + matcherHexadecimalColor5.matches());
    }
}
