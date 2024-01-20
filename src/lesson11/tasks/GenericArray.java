package lesson11.tasks;

public class GenericArray<T> {
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public void printReverse() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        GenericArray<Integer> integerGenericArray = new GenericArray<>();

        Integer[] integers = new Integer[]{1,2,3,4,5};
        integerGenericArray.setArray(integers);

        integerGenericArray.printReverse();


    }
}
