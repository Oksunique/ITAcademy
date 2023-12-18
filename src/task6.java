public class task6 {
            public static void main(String[] args) {
            int seconds = 645632832;

            int minutes = seconds / 60;
            int hours = minutes / 60;
            int days = hours / 24;
            int weeks = days / 7;

            seconds = seconds % 60; // оставшиеся секунды
            minutes = minutes % 60; // оставшиеся минуты
            hours = hours % 24; // оставшиеся часы
            days = days % 7; // оставшиеся дни

            System.out.println("Недель: " + weeks);
            System.out.println("Суток: " + days);
            System.out.println("Часов: " + hours);
            System.out.println("Минут: " + minutes);
            System.out.println("Секунд: " + seconds);
        }
    }

