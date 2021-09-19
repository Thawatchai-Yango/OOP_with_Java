public class Rectangle implements Shape {
	private double width;
	private double height;
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}