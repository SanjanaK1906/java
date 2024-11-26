package serialiation_assign;

import java.io.Serializable;

public class Student implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
