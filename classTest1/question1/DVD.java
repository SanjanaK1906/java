package classTest1.question1;

public class DVD extends Items {
	String director;
	void dvd_get() {
		 super.items_get();
			System.out.println("Enter director");
			this.director=sc.next();
		}
	void dvd_display(){
		 System.out.println("director :"+director+"\ntitle :"+title+"\nplayingtime :"+playingtime+"\ngotit :"+gotit+"\ncomment "+comment);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
