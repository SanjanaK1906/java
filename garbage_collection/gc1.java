package garbage_collection;
class temp{
	public void finalize(){
		System.out.println("Garbage collection done");
	}
}
public class gc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp t1 = new temp();
		temp t2 = new temp();
		temp p1=t2;
		t1=null;
		System.gc();
	}

}
