package assign4;
import java.util.*;
public class ExcepOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x");
		while(true){
			try {
				x= sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Input mismatched enter valid input");
				sc.next();
			}
		}
		System.out.println("Enter value of y");
		while(true){
			try {
				y= sc.nextInt();
				if(y==0) throw new ArithmeticException();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Input mismatched enter valid input");
				sc.next();
			}catch(ArithmeticException e) {
				System.out.println("Divide by zero");
			}
		}
		System.out.println("Result: " + (x / y));	
		sc.close();
	}

}
