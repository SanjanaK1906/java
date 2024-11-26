package java_FinalAssignment.que3;

public class Student {
	String name;
	int id;
	double grade;
	Student(){
		name="Unknown";
		id=0;
		grade=0.00;
	}
	Student(String name,int id,double grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	 public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Grade: " + grade);
	        System.out.println();
	    }
	public static void displayStudents(Student[]studentArray) {
		for(Student s:studentArray) {
			s.displayDetails();
		}
	}
	public static void sortStudents (Student[]studentArray ) {
//		Bubble Sort algorithm
		for(int i=0;i<studentArray.length-1;i++) {
			for(int j=0;j<studentArray.length-1-i;j++) {
				if (studentArray[j].grade > studentArray[j + 1].grade) {
                    // Swap the students
                    Student temp = studentArray[j];
                    studentArray[j] = studentArray[j + 1];
                    studentArray[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[]studentArray = new Student[10];
		studentArray[0]= new Student("Sanjana",1,97.23);
		studentArray[1]= new Student("Rishabh",2,94.29);
		studentArray[2]= new Student("Akarsh",3,92.55);
		studentArray[3]= new Student("Suman",4,67.56);
		studentArray[4]= new Student("Ashwini",5,87.98);
		studentArray[5]= new Student("Shashank",6,65.55);
		studentArray[6]= new Student("Gaurang",7,79.78);
		studentArray[7]= new Student("Pawan",8,91.67);
		studentArray[8]= new Student("Kishor",9,78.53);
		studentArray[9]= new Student("Sneha",10,79.93);
		System.out.println("*****Before Sorting (by Grade):");
        displayStudents(studentArray);

        // Sort the students by grades in ascending order
        sortStudents(studentArray);

        // Display the students after sorting
        System.out.println("***********After Sorting (by Grade):");
        displayStudents(studentArray);
	}

}
