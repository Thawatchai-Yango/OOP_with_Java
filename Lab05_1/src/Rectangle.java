//Class
public class Rectangle {
	//Static variable
	//Instance variable
	//ประกาศค่าเริ่มต้น width=0 height=0
	private double height=0;
	private double width=0;

	//constructor
	public Rectangle() {
	}
	public Rectangle(double h, double w) {
		this.height = h;
		this.width = w;	
	}
	//Instance Method Setter Getter
	public void setWidth(double width) {
		this.width = width;	
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	
	//Class Method
	//write class for calculate the area of a rectangle
	public double getArea() {
		return height*width;
	}
	public double getCicumference() {
		return (height*2)+(width*2);
	}

}
