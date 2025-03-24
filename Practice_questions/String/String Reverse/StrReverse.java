package interviewprep.String.StringReverse;

public class StrReverse {
	
	public String Stringreverse(String s) {
		StringBuilder sc= new StringBuilder(s);
		sc.reverse();
		return sc.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrReverse sc= new StrReverse();
		System.out.println(sc.Stringreverse("hello"));
	}

}
