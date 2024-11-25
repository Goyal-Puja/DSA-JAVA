package multithreading;

public class RaceConditionExample {
    private int counter = 0;

    public void increment() {
        counter++;  // This operation is not atomic
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionExample example = new RaceConditionExample();

        // Create two threads that increment the counter 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final value of the counter
        System.out.println("Final counter value: " + example.getCounter());
    }
}

