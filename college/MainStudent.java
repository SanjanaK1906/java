package college;
import java.util.Scanner;
public class MainStudent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			int a;
			System.out.println("Enter your admission choice : 1.MCA  and 2.MBA 0.exit");
			a=sc.nextInt();
			switch(a) {
			case 1:
				McaStudent s1= new McaStudent();
				s1.register();
				s1.display();
				break;
			case 2:
				MbaStudent s2= new MbaStudent();
				s2.register();
				s2.show();
				break;
			default:
				System.out.println("Enter valid choice");
			}
			sc.close();
	}
}
