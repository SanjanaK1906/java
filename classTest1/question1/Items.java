package classTest1.question1;
import java.util.*;
public class Items {
	Scanner sc = new Scanner(System.in);
	String title;
	int playingtime;
	boolean gotit;
	String comment;
	void items_get() {
		System.out.println("Enter Title");
		this.title=sc.next();
		System.out.println("Enter playingtime(min)");
		this.playingtime=sc.nextInt();
		System.out.println("Enter gotit (true/false)");
		this.gotit=sc.nextBoolean();
		System.out.println("Enter comment");
		this.comment=sc.next();
	}
	void items_display() {
		System.out.println("title :"+title+"\nplayingtime (min) :"+playingtime+"\ngotit :"+gotit+"\ncomment "+comment);
	}
	public static void main(String[] args) {
		

	}

}
