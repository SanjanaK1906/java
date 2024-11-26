package multithreading.example2;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p= new Product();
		Thread t= new Thread(p);
		t.start();
		try {
		for(int i=1;i<10;i++) {
			System.out.println("***main***");
			Thread.sleep(1000);
		}}catch(Exception e) {
			System.out.println("error in main");
		}
		
	}

}
