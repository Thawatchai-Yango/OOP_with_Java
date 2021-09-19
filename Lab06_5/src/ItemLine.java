public class ItemLine {
	private int qty;
	private double price;
	private Product pro;
	public ItemLine(Product pro,int qty) {
		this.pro = pro;
		this.qty = qty;
		this.price = qty*this.pro.getPrice();
	}
	public Product getLine() {
		return pro;
	}
	public String getLineString() {
		String s = String.format("%s\t%s\t%d\t%.2f\t%.2f",
				pro.getProductID(),pro.getProductName(),
				this.qty,pro.getPrice(),this.price);
		return s;	
	}
	public double getSubtotal() {
		return this.price;
	}
	public int getQty() {
		return this.qty;
	}
	public double getPrice() {
		return this.pro.getPrice();
	}
	public String getProductName() {
		return pro.getProductName();
	}
}
