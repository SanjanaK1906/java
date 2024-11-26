package String_Assign;
import java.util.Scanner;
public class Que4 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String choice;
	        do {
	            System.out.println("Menu:");
	            System.out.println("A. Option A");
	            System.out.println("B. Option B");
	            System.out.println("C. Option C");
	            System.out.println("X. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextLine().trim().toUpperCase();
	            switch (choice) {
	                case "A":
	                    System.out.println("You chose Option A.");
	                    break;
	                case "B":
	                    System.out.println("You chose Option B.");
	                    break;
	                case "C":
	                    System.out.println("You chose Option C.");
	                    break;
	                case "X":
	                    System.out.println("Exiting the menu. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (!choice.equals("X")); // Loop until the user enters "X" for exit

	        scanner.close();
	    }
}
