package homework12From24012024;
import java.io.FileWriter;
import java.io.IOException;

/* Заданы три целочисленных массива. Записать эти массивы в файл в параллельных потоках.
Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.*/

public class ParallelThreadsArrayMain {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};

        SaveAsThread thread1 = new SaveAsThread("array1.txt", array1);
        SaveAsThread thread2 = new SaveAsThread("array2.txt", array2);
        SaveAsThread thread3 = new SaveAsThread("array3.txt", array3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SaveAsThread extends Thread {
    private String fileName;
    private int[] array;

    public SaveAsThread(String fileName, int[] array) {
        this.fileName = fileName;
        this.array = array;
    }

    @Override
    public void run() {
        try {
            //создаю экземпляр класса FileWriter, который открывает файл для записи
            FileWriter writer = new FileWriter(fileName);

            //В цикле foreach прохожусь по всем элементам массива
            // и каждый элемент записываю в файл с помощью метода write класса FileWriter.
            //использую метод close для закрывания файла после завершения цикла.
            for (int value : array) {
                writer.write(value + "\n");
            }
            writer.close();

            System.out.println("The array is written to a file " + fileName);

//Если при открытии файла, записи в файл или закрытии файла произойдёт ошибка,
// то в блоке catch выведется сообщение об ошибке Error when writing to a file.
        } catch (IOException e) {
            System.out.println("Error when writing to a file " + fileName + ": " + e.getMessage());
        }
    }
}
