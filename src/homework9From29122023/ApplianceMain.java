package homework9From29122023;
//Определить иерархию домашней техники. Включить некоторые в розетку. Рассчитать потребляемую мощность.
// Провести сортировку приборов в квартире на основе одного из параметров.
// Найти кухонный прибор в квартире, соответствующий заданному диапазону параметров.
import java.util.*;

public class ApplianceMain {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[5];
        appliances[0] = new Appliance("TV", 100);
        appliances[1] = new Appliance("Refrigerator", 200);
        appliances[2] = new ApplianceKitchen("Microwave", 150, "Countertop");
        appliances[3] = new ApplianceKitchen("Oven", 300, "Built-in");
        appliances[4] = new ApplianceKitchen("Blender", 50, "Handheld");

        //Включаю некоторые в розетку.
        appliances[0].connectToOutlet();
        appliances[0].calculatePower();
        appliances[0].otherOperations();
        System.out.println();

        appliances[4].connectToOutlet();
        appliances[4].calculatePower();
        appliances[4].otherOperations();
        System.out.println();

        //сортирую приборы на основе одного из параметров(getPower).
        Arrays.sort(appliances, Comparator.comparing(Appliance::getPower));

        System.out.println("Sorted appliances:");
        for (Appliance appliance : appliances) {
            System.out.println(appliance.getName()+ " " + appliance.getPower());
        }

        //Ищу кухонный прибор в квартире, соответствующий заданному диапазону параметров по мощности.
        int powerRangeMin = 50;
        int powerRangeMax = 100;

        System.out.println("\nKitchen appliances in power range [" + powerRangeMin + "-" + powerRangeMax + "]:");
        for (Appliance appliance : appliances) {
            // использую оператор instanceof для проверяем принадлежности объекта(прибора) к классу KitchenAppliance
            if (appliance instanceof ApplianceKitchen) {
                int power = appliance.getPower();
                if (power >= powerRangeMin && power <= powerRangeMax) {
                    System.out.println(appliance.getName());
                }
            }
        }
    }
}
