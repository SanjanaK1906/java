package multithreading.example3;

public class Product implements Runnable {
	public void run() {
		try {
			for(int i=0; i<10;i++) {
				System.out.println("**product**");
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("error in product");
		}
	}
}