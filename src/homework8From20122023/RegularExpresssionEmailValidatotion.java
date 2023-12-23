package homework8From20122023;

//Регулярные выражения - это шаблон для поиска строки в тексте
//RegEx. Email. Общий вид — логин@поддомен.домен.
// Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек.
// А домен (имеется в виду 1го уровня) — это от 2 до 6 букв и точек.
// Пример: myemail@gmail.com a.petrov@gmail.com.au coder4575@yandex.ru

import java.util.regex.*;

public class RegularExpresssionEmailValidatotion {
    public static void main(String[] args) {

        String[] emails = {"myemail@gmail.com", "a.petrov@gmail.com.au", "coder4575@yandex.ru", "invalid.email"};

        // Cоздаю объект класса Pattern для проверки соответствия регулярному выражению эл.почты,
        // используя метод compile(" ")
        Pattern patternEmail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

        // В цикле for (для перебора всех элементов массива emails)
        // создаю объект класса Matcher для проверки элементов массива  по порядку их объявления в массиве emails,
        // используя метод matcher(), который осуществляет поиск совпадений по шаблону.
        // определяю метод IsValidEmail, который возвращает true значение ,
        // если строка содержит допустимый адрес электронной почты и false, если не содержит,
        //  вызывая для этого метод matches(), который принимает регулярное выражение
        // и возвращает true, если строка соответствует этому выражению. Иначе возвращает false.

        for (String email : emails) {
            Matcher matcherEmail = patternEmail.matcher(email);
            boolean isValidEmail = matcherEmail.matches();
            System.out.println(email + " is valid: " + isValidEmail);
        }
    }
}
