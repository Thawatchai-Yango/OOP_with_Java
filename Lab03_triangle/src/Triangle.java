//Class
public class Triangle {
	//Static variable
	//Instance variable
	private double base;//15.25
	private double height;//50.5
	//Constructor
	public Triangle() {
	}
	
	public Triangle(double h,double b) {
		this.height = h;
		this.base = b;
	}	
	//Instance Method Setter Getter
	public void BaseSetter(double base) {//15.25
		this.base = base;//15.25
	}
	
	public double BaseGetter() {
		return this.base;
	}
	
	
	public void HeightSetter(double height) {//50.5
		this.height = height;
	}
	
	public double HeightGetter() {
		return this.height;
	}
	//Class Method
	//write class for calculate the area of a triangle
	public double triArea() {
		return (1.0/2.0)*height*base;//
	}
}