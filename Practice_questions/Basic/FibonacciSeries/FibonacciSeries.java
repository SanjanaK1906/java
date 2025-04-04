package interviewprep.Basic_num;

public class FibonacciSeries {
	public static void Fibonaccis(int num) {
		int prev=0,next =1;
		for(int i=0;i<num;i++) {
			System.out.print(next+" ");
			int k=next;
			next=prev+next;
			prev=k;
		}
	}
	public static void main(String[] args) {
		Fibonaccis(6);
	}

}
