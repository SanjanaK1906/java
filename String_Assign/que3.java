package String_Assign;

public class que3 {
	
	public void uppercase(String s) {
		String uc= s.toUpperCase();
		System.out.println("Upper case -> "+uc);
	}
	public String lowercase(String s) {
		String lc= s.toLowerCase();
		
		return lc;
	}
	public void charbychar(String s) {
		int len = s.length();
		for(int i=0;i<len;i++) {
			System.out.println(s.charAt(i));
		}
	}
	public void Count_occurrence(String s, char c) {
		int len = s.length();
		int count =0;
		String st = lowercase(s);
		for(int i=0;i<len;i++) {
			if(c==st.charAt(i)){
				count++;
			}
		}
		System.out.println("Count of -> "+c+" is "+count);
	}
	public void str_concat(String s1, String s2) {
		String snew= s1.concat(s2);
		System.out.println(s1+" + "+s2+" = "+snew);
	}
	public void str_len (String s) {
		int len = s.length();
		System.out.println("length of string "+s+" is "+len);
	}
	public void palindrome(String s) {
		int len = s.length();
		String st = lowercase(s);
		int count=0;
		int t=len/2;
		for(int i=0;i<t;i++) {
			if(st.charAt(i)==st.charAt(len-(i+1))) {
				count++;
			}
		}
		if(count==t) {
			System.out.println("palindrome exist for "+s);
		}else {
			System.out.println("palindrome not exist for "+s);
		}
		
	}
	public void printchar(String s, int n) {
		String s1 = s.substring(0, n);
		System.out.println(s1);
	}
	public void replacechar(char a1, char a2,String s) {
		String snew= s.replace(a1, a2);
		System.out.println(snew);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="saNjaNa";
		que3 q= new que3();
		q.uppercase(s);
		String p=q.lowercase(s);
		System.out.println("lower case -> "+p);
		q.charbychar(s);
		q.Count_occurrence(s, 'n');
		q.str_concat("sanjana","kumbhar");
		q.str_len(s);
		q.palindrome(s);
		q.palindrome("sanas");
		q.palindrome("sannas");
		q.printchar(s,3);
		q.replacechar('a','b',s);
		
	}

}
