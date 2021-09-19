public class Circle extends Shape{
	private double radius;
	public Circle(double r) {
		radius = r;
	}
	@Override
	public double getCircumference() {
		return 2*Math.PI*radius;
		
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
