public class Calculate {
	public static int result;
	
	static int addNumber(int x, int y) {
		result = x+y;
		//System.out.println("Addition Number is : "+result);
		return result;
	}
	public int subNumber(int x, int y) {
		result  = x-y;
		//System.out.println("Subtraction Number is : "+result);
		return result;
	}
	static void diNumber(int x, int y) {
		result  = x/y;
		System.out.println("Division Number is : "+result);
	}
	static void multiNumber(int x, int y) {
		result  = x*y;
		System.out.println("Multiplication Number is : "+result);
	}
}
