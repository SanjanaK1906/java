package Assign1;
import java.util.Scanner;
//Write a function that takes an  10 integer  and returns the sum of all even and odd numbers
public class SumOddEven {
	Scanner sc= new Scanner(System.in);
	int len;
	int[]arr;
	void even() {
		int even_sum=0;
		for(int i=0; i<len;i++) {
			if(arr[i]%2==0) {
				even_sum +=arr[i];
			}
		}
		System.out.println("even numbers sum : "+even_sum);
	}
	void odd() {
		int odd_sum=0;
		for(int i=0; i<len;i++) {
			if(arr[i]%2!=0) {
				odd_sum +=arr[i];
			}
		}
		System.out.println("odd numbers sum : "+odd_sum);
	}
	void array_initialize() {
		for(int i=0; i<len;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		SumOddEven m1= new SumOddEven();
		System.out.println("Enter size of array");
		m1.len=m1.sc.nextInt();
		m1.arr=new int[m1.len];
		System.out.println("Enter elements of array");
		m1.array_initialize();
		m1.even();
		m1.odd();
	}

}
