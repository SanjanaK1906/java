package java_FinalAssignment.Que2;

public class Book {
	String title;
	String author;
	String isbn;//): to store the ISBN number of the book.
	Book(){
		title="Unknown";
		author="Unknown";
		isbn="000000";
	}
	Book(String title,String author,String isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	 public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	    }
}
