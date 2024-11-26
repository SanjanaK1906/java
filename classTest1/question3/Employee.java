package classTest1.question3;
import java.util.*;
public class Employee extends Person implements Interface1 {

	String name;
	int dnum;
	double code;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter department number :");
		dnum=sc.nextInt();
		System.out.println("Enter code :");
		code=sc.nextDouble();
		sc.close();
	}
	public void displayData() {
		System.out.println("name :"+name);
		System.out.println("department number :"+dnum);
		System.out.println("code :"+code);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
