package Assign1;
//Write a function that checks whether a given number is prime. Use a loop to test for factors, and return true or false based on the result.
import java.util.*;
public class PrimeNo {
	int num=0;
	boolean flag = true;
	void isprime(int n) {
		num=n;
		if(num>1) {
			if(num==2) {
				flag=true;
			}else {
				for(int i=2; i<=num/2;i++) {
					if(num%i==0) {
						flag=false;
						break; 
					}
				}
			}
		}else {
			flag=false;
		}
		if(flag==true) {
			System.out.println("Number is prime number");
		}else {
			System.out.println("Number is not prime number");
		}
	}
	public static void main(String[] args) {
		PrimeNo p1=new PrimeNo();
		boolean b = true;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Enter number");
			int num = sc.nextInt();
			p1.isprime(num);
			System.out.println("Do you want to continue? if yes then press true else press false");
			b = sc.nextBoolean();
		}while(b==true);
		sc.close();
	}
}
