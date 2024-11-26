package college;
import java.util.Scanner;
public class MbaStudent extends Admission {
	Scanner sc= new Scanner(System.in);
	String stream;
	void register() {
		System.out.println("Welcome to MBA Admission :");
		System.out.println("Enter student id");
		stream=sc.nextLine();
		System.out.println("Enter student name");
		name=sc.nextLine();
		System.out.println("Enter student's age");
		age=sc.nextInt();
		System.out.println("Enter form_no");
		form_no=sc.nextInt();
	}
	void show() {
		System.out.println("MBA Admission for filled sucessfully! ");
		System.out.println("Your name is "+name+" stream is "+stream+" age is "+age
				+" form number is "+form_no);
	}
}
