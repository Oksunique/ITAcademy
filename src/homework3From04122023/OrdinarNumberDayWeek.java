package homework3From04122023;

public class OrdinarNumberDayWeek {
    public static void main(String[] args) {
        int dayNumber = 6;

        String dayName;

         switch (dayNumber) {
            case 1 -> dayName ="MONDAY";
            case 2 -> dayName ="TUESDAY";
            case 3 -> dayName ="WEDNESDAY";
            case 4 -> dayName ="THURSDAY";
            case 5 -> dayName ="FRIDAY";
            case 6 -> dayName ="SATURDAY";
            case 7 -> dayName ="SUNDAY";
            default -> dayName ="Not correct number of the week";
        }
  System.out.println(dayName);
    }
}

