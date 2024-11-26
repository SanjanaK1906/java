package assign2.org;
import java.util.Scanner;

class Employee extends Person implements Inter{
	Scanner sc= new Scanner(System.in);
	int dept_no;
	String name;
	double code;
	void getData() {
		System.out.println("enter employee name");
		name=sc.nextLine();
		System.out.println("enter dept_no");
		dept_no=sc.nextInt();
		System.out.println("enter code");
		code=sc.nextDouble();
	}
	public void displayData() {
		System.out.println("Employee Details:");
		System.out.println("employee name: "+name+" dept_no: "+dept_no+" code "+code);
	}
}