
public class Book {
	private String title = "No name";
	private String type = "No type";
	
	public Book() {
		
	}
	
	public Book(String titleIn, String typeIn) {
		this.title = titleIn;
		this.type = typeIn;
		
	}
	
	public void setTitle(String titleIn) {
		this.title = titleIn;
		
	}
	
	public void setType(String typeIn) {
		this.type = typeIn;
		
	}
	public String getTitle() {
		return title;
		
	}
	
	public String getType() {
		return type;
	}
	
	
}

