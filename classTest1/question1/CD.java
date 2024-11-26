package classTest1.question1;

public class CD extends Items {
	 String artist;
	 int NumberofTracks;
//	 CD(String artist,int NumberofTracks,String title, int playingtime, boolean gotit, String comment){
//		 super(title,playingtime,gotit,comment);
//		 this.artist=artist;
//		 this.NumberofTracks=NumberofTracks;
//	 }
	 void cd_get() {
		 super.items_get();
			System.out.println("Enter artist");
			this.artist=sc.next();
			System.out.println("Enter NumberofTracks");
			this.NumberofTracks=sc.nextInt();
		}
	 void cd_display(){
		 System.out.println("artist :"+artist+"\nNumberofTracks"+NumberofTracks+"\ntitle :"+title+"\nplayingtime :"+playingtime+"\ngotit :"+gotit+"\ncomment "+comment);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
