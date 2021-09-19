public class Main {
	public static void main(String[] args) {
		
		SetOfRectangle s;
		//No create Rectangle list
		//Return size of list = 0
		s = new SetOfRectangle();
		int numberOfRec = s.getLength();
		System.out.println("Size of Rectangle list s1:"+numberOfRec);
		//Create 1st Rectangle list 
		//Return size of list = 1
		s.appendNewRectangle(2.5, 3.5);
		numberOfRec = s.getLength();
		System.out.println("Size of Rectangle list s2:"+numberOfRec);
		//Create 2nd Rectangle list
		//Return size of list =2
		s.appendNewRectangle(2.0,3.0);
		numberOfRec = s.getLength();
		System.out.println("Size of Rectangle list s3:"+numberOfRec);
		//Create 3rd Rectangle lsit
		//Return size overflow
		s.appendNewRectangle(4.0,3.5);
		numberOfRec = s.getLength();
		System.out.println("Size of Rectangle list s4:"+numberOfRec);
		Rectangle r = s.getRectangle(0);
		//Reference to r
		System.err.println(r);
		//Calculate area of 1st list in Rectangle
		double area_r = r.getArea(); 
		System.out.println("\nArea of Rectangle s2 : "+area_r);
		double Cumf_r = r.getCircumference(); 
		System.out.println("Circumference of Rectangle s2 : "+Cumf_r);
		
		Rectangle r1 = s.getRectangle(1);
		//Reference to r1
		System.err.println(r1);
		//Calculate area of 2nd list in Rectangle
		double area_r1 = r1.getArea(); 
		System.out.println("\nArea of Rectangle s3 : "+area_r1);
		double Cumf_r1 = r1.getCircumference(); 
		System.out.println("Circumference of Rectangle s3 : "+Cumf_r1);
		
		Rectangle r2 = s.getRectangle(2);
		System.err.println(r2);
		double area_r2 = r2.getArea(); 
		//System.out.println("Area of Rectangle s4 : "+area_r2);
		
		//Calculate total area of 1st and 2nd list of rectangle
		double totalArea_s = s.getTotalArea();
		System.out.println("\nTotal Area of Rectangle: "+totalArea_s);
		//Calculate total Circumference of 1st and 2nd list of rectangle
		double totalCumf_s = s.getTotalCircumferreance();
		System.out.println("Total Circumference of Rectangle: "+totalCumf_s);
		
		//test for out off range if the Rectangle list is overflow
		//And Display put Out of range
		//and will be return null
		Rectangle r3 = s.getRectangle(3);
		System.err.println(r3);
		double area_r3 = r3.getArea(); 
		System.out.println("Area of Rectangle s4 : "+area_r3);
		
		}

}
