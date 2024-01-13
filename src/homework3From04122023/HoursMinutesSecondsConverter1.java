package homework3From04122023;
import java.util.Scanner;

public class HoursMinutesSecondsConverter1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Форматированный вывод
        String hoursString = formatUnitMeasurementTime(hours, "час", "часа", "часов");
        String minutesString = formatUnitMeasurementTime(minutes, "минута", "минуты", "минут");
        String secondsString = formatUnitMeasurementTime(seconds, "секунда", "секунды", "секунд");

        System.out.println(hoursString + " " + minutesString + " " + secondsString);
    }

    // Функция для форматирования числа с учетом окончаний
    public static String formatUnitMeasurementTime(int number, String format1, String format2, String format3) {
        if (number % 100 >= 11 && number % 100 <= 19) {
            return number + " " + format3;
        } else if (number % 10 == 1) {
            return number + " " + format1;
        } else if (number % 10 >= 2 && number % 10 <= 4) {
            return number + " " + format2;
        } else {
            return number + " " + format3;
        }
    }
}
