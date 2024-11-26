package String_Assign;

public class que2 {
	
	public void vowelfind(int count, String s) {
		int  c=0;
		char arr[]= new char[count];
		for(int i=0;i<count;i++) {
			if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') ||s.charAt(i)=='o') {
					arr[c]=s.charAt(i);
					c++;
			}
		}
		System.out.println("number of vowels are "+c);
		for(int k=0; k<c;k++) {
			System.out.println(arr[k] +" ");
		}
	}
	public static void main(String[] args) {
		String s ="soniaa";
		String snew = s.toLowerCase();
		int count = s.length();
		que2 q= new que2();
		q.vowelfind(count, snew);
		
	}

}
