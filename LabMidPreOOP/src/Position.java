
public class Position {
	private String id;
	private String title;
	private double rate;
	
	public Position(String id,String title,double rate) {
		this.id = id;
		this.title = title;
		this.rate = rate;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getRate() {
		return this.rate;
	}

}
