
public class BookPriceRate {
	private String BookId;
	private String BookName;
	private double BookPrice;

	public BookPriceRate(String BookId, String BookName, double BookPrice) {
		this.BookId = BookId;
		this.BookName = BookName;
		this.BookPrice = BookPrice;
	}
	public String getBookId() {
		return this.BookId;
	}
	public String getBookName() {
		return this.BookName;
	}
	public double getBookPrice() {
		return this.BookPrice;
		
	}


}
