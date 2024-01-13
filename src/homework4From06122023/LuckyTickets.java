package homework4From06122023;

public class LuckyTickets {
    public static void main(String[] args) {
        int countOfLuckyTickets = 0;

        for (int ticketNumber = 1; ticketNumber <= 999999; ticketNumber++) {
            int sumOfFirstThreeDigits = ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10;
            int sumOfLastThreeDigits = (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10;

            if (sumOfFirstThreeDigits == sumOfLastThreeDigits) {
                countOfLuckyTickets++;
            }
        }

        System.out.println("The number of lucky tickets: " + countOfLuckyTickets);
    }
}
