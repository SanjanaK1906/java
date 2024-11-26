package genericandcollection;

//Q Demonstrate TreeSet with String type .
//
//Ask 5 names from user and add then to tree set and display all names using iterator
import java.util.*;
public class TreeColle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> s = new TreeSet<String>();
		System.out.println("enter 5 names-");
		for(int i=0; i<5;i++) {
			String st= sc.nextLine();
			s.add(st);
		}
		System.out.println(s);
		Iterator<String> j= s.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		sc.close();
	}
}
