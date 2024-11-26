package collectionAssignment;

public class Student {
	int rollnum;
	String name;
	int marks;
	public int getrollnum() {
		return rollnum;
	}
	public String getname() {
		return name;
	}
	public int getmarks() {
		return marks;
	}
	public void setrollnum(int r) {
		rollnum=r;
	}
	public void setname(String n) {
		name=n;
	}
	public void setmarks(int m) {
		marks=m;
	}
	public String toString() {
		return rollnum+" "+name+" "+marks;
	}
	public static void main(String[] args) {
	}

}
