public class TrapezoidalRule {
	 public static double integrate(Function f, double a, double b, int n)
	 	{
		 double h = (b-a)/((double)n);
		 double s = 0.5*(f.f(a) + f.f(b));
		 int i;
		 for (i = 1; i <= n-1; i++) {
			 s = s + f.f(a+i*h);
		 }
		 return h*s;
	 	}	
}
