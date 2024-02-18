package homework15From14022024.DateTimeAPI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*  Распечатать график праздников на текущий год используя форматирование */

public class HolidaysCalendar {
    public static void main(String[] args) {
        printHoliday("New Year's Day", 1, 1);
        printHoliday("International Women's Day", 3, 8);
        printHoliday("Labor Day", 1, 5);
        printHoliday("Victory Day", 9, 5);
        printHoliday("Independence Day", 24, 8);
        printHoliday("New Year's Eve", 31, 12);
    }

    public static void printHoliday(String holidayName, int month, int day) {
        Calendar calendar = Calendar.getInstance(); // метод вызван для получения экземпляра Calendar
        calendar.set(Calendar.MONTH, month - 1); // метод вызван для установки месяца в календаре (январь - 0, декабрь - 11)
        calendar.set(Calendar.DAY_OF_MONTH, day); // метод вызван для установки дня в календаре

        int year = calendar.get(Calendar.YEAR); // метод вызван для получения текущего года

        System.out.println(holidayName + " is on " + day + "/" + month + "/" + year); // вывод информации о празднике
    }
}
