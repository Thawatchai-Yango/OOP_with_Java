public class Rectangle {
	
	private double width; 
	private double height; 
	
	public Rectangle() {
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setWidth(double width) {
		this.width = width; 
	}
	
	public void setHeight(double height) {
		this.height = height; 
	}
	
	public String to_String() {
		return String.format("Width = %.2f, Height = %.2f.",this.width,this.height); 
	}
	
	public double getArea() {
		return this.width*this.height;
	}
	
	public double getCircumference() {
		return 2*(this.width+this.height);
	}
	
}
