package assign4.Bank;

import java.util.Scanner;

public class BankAccount {
	int anum;
	String name;
	double blncA;
	Scanner sc = new Scanner(System.in);
	void createA(int a, String s,Double b) {
		name = s;
		anum=a;
		blncA=b;
	}
	void depositA(int a, double depoA) {
		if(a==anum) {
			blncA+=depoA;
		}else {
			System.out.println("Account Number Mismatch !");
		}
	}
	void withdrawA(int a,double withA) {
		if(a==anum) {
			blncA-=withA;
		}else {
			System.out.println("Account Number Mismatch !");
		}
	}
	void balanceA(int a) {
		if(a==anum) {
			System.out.println(anum+" : "+blncA);
		}else {
			System.out.println("Account Number Mismatch !");
		}
	}
	public static void main(String[] args) {
		BankAccount a= new BankAccount();	
		a.createA(123, "John", 1000.000);
		a.depositA(123, 500);
		a.withdrawA(123, 200);
		a.balanceA(123);
	}


}
