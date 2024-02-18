package homework15From14022024.SemaphoreReaderWriterDataBase;
import java.util.concurrent.Semaphore;
public class Database {
    private String data = "Database"; // База данных (в данном случае просто строка)
    private Semaphore readAccess = new Semaphore(1); // Семафор для контроля доступа читателей
    private Semaphore writeAccess = new Semaphore(1); // Семафор для контроля доступа писателей
    private int readers = 0;

//Метод read сначала увеличивает количество читателей, затем происходит чтение данных,
// а затем уменьшается количество читателей. Если последний читатель закончил чтение,
// после чего он освобождает доступ для писателя.
    public void read() throws InterruptedException {
        readAccess.acquire();
        readers++;
        readAccess.release();

        System.out.println("Reader is reading data: " + data);

        readAccess.acquire();
        readers--;
        if (readers == 0) {
            readAccess.release(); // Последний читатель освобождает доступ для писателя
        }
        readAccess.release();
    }

    public void write(String newData) throws InterruptedException {
        writeAccess.acquire();

        System.out.println("Writer is writing data: " + newData);
        data = newData;

        writeAccess.release();
    }
}
