public class Main {
	public static void main(String[] args) {
		double a=3.0;
		double b=6.0;
		double area = TrapezoidalRule.integrate ( (double x)->{return x*x;},a,b,1000);
		System.out.println("Area under the graph: "+area);
	}
}
