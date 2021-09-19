//class
import java.util.Scanner;
public class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
		 scanner = new Scanner(System.in);
		//Instance caller
		// constructor is invoked while
	    // creating an object of the Main class
		// create the object from "Triangle" class
		// object is MyTriangle
		 
		Triangle MyTriangle = new Triangle();
		MyTriangle.HeightSetter(50.5);
		MyTriangle.BaseSetter(15.25);
		
		
		//create duplicate object reference to MyTriangle object
		Triangle copy = MyTriangle;
		
		
		System.out.println("My Triangle Area(MyTriangle)");
		System.out.println("==> "+MyTriangle.triArea());
	
		
		System.out.println("Duplicate My Triangle Area(dupTriangle)");
		System.out.print("==> "+copy.triArea());
		
		System.out.println("");
		System.out.println("===Please enter five triangle values===");
		// create array of Triangle size of5
		
		double arrTri[]=new double[2];
		
		for(int i=1; i<=arrTri.length; i++)
		{
			//get input from user
			System.out.print("Enter the height of the Triangle "+i +": ");
			double height=scanner.nextDouble();
			
			System.out.print("Enter the base   of the Triangle "+i +": ");
			double base=scanner.nextDouble();
			
			double area = (1.0/2.0)*height*base;
			arrTri[i-1]=area;	
		}
		    System.out.println("");
		    
		    
		for(int i=1; i<=arrTri.length; i++)
		{
			System.out.print("Area of Triangle "+i +": ");
			System.out.println(arrTri[i-1]);  
		} 
		
		double sumTriArea = 0; //384
	
		
		for(int i=1; i<=arrTri.length; i++)
		{
			sumTriArea = sumTriArea + arrTri[i-1]; // 300 +84 =384
		}  
		//Print the sum of five triangles
		 System.out.print("Sum of five Triangles area : " + sumTriArea);  
	}
}
