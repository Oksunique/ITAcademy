package lesson11.enums;

public enum WeekDay {
    MONDAY(1) {
        @Override
        public void printDay() {
            System.out.println("Its moooonday!!!!");
            doSmth();
        }

        public void doSmth(){
            System.out.println("do smth......");
        }
    },
    THUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);


    private int value;

    WeekDay(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void printDay() {
        System.out.println("It s " + value + " day.");
    }
}
