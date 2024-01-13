package homework10From10012024;
//ClassCastException. Создайте список разных объектов и попытайтесь привести их к одному типу.
// Обработайте полученное исключение
import java.util.ArrayList;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Создаем список объектов разных типов
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("Old New Year");
        objects.add(2024);

        try {
            for (Object object : objects) {
                // приведение каждого объекта к типу Integer
                Integer number = (Integer) object;
                System.out.println("This object is an integer: " + number);
            }
        } catch (ClassCastException e) {
            // Обработка исключения ClassCastException
            System.out.println("Error: A ClassCastException occurred. Unable to cast the object to Integer type.");
        }
    }
}
