package interviewprep.Basic_num;

public class Prime_Number {
	public void isprime(int n) {
		int m = n/2;
		int flag=0;
		if(n<2) {
			System.out.println(n+" is not prime number");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n + " is prime number");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Number p= new Prime_Number();
		p.isprime(1);
		p.isprime(2);
		p.isprime(5);
		p.isprime(25);
	}

}
