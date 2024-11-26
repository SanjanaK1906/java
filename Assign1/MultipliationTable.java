package Assign1;
import java.util.Scanner;
//Write a function that takes an integer n and prints the multiplication table for that number (from 1 to 10) using a loop.  
public class MultipliationTable {
	int num;
	void table() {
		for(int i=1;i<=10;i++) {
			int mul=num*i;
			System.out.println(num +" x "+i +" = "+mul);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number for table :");
		MultipliationTable m1=new MultipliationTable();
		m1.num=sc.nextInt();
		m1.table();
		sc.close();
	}
}


