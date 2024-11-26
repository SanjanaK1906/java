package Assign1;
import java.util.Scanner;
//Create a function that takes an integer and returns the sum of its digits. Use a loop to extract each digit and perform  the sum.  
public class Sum {
	int a;
	int res;
	int Sum_cal() {
		//num%10 =>gives last digit  ;num /10=> removes last digit
		while(a!=0) {
			res=res+(a%10);
			a=a/10;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		Sum s1=new Sum();
		s1.a=sc.nextInt();
		int result= s1.Sum_cal();
		System.out.println("Sum of all digits is: "+result);
		sc.close();
	}
}
