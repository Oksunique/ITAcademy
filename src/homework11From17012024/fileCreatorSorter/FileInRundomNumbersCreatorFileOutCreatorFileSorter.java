package homework11From17012024.fileCreatorSorter;
import java.io.*;
import java.util.Arrays;

//Даны 2 файла - in1.txt и in2.txt в каждом файле по 1000 чисел от 1 до 100000.
// Создайте файл out.txt, который будет содержать все отсортированные числа из файлов in1.txt и in2.txt.
// Файлы in1.txt и in2.txt можно создать с помощью кода.
// можем использовать в рамках этого задания метод split и метод Integer.parseInt

public class FileInRundomNumbersCreatorFileOutCreatorFileSorter {
    public static void main(String[] args) {
        createAndFillFiles();
        sortAndSaveToFile();
    }
    //создаю объекты File для файлов in1.txt и in2.txt и записываю в них по 1000 случайных чисел с помощью PrintWriter.
    private static void createAndFillFiles() {
        File file1 = new File("in1.txt");
        File file2 = new File("in2.txt");

        try (PrintWriter writer1 = new PrintWriter(file1);
             PrintWriter writer2 = new PrintWriter(file2)) {
            for (int i = 0; i < 1000; i++) {
                writer1.print((int) (Math.random() * 100000) + " ");
                writer2.print((int) (Math.random() * 100000) + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
//объединяю и сортируют числа из файлов in1.txt и in2.txt с помощью метода mergeAndSortFiles()
    private static void sortAndSaveToFile() {
        File file1 = new File("in1.txt");
        File file2 = new File("in2.txt");
        int[] numbers = mergeAndSortFiles(file1, file2);
        saveSortedNumbersToFile(numbers);
    }
//создаю метод mergeAndSortFiles(), который считывает числа из обоих файлов,

    private static int[] mergeAndSortFiles(File file1, File file2) {
        int[] numbers = new int[2000];
        int index = 0;

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    // разделяю строки на числа с помощью метода split(" ")
                    String[] nums1 = line1.split(" ");
                    for (String num : nums1) {
                        if (!num.isEmpty()) {
                            // Преобразую строку в число и сохраняю его в массив
                            numbers[index] = Integer.parseInt(num);
                            index++;
                        }
                    }
                    line1 = reader1.readLine();
                }

                if (line2 != null) {
                    // разделяю строки на числа с помощью метода split(" ")
                    String[] nums2 = line2.split(" ");
                    for (String num : nums2) {
                        if (!num.isEmpty()) {
                            // Преобразую строку в число и сохраняю его в массив
                            numbers[index] = Integer.parseInt(num);
                            index++;
                        }
                    }
                    line2 = reader2.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Arrays.sort(numbers);

        return numbers;
    }

    private static void saveSortedNumbersToFile(int[] numbers) {
        File outFile = new File("out.txt");

        try (PrintWriter writer = new PrintWriter(outFile)) {
            for (int number : numbers) {
                // Записываю отсортированные числа в файл out.txt
                writer.println(number + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
