public class Position {
	
	public String id;
	public String title;
	public double rate;

	public Position(String id, String title, double rate) {
		this.id=id;
		this.title=title;
		this.rate=rate;
	}
	
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public double getRate() {
		return rate;
	}
}
