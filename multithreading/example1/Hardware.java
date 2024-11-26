package multithreading.example1;

public class Hardware extends Thread {
	public void run() {
	try {
		for(int i=0;i<10;i++) {
			System.out.println("hardware");
			Thread.sleep(1000);
		}
	}
	catch(Exception e) {
		System.out.println("Error 1");
	}
	}
}
