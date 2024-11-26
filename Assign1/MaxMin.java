package Assign1;
import java.util.Scanner;
//Write a function that takes an array of integers and returns both the maximum and minimum values using a loop. Print the results in the main program.  
public class MaxMin {
	int len;
	int[]arr;
	int min() {
		int min=arr[0];
		for(int i=1;i<len;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	int max() {
		int max=arr[0];
		for(int i=1;i<len;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxMin m1=new MaxMin();
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		m1.len=sc.nextInt();
		m1.arr=new int[m1.len];
		System.out.println("Enter elements of array");
		for(int i=0;i<m1.len;i++) {
			m1.arr[i]=sc.nextInt();
		}
		int mini=m1.min();
		int maxi=m1.max();
		System.out.println("minimum mumber of array is :"+mini +" and maximum number is :"+maxi);
		sc.close();
	}
}
