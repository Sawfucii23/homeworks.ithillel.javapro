package homeworks.hw11;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class PetrolStation {
    private double amount;
    private Semaphore semaphore;

    public PetrolStation(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Початкова кількість палива повинна бути не від'ємною");
        }
        this.amount = amount;
        this.semaphore = new Semaphore(3);
    }
    public void doRefuel(double request) {
        if (semaphore.tryAcquire()) {
            try {
                semaphore.acquire();
                System.out.println("Заправка почалася. Запитано " + request + " літрів палива.");
                if (amount >= request) {
                    amount -= request;
                    System.out.println("Заправка успішно завершена. Залишилося " + amount + " літрів палива.");
                } else {
                    System.out.println("Заправка не вдалася. Недостатньо палива на станції.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
