package interviewprep.String.StringReverse;

public class StrReverse2 {
	
	public String Stringreversee(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		StrReverse2 sc= new StrReverse2();
		System.out.println(sc.Stringreversee("hello"));
	}

}
