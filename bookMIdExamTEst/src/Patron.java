import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patron {
		private String id;
		private String name;
		
		public List<Book> booklist = new ArrayList<Book>();
		
		public Patron(String id, String name) {
			this.id = id;
			this.name = name;
		
		}
		public String getId() {
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String Name) {
			System.out.println("Name "+Name);
		}
		public void loanBook(Book b1, String string, LocalDate start_date) {
			System.out.println();
		}
		public void listAllBookLoan() {
			System.out.println();
			
		}
}
