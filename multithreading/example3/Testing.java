package multithreading.example3;

import multithreading.example2.Product;

class multithr implements Runnable{
	String msg;
	int priority;
	Thread t;
	multithr(String m, int p){
		msg=m;
		priority=p;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(msg+" "+priority);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
}
public class Testing {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		multithr m1= new multithr("hello", 10);
		multithr m2= new multithr("dear", 8);
		multithr m3= new multithr("welcome", 7);
		m1.t.join();
		Product p= new Product();
		Thread t= new Thread(p);
		t.start();
	}

}
