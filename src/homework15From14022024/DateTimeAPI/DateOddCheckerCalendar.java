package homework15From14022024.DateTimeAPI;
import java.util.Calendar;

/* Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с
начала года - нечетное число, иначе false. Пример: “JANUARY 1 2000” => true “JANUARY 2 2020” => false */

public class DateOddCheckerCalendar {
    public static void main(String[] args) {

        System.out.println("MAY 22 2001 => " + isDateOdd("MAY 12 2001"));
        System.out.println("MAY 27 2023 => " + isDateOdd("MAY 27 2023"));
    }

    public static boolean isDateOdd(String date) {
        Calendar calendar = Calendar.getInstance();
        String[] dateParts = date.split(" ");

        int year = Integer.parseInt(dateParts[2]);
        int month = getMonthNumber(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        return dayOfYear % 2 != 0;
    }

    public static int getMonthNumber(String month) {
        switch (month) {
            case "JAN":
                return Calendar.JANUARY;
            case "FEB":
                return Calendar.FEBRUARY;
            case "MAR":
                return Calendar.MARCH;
            case "APR":
                return Calendar.APRIL;
            case "MAY":
                return Calendar.MAY;
            case "JUN":
                return Calendar.JUNE;
            case "JUL":
                return Calendar.JULY;
            case "AUG":
                return Calendar.AUGUST;
            case "SEP":
                return Calendar.SEPTEMBER;
            case "OCT":
                return Calendar.OCTOBER;
            case "NOV":
                return Calendar.NOVEMBER;
            case "DEC":
                return Calendar.DECEMBER;
            default:
                return -1;
        }
    }
}
