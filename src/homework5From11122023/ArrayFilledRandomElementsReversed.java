package homework5From11122023;
import java.util.Arrays;
import java.util.Random;

public class ArrayFilledRandomElementsReversed {
    public static void main(String[] args) {

    int[] array = new int[10];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100);
    }
    System.out.println("The source array: " + Arrays.toString(array));

    // переворачиваю массив с  использованием цикла for:
        // При первой итерации мы кладем в tmp элемент(цифру) с индексом 0 -- array[0],
        // таким образом в tmp лежит первая цифра(элемент) исходного массива - array[0] ==> int temp = array[0];.
        // Потом мы меняем местами элементы(цифры), и говорим, что array[0],
        // в котором лежит лежит первая цифра(элемент) исходного массива,
        // теперь примет значение array[array.length - 1- i], т.е. array[0] = array[первая цифра(элемент) исходного массива - 1 -0],
        // итого array[0] = последний элемент(цифра) ==> array[0] = array[array.length - 1 - 0];
        // а array[array.length - i - 1] = tmp, ==> array[array.length - 1 - 0] = temp
        // куда, как мы помним, положили array[0] (первая цифра(элемент) исходного массива).

    for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i]; // отнимаем от длины массива 1, т.к.отсчет элементов (цифр) начинается с 0
        array[array.length - 1 - i] = temp;
    }
    System.out.println("The reversed array: " + Arrays.toString(array));
    }
}
