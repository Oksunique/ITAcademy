package homework16From21022024;

import java.lang.reflect.*;

/* Изучение класса. загрузите класс "java.util.LinkedList". Выведите все поля класса, родительский
класс, методы класса, конструкторы. Выведите информацию о внутренних классах, если они
есть.*/

public class ReflectionAPIMain {
    public static void main(String[] args) {
        try {
            // Загрузка класса java.util.LinkedList
            Class<?> linkedListClass = Class.forName("java.util.LinkedList");

            Field[] fields = linkedListClass.getDeclaredFields();
            System.out.println("Class fields LinkedList:");
            for (Field field : fields) {
                System.out.println(field.getName());
            }

            // Вывод на печать родительского класса
            Class<?> superClass = linkedListClass.getSuperclass();
            System.out.println("\nParents' class LinkedList: " + superClass.getName());

            // Вывод на печать методов класса
            Method[] methods = linkedListClass.getDeclaredMethods();
            System.out.println("\nClass methods LinkedList:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // Вывод на печать конструкторов
            Constructor<?>[] constructors = linkedListClass.getDeclaredConstructors();
            System.out.println("\nClass constructors LinkedList:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }

            // Вывод на печать информации о внутренних классах
            Class<?>[] innerClasses = linkedListClass.getDeclaredClasses();
            if (innerClasses.length > 0) {
                System.out.println("\nInternal classes of the class LinkedList:");
                for (Class<?> innerClass : innerClasses) {
                    System.out.println(innerClass.getName());
                }
            } else {
                System.out.println("\nThe LinkedList class has no internal classes.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
