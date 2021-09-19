public class Main {
	public static void main(String[] args) {
		
		 MyPoint setOfPoints[] = new MyPoint[10];
		 //[10,5:15,5: 
		 setOfPoints[0] = new MyPoint(10,5);
		 setOfPoints[1] = new MyPoint(15,5);
		 setOfPoints[2] = new MyPoint(20,8);
		 setOfPoints[3] = new MyPoint(14,11);
		 setOfPoints[4] = new MyPoint(21,10);
		 
		 System.out.println("Show all five points");
		 
		 
		 
		 for(int i=1; i<=5; i++)
		 { 
			 System.out.print("\npoint"+i +" (x,y): ");
			 System.out.print(""); 
			 setOfPoints[i-1].display(); 
		 }
		 //edit for the new point at five
		 System.out.print("\n\nNew point at 4 (x,y): ");
		 setOfPoints[3] = new MyPoint(18,12);
		 setOfPoints[3].display(); 	
		 System.out.print("\n\nNew point at 5 (x,y): ");
		 setOfPoints[4] = new MyPoint(30,15);
		 setOfPoints[4].display(); 		
 }
}