package multithreading.assignments.que2;

class OddNumberThread extends Thread {
    private final Object lock;

    // Constructor to pass the lock object
    public OddNumberThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            synchronized (lock) {
                System.out.println("Odd: " + i);
                lock.notify();  // Notify the even thread to print next
                try {
                    lock.wait();  // Wait for the even thread to print
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
