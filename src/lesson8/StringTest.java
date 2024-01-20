package lesson8;

public class StringTest {
    public static void main(String[] args) {
        String name = "Ivan"; //строка - это не изменяемый вид данных
        String poem = """
        Ivan
            Ivan
          Ivan
        """;
        System.out.println(poem.length());

        String name2 = new String("Ivan");
    }

}
