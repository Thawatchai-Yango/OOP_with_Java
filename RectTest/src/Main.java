
public class Main {

	public static void main(String[] args) {
		SetOfRectangle s= new SetOfRectangle();
		int numberOfRec = s.getLength();
		System.err.println(numberOfRec);
		
		s.appendNewRectangle(2.5,3.5);
		numberOfRec = s.getLength(); 
		System.err.println(numberOfRec);
		
		s.appendNewRectangle(2.0,3.0);
		numberOfRec = s.getLength();
		System.err.println(numberOfRec);
		
		s.appendNewRectangle(4.0,5.0);
		numberOfRec = s.getLength();
		System.err.println(numberOfRec);
		
		Rectangle r = s.getRectangle(0);
		double area_r = r.getArea();
		System.out.println("Area 1 :"+area_r);
		
		Rectangle r2 = s.getRectangle(1);
		double area_r2 = r2.getArea();
		System.out.println("Area 2 :"+area_r2);
		
		Rectangle r3 = s.getRectangle(3);
		double area_r3 = r3.getArea();
		System.out.println("Area 2 :"+area_r3);
		
		
	}

}
