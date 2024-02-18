package homework15From14022024.SemaphoreReaderWriterDataBase;

public class Reader extends Thread {
    private Database database;

    public Reader(Database database) {
        this.database = database;
    }

    @Override
    public void run() {
        try {
            while (true) {
                database.read();
                Thread.sleep(2000); // Имитация чтения данных
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
