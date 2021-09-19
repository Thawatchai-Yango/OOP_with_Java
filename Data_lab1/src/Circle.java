
public class Circle {
	double Radius = 0;
	
	public Circle() {}
	public Circle(double Radius) {
		this.Radius = Radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(Radius, 2);
	}
	public double circumference() {
		return 2*Math.PI*Radius;
	}
	public double volume() {
		return (4/3.0)*Math.PI*Math.pow(Radius, 3);
	}
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double Radius) {
		this.Radius = Radius;
	}
}
