package Homework3From04122023;
import java.util.Random;

public class CountdownWorktingHours {
    public static void main(String[] args) {
        Random random = new Random();
        int worktingSeconds = random.nextInt(28801);
        System.out.println(worktingSeconds);

        int hours = worktingSeconds / 3600;
        if (hours > 0 && hours >= 5) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours > 0 && hours <= 4) {
                System.out.println("Осталось " + hours + " часа");
        } else {
                System.out.println("Осталось менее часа");
            }
        }
    }

