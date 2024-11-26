package classTest1.question1;
import java.util.*;
class testexception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	void message() {
		System.out.println("Enter valid input");
	}
}
public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Game Store :");
		System.out.println("Enter your choice:");
		System.out.println("1.CD Details\n2.DVD Details\n3.Games");
		int choice=sc.nextInt();
		try{
		if(choice ==1) {
			Items i = new Items();
			i.items_get();
			i.items_display();
		}else if(choice ==2) {
			CD c= new CD();
			c.cd_get();
			c.cd_display();
		}else if(choice ==3) {
			System.out.println("Enter your choice:");
			System.out.println("1.video game\n2.Board game");
			int choice1=sc.nextInt();
			if(choice1 ==1) {
				VideoGame v=new VideoGame();
				v.Vgame_get();
				v.Vgame_display();
			}else if (choice1 ==2) {
				BoardGame b=new BoardGame();
				b.Bgame_get();
				b.Bgame_display();
			}else {
				throw new testexception();
			}
		}else {
			throw new testexception();
		}
		}catch(testexception e) {
			e.message();
		}finally {
			sc.close();
		}
	}

}
