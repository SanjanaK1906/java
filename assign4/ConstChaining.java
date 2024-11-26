package assign4;

class costruct1{
	costruct1(){
		System.out.println("hello");
	}
	costruct1(int a){
		System.out.println("value of a is "+a);
	}
}
class costruct2 extends costruct1 {
	costruct2(){
		System.out.println("world");
	}
	costruct2(int b){
		super(5);
		System.out.println("value of b is"+b);
	}
}
public class ConstChaining {
	public static void main(String[] args) {
		new costruct2();
		System.out.println("---------");
		new costruct2(20);
	}

}
