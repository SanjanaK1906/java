package assign_multithreading.que2;

public class Oddnum implements Runnable {
	
	public void run() {
		try {
			for(int i=0; i<=20;i++) {
				if(i!=0 && i%2!=0) {
					System.out.println(i+ " is odd");
				}
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println("error in odd");
		}
	}

}