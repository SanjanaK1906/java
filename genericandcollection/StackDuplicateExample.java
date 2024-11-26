package genericandcollection;
import java.util.*;
public class StackDuplicateExample {
	public static void main(String[] args) {
		int[]arr= {1,2,3,1};
		Stack<Integer> a=new Stack<Integer>();
		for(int i=0; i<arr.length;i++) {
			if(!a.contains(arr[i])) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}
}
