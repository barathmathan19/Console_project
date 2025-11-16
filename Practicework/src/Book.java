import java.util.*;
public class Book {
	private String title;
	private String author;
	private static ArrayList<Book> bookcollection = new ArrayList<>();
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public static void add_book(Book book) {
		bookcollection.add(book);
	}
	
	public static void remove_book(Book book) {
		bookcollection.remove(book);
	}
	
	public static ArrayList<Book> get_bookcollection(){
		return bookcollection;
	}
}
