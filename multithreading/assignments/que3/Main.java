package multithreading.assignments.que3;
public class Main {
    public static void main(String[] args) {
        // Create objects of the message classes
        Message1 m1 = new Message1();
        Message2 m2 = new Message2();
        Message3 m3 = new Message3();
        Message4 m4 = new Message4();
        
        // Set thread priorities
        m1.setPriority(Thread.MAX_PRIORITY);   // Highest priority
        m2.setPriority(Thread.NORM_PRIORITY);  // Default priority
        m3.setPriority(Thread.MIN_PRIORITY);   // Lowest priority
        m4.setPriority(Thread.NORM_PRIORITY);  // Normal priority for Message4
        
        // Start the threads
        m1.show();
        m2.show();
        m3.show();
        
        try {
            // Ensure the main thread waits for m1, m2, m3 to finish
            m1.join();
            m2.join();
            m3.join();
            
            // Start m4 only after m1, m2, and m3 are finished
            m4.show();
            
            // Wait for m4 to finish before exiting the main thread
            m4.join();
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
