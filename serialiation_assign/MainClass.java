package serialiation_assign;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student("sanjana", 29);

        student.show();

        try (FileOutputStream f = new FileOutputStream("student.dat");
             ObjectOutputStream o1 = new ObjectOutputStream(f)) {
            
            o1.writeObject(student);
            System.out.println("Student data has been serialized to student.dat");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
