package homework12From24012024.GeneratorThreadList;

import java.util.ArrayList;
import java.util.List;

public class GeneratorMain {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(); // Создание списка для хранения случайных чисел

        Generator generator = new Generator(numbersList); // Создание объекта класса Generator и передача ему списка
        generator.start(); // Запуск потока для генерации случайных чисел

        try {
            // использую метод join  для ожидания завершения работы потока.
            // После завершения работы потока программа выводит список сгенерированных чисел.
            generator.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interruption: " + e.getMessage());
        }
    }
}
