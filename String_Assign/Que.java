package String_Assign;
import java.util.Scanner;
public class Que {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] names = new String[5];

	        for (int i = 0; i < names.length; i++) {
	            System.out.print("Enter name " + (i + 1) + ": ");
	            names[i] = scanner.nextLine();
	        }

	        System.out.println("\n First character of each name:");
	        for (String name : names) {
	            if (!name.isEmpty()) {
	                System.out.println(name.charAt(0));
	            } else {
	                System.out.println("Name is empty!");
	            }
	        }

	        scanner.close();
	    }

}
