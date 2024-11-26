package assign4;
import java.util.Scanner;
//Implement a Java program to read an integer from the user and calculate its square root. Handle the InputMismatchException if the user enters a non-integer value.
public class SquareRoot {
	double num=0;
	void sqrt() {
		try {
			System.out.println("Enter number");
			Scanner sc = new Scanner(System.in);
			num = sc.nextDouble();
			double sqrt= Math.sqrt(num);
			System.out.println("square root is "+sqrt);
			sc.close();
		}catch(NumberFormatException e) {
			System.out.println("sorry ! enter corret number");
		}
	}
	public static void main(String[] args) {
		SquareRoot s1=  new SquareRoot();
		s1.sqrt();
	}

}
