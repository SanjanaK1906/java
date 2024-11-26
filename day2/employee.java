package day2;
//wap to define employee class having fields like name,age,salary
//also define companyname field
//define accept ()to assign value to name ,age and salary
//define input(String cname) to assign value to company name field
//display all values in main
//1) write program for 1 employee
//2 write program for 3 employees
class employee1{
	String name;
	int age;
	double salary;
	static String companyname;
	public void accept(String n, int a, double s) {
		name=n;
		age=a;
		salary=s;
	}
	static public void input(String cname) {
		companyname=cname;
	}
	public void display() {
		System.out.println("Company : "+companyname);
		System.out.println("Employee name is "+name+" age is "+age+" having salary "+salary);
	}
}
public class employee {

	public static void main(String[] args) {
		employee1 e1 = new employee1();
		e1.accept("sanjana",25,70000);
		employee1.input("CDAC");
		e1.display();
		employee1 e2 = new employee1();
		e2.accept("rishabh",24,75000);
		e2.display();
		employee1 e3 = new employee1();
		e3.accept("priyanka",23,60000);
		e3.display();
		
	}

}
