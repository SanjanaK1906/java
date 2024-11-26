package String_Assign;

public class Que5 {
//Write a function to append a string “noida” after a String
	public void appendstring(String oldstr, String newstr) {
		String s1= oldstr+newstr;
		String s2=oldstr.concat(newstr);
		System.out.println(s1);
		System.out.println(s2);
		
	}
	public static void main(String[] args) {
		Que5 q5=new Que5();
		q5.appendstring("welcome in ", "noida");
	}
}
