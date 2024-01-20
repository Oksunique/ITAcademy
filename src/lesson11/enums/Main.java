package lesson11.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        DaysOfWeek monday = DaysOfWeek.MONDAY;
//        System.out.println(monday);

        WeekDay monday = WeekDay.MONDAY;
        System.out.println(monday);

        WeekDay.THUESDAY.printDay();

//        System.out.println(monday.compareTo(WeekDay.MONDAY));
//
//        System.out.println(Arrays.toString(WeekDay.values()));
//
//        System.out.println(WeekDay.valueOf("THUESDAY"));
//
//        System.out.println(WeekDay.THURSDAY == WeekDay.THURSDAY );

//
//        switch (monday) {
//            case MONDAY -> {
//                System.out.println("its monday!!");
//            }
//            default -> {
//                System.out.println("ts not a monday!!!!");
//            }
//        }
    }
}
