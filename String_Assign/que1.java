package String_Assign;
import java.util.Scanner;
public class que1 {
	public void cmpstring1(String st1, String st2) {
		if(st1.compareTo(st2) == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= args[0];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s2 = sc.nextLine();
		que1 q1 = new que1();
		q1.cmpstring1(s1,s2);
		sc.close();	
	}
}
