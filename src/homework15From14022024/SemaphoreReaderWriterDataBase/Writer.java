package homework15From14022024.SemaphoreReaderWriterDataBase;

public class Writer extends Thread {
    private Database database;
    private String newData;

    public Writer(Database database, String newData) {
        this.database = database;
        this.newData = newData;
    }

    @Override
    public void run() {
        try {
            while (true) {
                database.write(newData);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
