package day1;
import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		System.out.println("Enter size of rows");
		int row = S.nextInt();
		System.out.println("Enter size of columns");
		int col = S.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Enter elements of array");
		for (int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				arr[i][j] = S.nextInt();
			}
		}
		System.out.println("Your array");
		for(int p[]:arr) {
			for(int q:p) {
				System.out.print(q+" ");
			}
			System.out.println();
		}
		S.close();
		
	}
}
