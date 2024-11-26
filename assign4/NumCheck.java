package assign4;

class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	MyException(String message){
		super(message);
	} 
}
public class NumCheck {
	int n1, n2, n3;
	NumCheck(int a, int b, int c){
		n1=a;
		n2=b;
		n3=c;
	}
	
	void sum(){
		try {
			if(n1>10 && n2>10 && n3>10) {
				System.out.println("sum is "+(n1+n2+n3));
			}else {
				throw new MyException("Number is less than 10");
			}
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		NumCheck t1 = new NumCheck(11,22,33);
		t1.sum();
		NumCheck t2 = new NumCheck(1,22,33);
		t2.sum();
		NumCheck t3 = new NumCheck(11,2,33);
		t3.sum();
		NumCheck t4 = new NumCheck(11,22,3);
		t4.sum();
	}

}
