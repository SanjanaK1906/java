package lambda;

import java.util.*;
interface Add{
	void sum1( int a, int b); // for return method void
//	int sum1( int a, int b);// for return method int
}
public class sum {

	public static void main(String[] args) {
		// for return method void
		Add a=(x,y)->System.out.println(x+y);
		a.sum1(10,2);
		// for return method int
//		Add b=(int p, int q)->{return (p+q);};
//		System.out.println(b.sum1(20,3));}
	}

}
