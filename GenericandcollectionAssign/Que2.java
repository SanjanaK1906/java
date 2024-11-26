package GenericandcollectionAssign;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Que2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> n = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            n.add(name); // Adding names to TreeSet
        }

        System.out.println("\nNames in sorted order:");
        Iterator<String>i = n.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        scanner.close();
    }
}
