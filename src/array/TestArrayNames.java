package array;

public class TestArrayNames {
    public static void main(String[] args) {
        String[] name = new String[6];

        name[0] = "Sergey"; //присваивание числа массиву по его индексу
        name[1] = "Savelij";
        name[2] = "Aleksey";
        name[3] = "Kristina";
        name[4] = "Viktor";
        name[5] = "Oksana";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
