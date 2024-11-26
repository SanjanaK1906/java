package assign4;

class InternalException extends Exception{
	private static final long serialVersionUID = 1L;
	InternalException(){
		super("Internal mark is exceed");
	}
}
class ExternalException extends Exception{
	private static final long serialVersionUID = 1L;
	ExternalException(){
		super("external marks is exceed");
	}
}
public class Marks {
	int emarks=0;
	int imarks=0;
	void check(int i, int e ) {
		emarks=e;
		imarks=i;
		try {
			if(imarks>40) {
				throw new InternalException();
			}
			if(emarks>60) {
				throw new ExternalException();
			}
		}catch(Exception d) {
			System.out.println(d);
		}
		System.out.println("Internal marks -"+imarks+" External Marks -"+emarks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks m1 = new Marks();
		m1.check(30, 50);
		System.out.println("-------------------------------------------");
		Marks m2 = new Marks();
		m2.check(50, 50);
		System.out.println("-------------------------------------------");
		Marks m3 = new Marks();
		m3.check(30, 80);
		System.out.println("-------------------------------------------");
		Marks m4 = new Marks();
		m4.check(50, 90);
	}

}