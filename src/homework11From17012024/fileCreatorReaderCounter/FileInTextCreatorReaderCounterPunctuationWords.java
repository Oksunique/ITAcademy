package homework11From17012024.fileCreatorReaderCounter;
import java.io.*;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class FileInTextCreatorReaderCounterPunctuationWords {
    public static void main(String[] args) {
        createFileWithText();
        countPunctuationAndWords();
    }

    private static void createFileWithText() {
        File file = new File("text.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("This is a sample text, with some punctuation marks");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void countPunctuationAndWords() {
        File file = new File("text.txt");

        int wordCount = 0;
        int punctuationCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();

            while (line != null) {
                // Разбиваю строку на слова по пробельным символам
                String[] words = line.split("\\s+");
                // Увеличиваю счетчик слов на количество слов в текущей строке
                wordCount += words.length;

                for (char c : line.toCharArray()) {
                    if (c == '.' || c == ',' || c == '?' || c == '!') {
                        // Увеличиваю счетчик знаков препинания при нахождении соответствующего символа
                        punctuationCount++;
                    }
                }

                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of punctuation marks: " + punctuationCount);
    }
}
