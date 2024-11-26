package multithreading.synchronization;
import java.io.*;
public class ReadFile {
	int ch;
	void display(String msg) {
		try {
			System.out.println("test1");
			FileReader f = new FileReader(msg);
			System.out.println("-"+msg);
			do {
				System.out.println("test2");
				ch=f.read();
				System.out.println("test3");
				System.out.println((char)ch);
				System.out.println("test4");
				Thread.sleep(500);
			}while(ch!=-1);
		}catch(Exception e) {
			System.out.println("error1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
