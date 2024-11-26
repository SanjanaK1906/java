package assign4;
//Write a Java program to read an integer array from the user and calculate the average of its elements. Handle the NumberFormatException if the user enters a non-integer value
import java.util.*;
public class avg {
	int a,len;
	int[] arr1;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array");
		len = sc.nextInt();
		arr1=new int[len];
		System.out.println("Enter elements of array");
		for(int i=0;i<len;i++) {
			try {
				arr1[i]=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
				sc.next();  // Clear the invalid input
			}
		}
		sc.close();
	}
	void average() {
		int avg=0;
		for(int i=0;i<len;i++) {
			avg+=arr1[i];
		}
		System.out.print(avg);
	}
	public static void main(String[] args) {
		avg a= new avg();
		a.input();
		a.average();

	}

}
