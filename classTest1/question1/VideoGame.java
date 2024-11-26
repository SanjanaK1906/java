package classTest1.question1;

public class VideoGame extends Game {
	String platform;
//	VideoGame(String platform,int numberofplayers,String title, int playingtime, boolean gotit, String comment){
//		super(numberofplayers,title,playingtime,gotit,comment);
//		this.platform=platform;
//	}
	void Vgame_get() {
		 super.game_get();
		 System.out.println("Enter platform");
			this.platform=sc.next();
		}
	void Vgame_display(){
		 System.out.println("platform"+platform+"\nnumberofplayers :"+numberofplayers+"\ntitle :"+title+"\nplayingtime :"+playingtime+"\ngotit :"+gotit+"\ncomment "+comment);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
