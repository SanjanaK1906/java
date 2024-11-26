package assign4;
//Write a program that define interface Admission having abstract method registration 
//Create another class Student in separate file having method Addstudent ()
//a)	  In Addstudent create local class Mtech student that inherits Admission interface 
//b)	 In same method  also create anonymous class that also inherits Admission interface 
//In both above classes implement registration method 
//
//In main call AddStudent method of student class.
interface Admission{
	void registration();
}
class Student1{
	void Addstudent() {
		System.out.println("add student");
		class Mtech implements Admission{
			public void registration() {
				System.out.println("student1 -registration");
			}
		}
		Mtech m1=new Mtech();
		m1.registration();
		new Admission(){
			public void registration() {
				System.out.println("student1 -registration2");
			}
		}.registration();
	}	
}
public class Adm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		s1.Addstudent();
	}
}



