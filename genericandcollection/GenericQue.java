package genericandcollection;
//Q create a generic class that t.akes two parameter.define getter and setter methods 
//create object of generic class with string  and integer type and 
//call its getter and   setter method

public class GenericQue<T> {
	T a;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericQue<Integer> e= new GenericQue<Integer>();
		e.setA(10);
		System.out.println(e.getA());
		GenericQue<String> e2= new GenericQue<String>();
		e2.setA("ram");
		System.out.println(e2.getA());
	}
}
