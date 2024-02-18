package homework15From14022024.DateTimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с
начала года - нечетное число, иначе false. Пример: “JANUARY 1 2000” => true “JANUARY 2 2020” => false */

public class DateOddCheckerBeginningYear {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 2 2013"));
        System.out.println(isDateOdd("MAY 15 2013"));
    }
    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat formatedDate = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        //Милисекунд до MAY 1 2013
        Date datan = formatedDate.parse(date);
        // Милисекунд до начала года MAY 1 2013
        Long DataK = datan.getTime();

        //Устанавливаю начало года для MAY 1 2013
        datan.setHours(0);
        datan.setMinutes(0);
        datan.setSeconds(0);
        datan.setDate(1);
        datan.setMonth(0);

        // Милисекунд до начала года MAY 1 2013
        Long DataN = datan.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        //Разница
        Long res = (DataK/msDay - DataN/msDay)+1;
        if (res % 2 == 0)
            return false;
        else
            return true;
    }
}
