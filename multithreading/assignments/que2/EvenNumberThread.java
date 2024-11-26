package multithreading.assignments.que2;


class EvenNumberThread extends Thread {
    private final Object lock;

    // Constructor to pass the lock object
    public EvenNumberThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            synchronized (lock) {
                System.out.println("Even: " + i);
                lock.notify();  // Notify the odd thread to print next
                try {
                    lock.wait();  // Wait for the odd thread to print
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
