package multithreading.synchronization;

public class Filesync extends Thread {
	ReadFile fr;
	String s;
	Filesync(ReadFile fr, String f) {
		this.fr=fr;
		s=f;
	}
	public void run() {
		try {
			fr.display(s);
		}catch(Exception e) {
			System.out.println("error2");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile k= new ReadFile();
		Filesync r= new Filesync(k,"abc.txt");
		Filesync r1= new Filesync(k,"xyz.txt");
		r.start();
		r1.start();
	}

}
