package assign4;

public class MyCalculator {
	double n=0, p=0;
	long d=0;
	long power(double n, double p) {
		if(n>0 && p>0) {
		d=(long)Math.pow(n, p);
		}else {
			try {
				if(n==0 || p==0) {
					throw new ArithmeticException("java.lang.Exception: n and p should not be zero");
				}else if(n<0 || p<0){
					throw new ArithmeticException("java.lang.Exception: n and p should not be negative");
				}
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		 return d;
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator m= new MyCalculator();
		double res = m.power(2, 2);
		System.out.println(res);
		MyCalculator m1= new MyCalculator();
		double res1 = m1.power(0, 2);
		System.out.println(res1);
		MyCalculator m2= new MyCalculator();
		double res2 = m2.power(2, 0);
		System.out.println(res2);
		MyCalculator m3= new MyCalculator();
		double res3 = m3.power(-2, -3);
		System.out.println(res3);
		MyCalculator m4= new MyCalculator();
		double res4 = m4.power(2, -3);
		System.out.println(res4);
	}

}
