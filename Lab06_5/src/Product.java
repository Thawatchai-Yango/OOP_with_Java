public class Product {
	private String productID;
	private String productName;
	private double price;
	public Product(String productID,String productName,double price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	public String getProductID() {
		return this.productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
