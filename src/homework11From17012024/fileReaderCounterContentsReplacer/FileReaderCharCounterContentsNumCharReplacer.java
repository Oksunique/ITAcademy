package homework11From17012024.fileReaderCounterContentsReplacer;
import java.io.*;
// Прочитать файл по строкам. Подсчитать количество символов 'a' в файле.
// Заменить содержимое файла на число символов 'a'

public class FileReaderCharCounterContentsNumCharReplacer {
    public static void main(String[] args) {
        File file = new File("input.txt");

        int count = countAndReplace(file);

        System.out.println("The number of 'a' characters in the file: " + count);
    }
    // Подсчитываю количество символов 'a' и заменяем содержимое файла на это число
    private static int countAndReplace(File file) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // Читаю файл по строкам
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c == 'a') {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Заменяю содержимое файла на количество символов 'a'
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }
}
