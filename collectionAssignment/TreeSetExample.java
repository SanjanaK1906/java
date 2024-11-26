package collectionAssignment;
import java.util.*;
class MyRollnoComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.rollnum, s2.rollnum);
	}
}
public class TreeSetExample {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.setrollnum(1);
		s.setname("sanjana");
		s.setmarks(90);
		Student s1= new Student();
		s1.setrollnum(2);
		s1.setname("Rishabh");
		s1.setmarks(92);
		Student s2= new Student();
		s2.setrollnum(3);
		s2.setname("Akarsh");
		s2.setmarks(93);
		Student s3= new Student();
		s3.setrollnum(4);
		s3.setname("saurabh");
		s3.setmarks(98);
		Student s4= new Student();
		s4.setrollnum(5);
		s4.setname("viju");
		s4.setmarks(97);
		
		TreeSet<Student> t= new TreeSet<Student>( new MyRollnoComparator());
		t.add(s);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println(t);
	}

}
