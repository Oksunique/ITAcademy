package homework12From24012024.GeneratorThreadList;
import java.util.List;
import java.util.Random;

/*создать класс Generator extends Thread.
В конструктор класса передается List<Integer>, ссылка на который сохраняется в классе.
В методе run() в list по одному добавляются случайные числа
и после каждого добавления поток “засыпает” (sleep) на 200 msec.
В лист должно добавится 100 чисел. */
public class Generator extends Thread {
    private List<Integer> numbersList;

    public Generator(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) { // Цикл для добавления 100 случайных чисел
            int randomNumber = (int) (Math.random() * 100); // Генерация случайного числа от 0 до 99
            numbersList.add(randomNumber); // Добавление случайного числа в список
            System.out.println("Added number: " + randomNumber); // Вывод добавленного числа
            try {
                Thread.sleep(200); // Поток "засыпает" на 200 миллисекунд
            } catch (InterruptedException e) {
                System.out.println("Thread interruption " + e.getMessage());
            }
        }
        System.out.println("Generated numbers: " + numbersList); // Вывод списка сгенерированных чисел
    }
}
