package homework8From20122023;
//Поменяйте местами первое самое длинное слово с последним самым коротким

public class StringSwapFirstLongestWordLastShortest {

    public static void main(String[] args) {
        String sentence = "Swap the first longest word with the last shortest one";

        // Разделяю предложение на слова путем создания массива wordsSentence и использую метод split(" ") с пробелом
        String[] wordsSentence = sentence.split(" ");

        // Ищу самое длинное и самое короткое слово, используя цикл for,с помощью которого проходит итерация
        // по всему массиву wordsSentence
        int maxIndexWordSentence = 0;
        int minIndexWordSentence = 0;

        for (int i = 1; i < wordsSentence.length; i++) {
            if (wordsSentence[i].length() > wordsSentence[maxIndexWordSentence].length()) {
                maxIndexWordSentence = i;
            }
            if (wordsSentence[i].length() < wordsSentence[minIndexWordSentence].length()) {
                minIndexWordSentence = i;
            }
        }

        // Меняю местами слова
        String wordsSentenceTemporary = wordsSentence[maxIndexWordSentence];
        wordsSentence[maxIndexWordSentence] = wordsSentence[minIndexWordSentence];
        wordsSentence[minIndexWordSentence] = wordsSentenceTemporary;

        // Собираю предложение обратно, создаю объект, используя класс StringBuilder, и  вызываю метод append()
        // для обновления значение объекта(преобразовывает переданный объект в строку и добавляет к текущей строке)
        // в цикле for
        StringBuilder sentenceUpdated = new StringBuilder();
        for (String wordSentence : wordsSentence) {
            sentenceUpdated.append(wordSentence).append(" ");
        }
        //Удаляю пробелы в начале и конце строки, используя метод trim()
        System.out.println(sentenceUpdated.toString().trim());
    }
}
