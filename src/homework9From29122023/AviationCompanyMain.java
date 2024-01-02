package homework9From29122023;
//Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
// Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
// Провести сортировку летных средств компании по дальности полета.
// Найти самолет в компании, соответствующий заданному диапазону параметров.

public class AviationCompanyMain {

    public static void main(String[] args) {
        Aircraft[] aircrafts = {
                new Aircraft("Airplane", 1000, 150, 1000),
                new Aircraft("Helicopter", 500, 5, 300),
                new Aircraft("Quadcopter", 50, 0, 5)
        };

        AviationCompany company = new AviationCompany(aircrafts);

        company.printAircraftHierarchy();
        System.out.println("Total Capacity: " + company.calculateTotalCapacity());
        System.out.println("Total Payload: " + company.calculateTotalPayload());

        company.sortByRange();

        int minRange = 100;
        int maxRange = 1000;
        company.findAircraftInRange(minRange, maxRange);
    }
}
