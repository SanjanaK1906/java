package interviewprep.Basic_num;

public class Reversenumber {
	public int Reversenum(int num) {
		int rev=0;
		while(num!=0) {
			int last= num%10;
			rev=rev*10+last;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Reversenumber r = new Reversenumber();
		System.out.println(r.Reversenum(2999));
	}

}
