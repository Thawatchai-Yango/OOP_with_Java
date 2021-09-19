import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Author a1 = new Author("A01","Richard Martin");
		Author a2 = new Author("A02","R.Larman");
		Author a3 = new Author("A03","Bob Martin");
		
		Patron p1 = new Patron("Mem-01","Jimmy");
		
		Book b1 = new Book("Object-Oriented design","145345","Addision-wisley");
		Book b2 = new Book("Object-Oriented programming using Java","22222","Pretice-Hall");
		
		b1.addAuthor(a1);
		b1.addAuthor(a2);
		b2.addAuthor(a3);
		
		int copyNo = 1;
		b1.addBookItem(new BookItem("QA0111.1",copyNo));
		b1.addBookItem(new BookItem("QA0111.2",++copyNo));
		
		copyNo=1;
		b2.addBookItem(new BookItem("QA02001.1",copyNo));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate start_date = LocalDate.parse("06/03/2019",formatter);
		LocalDate due_date = LocalDate.parse("11/03/2019",formatter);
		
		p1.loanBook(b1,"QA0111.1", start_date);
		p1.loanBook(b2,"QA02001.1", start_date);
		b1.printAllAuthor();
		
		p1.listAllBookLoan();
	}

}
