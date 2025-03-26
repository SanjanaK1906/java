package interviewprep.Basic_num.palindrome;

public class stringpalindrome {
	public void isstringpalindrome1(String s) {
		Boolean b=false;
		StringBuilder sb=new StringBuilder(s);
		if(s==null){
			System.out.println("Not palindrome -null value");
		}else {
			System.out.println(s.equals(sb.reverse().toString())?"Palindrome":"Not palindrome");
		}
	}
	public void isstringpalindrome2(String s) {
		String revs="";
		for(int i=s.length()-1;i>=0;i--) {
			revs+=s.charAt(i);
		}
		System.out.println(s.equals(revs)?"Palindrome":"Not palindrome");
	}
	
	public static void main(String[]args) {
		stringpalindrome s= new stringpalindrome();
		System.out.println("=========func 1=========");
		s.isstringpalindrome1("madam");
		s.isstringpalindrome1("yes");
		s.isstringpalindrome1("yeey");
		System.out.println("=========func 2=========");
		s.isstringpalindrome1("madam");
		s.isstringpalindrome1("yes");
		s.isstringpalindrome1("yeey");
	}
}
