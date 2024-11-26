package assign_multithreading.que2;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evennum e= new Evennum();
		Oddnum o1= new Oddnum();
		Thread o =new Thread(o1);
		e.start();
		o.start();
	}

}
