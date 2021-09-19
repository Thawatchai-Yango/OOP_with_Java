public class Main {
	public static void main(String[] args) {
	
	Rectangle r0 = new Rectangle();
	double r0_width  = r0.getWidth();
	double r0_Height = r0.getHeight();
	System.out.print("Width of Rectangle r0: ");
	System.out.println(r0_width);
	System.out.print("Height of Rectangle r0: ");
	System.out.println(r0_Height);
	double area_r0 = r0.getArea();
	System.out.print("Area of Rectangle r0: ");
	System.out.println(area_r0);
	double circum_r0 = r0.getCicumference();
	System.out.print("Circumference of Rectangle r0: ");
	System.out.println(circum_r0);
	
	Rectangle r1 = new Rectangle();
	r1.setWidth(3.5);
	r1.setHeight(3.5);
	double r1_width  = r1.getWidth();
	double r1_Height = r1.getHeight();
	System.out.print("\nWidth of Rectangle r1: ");
	System.out.println(r1_width);
	System.out.print("Height of Rectangle r1: ");
	System.out.println(r1_Height);
	double area_r1 = r1.getArea();
	System.out.print("Area of Rectangle r1: ");
	System.out.println(area_r1);
	double circum_r1 = r1.getCicumference();
	System.out.print("Circumference of Rectangle r1: ");
	System.out.println(circum_r1);
	
	Rectangle r2 = new Rectangle();
	r2.setWidth(3.5);
	r2.setHeight(2.5);
	double r2_width  = r2.getWidth();
	double r2_Height = r2.getHeight();
	System.out.print("\nWidth of Rectangle r2: ");
	System.out.println(r2_width);
	System.out.print("Height of Rectangle r2: ");
	System.out.println(r2_Height);
	double area_r2 = r2.getArea();
	System.out.print("Area of Rectangle r2: ");
	System.out.println(area_r2);
	double circum_r2 = r2.getCicumference();
	System.out.print("Circumference of Rectangle r2: ");
	System.out.println(circum_r2);
	}
}
