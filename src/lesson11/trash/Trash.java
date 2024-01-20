package lesson11.trash;

public class Trash <T> {

    private T trashType;

    public T getTrashType() {
        return trashType;
    }

    public void setTrashType(T trashType) {
        this.trashType = trashType;
    }
}
