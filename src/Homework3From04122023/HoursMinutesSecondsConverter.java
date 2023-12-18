package Homework3From04122023;

public class HoursMinutesSecondsConverter {
    public static void main(String[] args) {
        int totalSeconds = 123456;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;

        String formattedTime = Time(hours, minutes, seconds);
        System.out.println(formattedTime);
    }

    public static String Time(int hours, int minutes, int seconds) {
        String hoursString = Unit(hours, "час", "часа", "часов");
        String minutesString = Unit(minutes, "минута", "минуты", "минут");
        String secondsString = Unit(seconds, "секунда", "секунды", "секунд");

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String Unit(int value, String singular, String pluralCase1, String pluralCase2) {
        if (value == 1) {
            return value + " " + singular;
        } else if (value % 10 >= 2 && value % 10 <= 4 && (value % 100 < 10 || value % 100 >= 20)) {
            return value + " " + pluralCase1;
        } else {
            return value + " " + pluralCase2;
        }
    }
}
