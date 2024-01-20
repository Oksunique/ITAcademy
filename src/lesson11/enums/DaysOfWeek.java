package lesson11.enums;

public class DaysOfWeek {

    private String name;

    private DaysOfWeek(String name) {
        this.name = name;
    }

    public static final DaysOfWeek MONDAY = new DaysOfWeek("MONDAY");
    public static final DaysOfWeek THUESDAY = new DaysOfWeek("THUESDAY");

    @Override
    public String toString() {
        return  name;
    }
}
