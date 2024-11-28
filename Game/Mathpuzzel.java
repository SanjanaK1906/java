package Game;
import java.util.*;
public class Mathpuzzel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Guess any number in your mind");
		
		System.out.println("Tell me is it 1 / 2 / 3 / 4 / 5 digits");
		int num = sc.nextInt();
		int add=0;
		if (num==1) {
			add =9;
		}else if(num==2) {
			add =99;
		}else if(num==3) {
			add =999;
		}else if(num==4) {
			add =9999;
		}else if(num==5) {
			add =9999;
		}
		System.out.println("add "+ add+" to it ");
		
		System.out.println("add your numbers 1st digit to all leftover digits\nfor eg. if you got 2345 the add 2+345, you will get 347 like that");
		System.out.println("You will get your original number");
	}

}
