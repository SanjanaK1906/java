package Assign1;
//Write a function that takes a student's score as an argument and returns a letter grade based on the following scale:
//•	90-100: A
//•	80-89: B
//•	70-79: C
//•	60-69: D
//•	Below 60: F
//Use if-else statements to determine the grade.  
import java.util.Scanner;
class Grading {
	int mark;
	char g;
	char find_grade(int m) {
		mark=m;
		if(mark>90 && mark<100) {
			g='A';
		}else if(mark>80 && mark<=89) {
			g='B';
		}else if(mark>70 && mark<=79) {
			g='C';
		}else if(mark>60 && mark<=69) {
			g='D';
		}else if(mark<60) {
			g='F';
		}
		return g;
	}
}
public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks out of 100");
		int score =sc.nextInt();
		Grading g1=new Grading();
		char s_grade= g1.find_grade(score);
		System.out.println("Your grade is : "+ s_grade);
		sc.close();
	}
}
