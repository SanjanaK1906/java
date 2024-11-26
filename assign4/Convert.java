package assign4;
//Develop a Java program to read a string from the user and convert it into an integer. Handle the NumberFormatException if the string cannot be converted to an integer.
import java.util.*;
public class Convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String S=sc.nextLine();
		try {
			int a= Integer.parseInt(S);
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		sc.close();
	}
}
