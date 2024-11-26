package constr;

public class constr_over {

	int a;
	int b;
	constr_over(){
		a=1;
		b=2;
	}
	constr_over(int va){
		a=va;
	}
	constr_over(int va,int vb){
		a=va;
		b=vb;
	}
	void display() {
		System.out.println("value of a is "+ a+" and b is "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constr_over c1= new constr_over();
		c1.display();
		constr_over c2= new constr_over(55);
		c2.display();
		constr_over c3= new constr_over(67,78);
		c3.display();

	}

}
