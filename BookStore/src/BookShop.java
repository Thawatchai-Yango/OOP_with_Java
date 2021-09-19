import java.util.ArrayList;
import java.util.List;

public class BookShop {
	private String OrderId;
	private String CustomerName;
	private String BookDate;
	public double Total;
	public double TotalDis;
	
	private List<BookSale> BSlist = new ArrayList<BookSale>();

	public BookShop(String OrderId, String CustomerName, String BookDate) {
		this.OrderId = OrderId;
		this.CustomerName = CustomerName;
		this.BookDate = BookDate;
	}
	public String getOrderId() {
		return this.OrderId;
	}
	public String getCustomerName() {
		return this.CustomerName;
	}
	public String getBookDate() {
		return this.BookDate;
	}
	public void addOrder(BookDetail bookdetail, BookPriceRate bookpricerate, double BookAmount) {
		BookSale addlist = new BookSale(bookdetail,bookpricerate,BookAmount);
		BSlist.add(addlist);		
	}

	public void print() {
		System.out.println("\nBook Shop : "+getOrderId()+" Customer name: "+getCustomerName()+" Book Date: "+getBookDate());
		System.out.println("---------List of Book----------");
		System.out.println("Book-ID\tBook-Name\tBook-Type\tBook-Amount\tBook-Price\tTotal-Price\tBook-Writer\tDiscount30");
		
		for(BookSale i:BSlist) {
			System.out.print(i.getbookdetail().getBookId());
			System.out.print("\t"+i.getbookdetail().getBookName());
			System.out.print("\t"+i.getbookpricerate().getBookName());
			System.out.print("\t"+i.getBookAmount());
			System.out.print("\t\t"+i.getbookpricerate().getBookPrice());
			System.out.print("\t\t"+i.getBookPrice());
			System.out.print("\t\t"+i.getbookdetail().getBookWriter());
			System.out.println("\t\t"+i.getBookDiscount());
		}
		for(BookSale i:BSlist) {
			Total =Total + i.getBookPrice();	
			TotalDis =TotalDis +i.getBookDiscount();
		}
		System.out.println("\t\t\t\t\t\t\tTotal\t\t"+Total+"\t\tTotalDiscount\t"+TotalDis);
	}

}
