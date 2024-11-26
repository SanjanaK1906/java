package multithreading.assignments.que2;

public class MainThread {
    public static void main(String[] args) {
        // Shared lock object for synchronization between threads
        Object lock = new Object();

        // Create instances of the EvenNumberThread and OddNumberThread
        EvenNumberThread evenThread = new EvenNumberThread(lock);
        OddNumberThread oddThread = new OddNumberThread(lock);

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}
