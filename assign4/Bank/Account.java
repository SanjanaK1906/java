package assign4.Bank;
import java.util.*;
public class Account {
	int anum;
	String name;
	double blncA;
	double depoA;
	double withA;
	Scanner sc = new Scanner(System.in);
	void create() {
		System.out.println("Enter Account num : ");
		anum=sc.nextInt();
		System.out.println("Enter name : ");
		sc.next();
		name = sc.nextLine();
		System.out.println("Enter Initial Deposit amount : ");
		blncA=sc.nextDouble();
	}
	void deposit() {
		System.out.println("Enter Account num : ");
		anum=sc.nextInt();
		System.out.println("Enter  Deposit amount : ");
		depoA=sc.nextDouble();
		blncA+=depoA;
	}
	void withdraw() {
		System.out.println("Enter Account num : ");
		anum=sc.nextInt();
		System.out.println("Enter  Withdraw amount : ");
		withA=sc.nextDouble();
		blncA-=withA;
	}
	void Balance() {
		System.out.println("Enter Account num : ");
		anum=sc.nextInt();
		System.out.println(anum+" : "+blncA);
	}
	
	public static void main(String[] args) {
		Account a= new Account();
		a.create();
		a.deposit();
		a.withdraw();
		a.Balance();
		a.sc.close();
	}
	

}
