package java_FinalAssignment.Que2;

public class Library{
	public static void displayLibrary (Book[] library) {
		for(Book b:library) {
			b.displayDetails();
			System.out.println();
		}
	}
	 public static void searchBook(Book[] library, String title) {
		  boolean found = false;
		  for(Book b:library) {
			  if (b.title.equalsIgnoreCase(title)) {
	                b.displayDetails();
	                found = true;
	                break; // Exit the loop once the book is found
	            }
		  }
		  if(!found) {
			  System.out.println("Book not found! ");
		  }
	 }
	public static void main(String[] args) {
		Book[] library= new Book[5];
		library[0] = new Book("book1", "author1", "9780061120084");
        library[1] = new Book("book2", "author2", "9780451524935");
        library[2] = new Book("book3", "author3", "9780743273565");
        library[3] = new Book("book4", "author4", "9781503280786");
        library[4] = new Book("book5", "author5", "9780316769488");
        System.out.println("Library Inventory:");
        displayLibrary(library);
        System.out.println("\nSearching for 'book5':");
        searchBook(library, "book5");

        System.out.println("\nSearching for 'book7':");
        searchBook(library, "book7");
	}

}

