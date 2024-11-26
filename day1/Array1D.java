package day1;
import java.util.Scanner;
//wap to ask size of one D array ,take input from user and display it using enhanced for loop
public class Array1D {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter size of 1d array : ");
		int size= S.nextInt();
		System.out.println("Enter elements of array : ");
		int arr[]=new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= S.nextInt();
		}
		System.out.println("Your array is : ");
		for(int p:arr) {
			System.out.print(p+" ");
		}	
		S.close();
		}
}
