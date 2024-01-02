package homework9From29122023;
//Реализовать иерархию цветов (розы, гвоздики, тюльпаны, лилии и... что-то на свой вкус).
//Создать несколько объектов-цветов.
//Собрать букет и определить его стоимость.
//Определить все цвета, используемые в букете.
//Определить когда весь букет завянет.

import java.util.Arrays;

public class FlowerMain {

    public static void main(String[] args) {

        Flower[] flowers = createFlowers();

        double bouquetCost = calculateBouquetCost(flowers);
        System.out.println("The cost of the bouquet is: " + bouquetCost);

        String[] usedFlowerNames = getUsedFlowerNames(flowers);
        System.out.println("Used flowers are: " + Arrays.toString(usedFlowerNames));

        boolean isWithered = isBouquetWithered(flowers);
        System.out.println("The bouquet has already wilted? " + (isWithered ? "yes" : "no"));
    }

    public static Flower[] createFlowers() {
        Flower[] flowers = new Flower[6];
        flowers[0] = new Rose(5.0);
        flowers[1] = new Carnation(3.0);
        flowers[2] = new Tulip(2.5);
        flowers[3] = new Rose(4.0);
        flowers[4] = new Lily(7.0);
        flowers[5] = new Сhamomile(20.0);
        return flowers;
    }

    public static double calculateBouquetCost(Flower[] flowers) {
        double totalCost = 0.0;
        for (Flower flower : flowers) {
            totalCost += flower.getPrice();
        }
        return totalCost;
    }

    //Метод getUsedFlowerNames() принимает массив цветов и возвращает массив уникальных названий цветов,
    // которые были использованы в букете.
    public static String[] getUsedFlowerNames(Flower[] flowers) {
        String[] usedFlowerNames = new String[flowers.length];
        int index = 0;
        for (Flower flower : flowers) {
            String name = flower.getName();
            if (!contains(usedFlowerNames, name)) {
                usedFlowerNames[index++] = name;
            }
        }
        return Arrays.copyOf(usedFlowerNames, index);
    }
    //Метод isBouquetWithered() проверяет, есть ли в букете завявшие цветы.
    // Если встречается цветок со стоимостью 0, считается, что цветок завял.
    public static boolean isBouquetWithered(Flower[] flowers) {
        for (Flower flower : flowers) {
            if (flower.getPrice() == 0.0) {
                return true;
            }
        }
        return false;
    }
    // метод contains, который принимает два аргумента - массив строк array и значение value, которое нужно найти в массиве.
    // С помощью цикла for-each перебирается каждый элемент массива array и присваивается его переменной element.
    //Внутри цикла проверяется условие if(element != null && element.equals(value)).
    // Первая часть условия (element != null) проверяет, что текущий элемент массива не является пустым (null),
    // чтобы избежать ошибки NullPointerException.
    //Вторая часть условия (element.equals(value)) сравнивает текущий элемент массива с заданным значением value
    // с помощью метода equals класса String. Если элемент равен заданному значению, то условие выполнено
    // и метод возвращает значение true. Если ни одно условие внутри цикла не выполняется,
    // то метод продолжает перебирать элементы массива до конца.
    //Если во время перебора не было найдено ни одного значения, удовлетворяющего условию, то метод возвращает значение false.
    //Если в методе не было выполнено ни одного условия (нет элементов массива или значение value равно null), то метод также возвращает false.
    private static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element != null && element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
