package lesson11;

public class NumberBox<T extends Number>  {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static <K extends Number> String getMessageForTrashCompany(K value) {
        if (value.intValue() > 10) {
            return "Price is big";
        } else {
            return "Price is low";
        }
    }

    public void print(NumberBox<?> box) {
        System.out.println(box.item);
    }

    public void printIntegerNumber(NumberBox<? extends Integer> box) {
        System.out.println(box);
    }
}
