package interviewprep.Basic_num;

public class FibonacciSeriesRecursion {
	//1 2 3 5 8 13...................
	public static int Fibonacci(int num) {
		if(num<=1) {
			return 1;
		}
		return Fibonacci(num-1)+Fibonacci(num-2);
	}
	public static void main(String[] args) {
		int num=5;
		for(int i=0; i<=num;i++) {
			System.out.print(Fibonacci(i)+" "); 
		}
		
	}

}
