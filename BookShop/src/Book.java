
public class Book {
	public String BookName;
	public String Writer;
	public static float Price;
    static int Page;
	static String Sale;
	static float NumberOfBook;
	static float Allprice;
	
	
	public Book() {
		this.BookName = "No Name";
		this.Writer = "Unknown";
		Price = 0.0f;
		Page = 0;
		Sale = "Unknown";
		NumberOfBook = 0.0f;	
	}
	public void inputBookName(String BookName) {
		this.BookName = BookName;
		System.out.println("Book name is "+BookName);
	}
	public void inputWriter(String Writer) {
		this.Writer = Writer;
		System.out.println("Writer name is "+Writer);
	}
	public void inputPrice(float Price) {
		this.Price = Price;
		System.out.println("Price of book is "+Price);
	}
	static void inputPage(int Page) {
		System.out.println("Page is "+Page);
	}
	static void inputSale(String Sale) {
		System.out.println("Sale :  "+Sale);
	}
	static void inputNumberOfBook(int NumberOfBook) {
		Allprice = NumberOfBook*Price;
		System.out.println("You have to pay "+Allprice);
	}
}
