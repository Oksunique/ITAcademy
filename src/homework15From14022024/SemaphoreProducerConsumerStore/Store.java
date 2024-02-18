package homework15From14022024.SemaphoreProducerConsumerStore;
import java.util.concurrent.Semaphore;
public class Store {
    private int products = 0;
    private Semaphore producerSemaphore = new Semaphore(2);
    private Semaphore consumerSemaphore = new Semaphore(0);

    public void produce() throws InterruptedException {
        producerSemaphore.acquire();
        products++;
        System.out.println("Producer produced 1 product. Total products in store: " + products);
        consumerSemaphore.release();
    }

    public void consume() throws InterruptedException {
        consumerSemaphore.acquire();
        products--;
        System.out.println("Consumer consumed 1 product. Total products in store: " + products);
        producerSemaphore.release();
    }
}
