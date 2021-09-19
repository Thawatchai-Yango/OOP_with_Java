
public class BookDetail {
	private String BookId;
	private String BookName;
	private String BookWriter;

	public BookDetail(String BookId, String BookName, String BookWriter) {
		this.BookId = BookId;
		this.BookName = BookName;
		this.BookWriter = BookWriter;
	}
	public String getBookId() {
		return this.BookId;
	}
	public String getBookName() {
		return this.BookName;
	}
	public String getBookWriter() {
		return this.BookWriter;
		
	}

}
