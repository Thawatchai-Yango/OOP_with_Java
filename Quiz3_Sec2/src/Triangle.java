//Class
public class Triangle {
	//Static variable
	private double base;
	private double height;
	
	//Constructor
	public Triangle() {
	}
	public Triangle(double h,double b) {
		this.height = h;
		this.base = b;
	}
	
	//Instance Method
	public void WidthSetter(double base) {
		this.base = base;
	}
	
	public void HeightSetter(double height) {
		this.height = height;
	}
	
	public double WidthGetter() {
		return this.base;
	}
	public double HeightGetter() {
		return this.height;
	}
	
	//Class Method
	public double triArea() {
		return 1.0/2.0*height*base;
	}
}