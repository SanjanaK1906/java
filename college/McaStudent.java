package college;
import java.util.Scanner;
public class McaStudent extends Admission {
	int sid;
	Scanner sc= new Scanner(System.in);
	void register() {
		System.out.println("Welcome to MCA Admission :");
		System.out.println("Enter student id");
		sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name");
		name=sc.nextLine();
		System.out.println("Enter student's age");
		age=sc.nextInt();
		System.out.println("Enter form_no");
		form_no=sc.nextInt();
	}
	void display() {
		System.out.println("MCA Admission for filled sucessfully! ");
		System.out.println("Your name is "+name+" Student id is "+sid+" age is "+age
				+" form number is "+form_no);
	}
}
