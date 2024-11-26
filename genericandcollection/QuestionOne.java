package genericandcollection;
import java.util.*;
public class QuestionOne {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		System.out.println(a);
		boolean flag =false;
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.size();j++) {
				if(a.get(i)==a.get(j) && i!=j) {
					flag=true;
				}
			}
		}		
		System.out.println(flag);	
	}
}
