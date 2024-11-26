package multithreading.example1;

public class mainfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Software s= new Software();
		Hardware h= new Hardware();
		s.start();
		h.start();
	}

}
