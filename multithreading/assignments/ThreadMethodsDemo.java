package multithreading.assignments;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create and start a thread
        MyThread thread = new MyThread();
        thread.start();

        // Show thread methods
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread is Alive: " + thread.isAlive());
        System.out.println("Thread State: " + thread.getState());

        // Wait for the thread to finish
        thread.join();

        // After thread finishes
        System.out.println("\nThread State after completion: " + thread.getState());
        System.out.println("Is Thread Alive after completion: " + thread.isAlive());
    }
}
