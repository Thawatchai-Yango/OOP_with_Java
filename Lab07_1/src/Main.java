public class Main {

	public static void main(String[] args) {
		Box b = new Box("My shape box");
		b.add(new Circle(2.5));
		b.add(new Rectangle(3.0,4.0));
		double totalArea = b.getTotalArea();
		double totalCircum = b.getTotalCircumference();
		b.add(new Triangle(9.0,11.0,10.0));
		totalArea = b.getTotalArea();
		System.out.println("total Area ="+totalArea);
		System.out.println("getTotal Circumference ="+totalCircum);
	}

}
