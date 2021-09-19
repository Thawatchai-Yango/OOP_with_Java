
public class BookSale {
	private double BookAmount;
	private BookDetail bookdetail;
	private BookPriceRate bookpricerate;

	public BookSale(BookDetail bookdetail,BookPriceRate bookpricerate, double BookAmount){
		this.bookdetail = bookdetail;
		this.bookpricerate = bookpricerate;
		this.BookAmount = BookAmount;
	}
	public double getBookAmount() {
		return this.BookAmount;
	}
	public double getBookPrice() {
		return this.BookAmount*bookpricerate.getBookPrice();
	}
	public double getBookDiscount() {
		double discount = (BookAmount*bookpricerate.getBookPrice())-((BookAmount*bookpricerate.getBookPrice()*(30.0/100.0))) ;
		return discount;
	}
	public BookDetail getbookdetail() {
		return this.bookdetail;
	}
	public BookPriceRate getbookpricerate() {
		return this.bookpricerate;
		
	}
}
 

