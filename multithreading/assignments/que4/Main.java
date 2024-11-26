package multithreading.assignments.que4;

public class Main {

    // Method to print even numbers
    public synchronized void even() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    // Method to print odd numbers
    public synchronized void odd() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        
        // Call even() method and print even numbers after a delay of 2000ms
        obj.even();
        Thread.sleep(2000);  // Wait for 2000 milliseconds

        // Call odd() method only after the even() method has completed
        obj.odd();
    }
}
