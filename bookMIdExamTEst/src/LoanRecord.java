import java.time.LocalDate;
import java.time.LocalTime;

public class LoanRecord {
	private LocalDate start_date;
	private LocalDate due_date;
	private LocalDate end_date;

	public LoanRecord(LocalDate start_date, LocalDate due_date, LocalDate end_date) {
		this.start_date = start_date;
		this.due_date = due_date;
		this.end_date = end_date;
	}
	public LoanRecord(Book b1, String string, LocalDate start_date2) {
		// TODO Auto-generated constructor stub
	}
	public LocalDate getstart_date() {
		return this.start_date;
	}
	public LocalDate getdue_date() {
		return this.due_date;
	}
	public LocalDate getend_date() {
		return this.end_date;
	}
	
}

