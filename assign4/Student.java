package assign4;
class AgeNotWithinRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	AgeNotWithinRangeException(){
		System.out.println("AgeNotWithinRangeException");
	}
}
class NameNotValidException extends Exception{
	private static final long serialVersionUID = 1L;

	NameNotValidException(){
		System.out.println("AgeNotWithinRangeException");
	}
}
public class Student {
	int roll_no;
	String name;
	int age;
	String course;
	Student(int r,String n, int a,String c){
		roll_no=r;
		name=n;
		age=a;
		course=c;
	}
	void CheckDetails() {
		try {
			if(age<15 || age>21) {
				throw new AgeNotWithinRangeException();
			}
			if(!name.matches("[a-zA-Z]+")) {
				throw new NameNotValidException();
			}
		}catch(Exception d) {
			System.out.println(d);
		}
		System.out.println("name -"+name+" roll number -"+roll_no+" age-"+age+" course -"+course);
	}
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		Student s1= new Student(1,"sam",20,"PGDAC");
		s1.CheckDetails();
		System.out.println("-------------------------------------------");
		Student s2= new Student(1,"tom",24,"PGDAC");
		s2.CheckDetails();
		System.out.println("-------------------------------------------");
		Student s3= new Student(1,"ram1@",24,"PGDAC");
		s3.CheckDetails();
	}
}
