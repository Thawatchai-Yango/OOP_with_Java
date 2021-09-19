public class Line {
	public double x1; //10
	public double y1; //5
	public double x2; //10
	public double y2; //15
	Line(double x1, double y1, double x2, double y2) 
	{ 
	        this.x1 = x1; //10
	        this.y1 = y1;
	        this.x2 = x2; 
	        this.y2 = y2;
	}
	public double distance() {
		Double Distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.print("The two points are: ");
		System.out.print("("+x1+","+y1+")");
		System.out.print("and");
		System.out.print("("+x2+","+y2+")");
		System.out.print("\nThe distace between two points is :");
		System.out.print(+Distance);
		System.out.println("\n");
		return 0;
	}
}
