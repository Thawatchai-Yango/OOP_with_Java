import java.util.ArrayList;
import java.util.List;

public class Book {
		private String title;
		private String ISBN;
		private String bookStore;
		public List<Author> authorlist = new ArrayList<Author>();
		public List<BookItem> booklist = new ArrayList<BookItem>();
		
		
	public Book(String title, String ISBN, String bookStore) {
		this.title = title;
		this.ISBN = ISBN;
		this.bookStore = bookStore;
		
	}
	public String getiitle() {
		return this.title;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public String getBookStore() {
		return this.bookStore;
	}

	public void addAuthor(String id, String Name) {
		Author addlist = new Author(id, Name);
		authorlist.add(addlist);
		
	}

	public void addBookItem(String Code, int copyNo) {
		BookItem addlist = new BookItem(Code,copyNo);
		booklist.add(addlist);
		
	}

	public void printAllAuthor() {
		
		
	}
	public void addAuthor(Author a1) {
		// TODO Auto-generated method stub
		
	}
	public void addBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

}
