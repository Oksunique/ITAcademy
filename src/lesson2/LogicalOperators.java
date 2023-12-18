package lesson2;

public class LogicalOperators {
    public static void main(String[] args) {
        // &&
        // ||
        // !

        int age = 14;
        int legs = 2;

        boolean isPerson = legs>3;
        boolean isAdult = age>18;

        boolean isAccesOpen = isPerson && isAdult;
        System.out.println(isAccesOpen);

        int legs1 = 2;
        int hours = 2;

        boolean isPerson1 = legs1 > 3;
        boolean isTimeGreaterNine = hours>9;

        boolean isAccesOpen1 = isPerson1 && isTimeGreaterNine;
        System.out.println(isAccesOpen);

        int temperature = -25;
        int airPressure = 1000;

        boolean isCold = temperature>0;
        boolean badWeather = airPressure>1100;

        boolean isGoodToWalk = isCold &&badWeather;
        System.out.println(isGoodToWalk);
    }
}
