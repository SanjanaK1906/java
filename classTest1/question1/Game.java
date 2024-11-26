package classTest1.question1;

public class Game extends Items {
	int numberofplayers;
	void game_get() {
		 super.items_get();
		 System.out.println("Enter numberofplayers");
			this.numberofplayers=sc.nextInt();
		}
	void game_display(){
		 System.out.println("numberofplayers :"+numberofplayers+"title :"+title+" playingtime :"+playingtime+" gotit :"+gotit+" comment "+comment);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
