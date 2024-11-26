package classTest1.question1;

public class BoardGame extends Game {
	String board_type;
	void Bgame_get() {
		 super.game_get();
		 System.out.println("Enter board_type");
			this.board_type=sc.next();
		}
	void Bgame_display(){
		 System.out.println("board_type"+board_type+"\n numberofplayers :"+numberofplayers+"\n title :"+title+"\n playingtime :"+playingtime+"\n gotit :"+gotit+"\n comment "+comment);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
