
public class Calculators {
	public float x;
	public float y;
	public float z;
	public static float Result;
	
	public Calculators() {
		
	}
	
	public void addition(float x, float y,float z) {
		Result = x+y+z;
		System.out.println("addition is : "+Result);
		
	}
	public void subtraction(float x, float y,float z){
		Result = x-y-z;
		System.out.println("subtraction is : "+Result);
		
	}
	static void multi(float x, float y,float z){
		Result = x*y*z;
		System.out.println("multi is : "+Result);
		
	}
	static void divide(float x, float y,float z){
		Result = x/y/z;
		System.out.println("divide is : "+Result);
		
	}
	

}
