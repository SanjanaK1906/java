package assign4;

class MyException1 extends Exception{
	private static final long serialVersionUID = 1L;
	MyException1(String message){
		super(message);
	} 
}
public class NumCheck1 {
	
	public static void main(String[] args) {
			
			try {
				int i;
				int sum=0;
				for(String s:args) {
					i=Integer.parseInt(s);
					if(i>10) {
						sum=sum+i;
					}else {
						throw new MyException1("Number is less than 10");
					}
				}
				System.out.println("sum is "+sum);
			}catch(MyException1 e){
				System.out.println(e.getMessage());
			}
		
	}

}
