
public class Rectangle {
	private double Width;
	private double Height;
	
	public Rectangle() {
		this.Width = 0;
		this.Height = 0;
	}
	public Rectangle(double Width, double Height) {
		this.Width = Width;
		this.Height = Height;
	}
	
	
	public void setWidth(double Width) {
		this.Width = Width;
		
	}

	public void setHeight(double Height) {
		this.Height = Height;
		
	}

	public double getWidth() {
		
		return this.Width;
	}

	public double getHeight() {
		
		return this.Height;
	}

	public double getArea() {
		
		return Height*Width;
	}

	public double getCicumference() {
		
		return (Height*2)+(Width*2);
	}

}
