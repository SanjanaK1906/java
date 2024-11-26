package exceptionhandling;
import java.util.Scanner;
public class excep1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number");
		int num= s.nextInt();
		try {
			if(num<10) {
				throw new ArithmeticException();
			}else if(num>10) {
				throw  new ArrayIndexOutOfBoundsException();
			}else {
				throw  new Exception();
			}
		}catch(ArithmeticException a) {
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception d) {
			System.out.println("default exception...");
		}
		s.close();
		}
}
