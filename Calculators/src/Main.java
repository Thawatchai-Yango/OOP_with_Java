import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter your Number: ");
		int x = input.nextInt();
		int y = input.nextInt();
		Calculate.addNumber(x, y);
		
		Calculate OBsub = new Calculate();
		OBsub.subNumber( x, y);
		
		//Calculate.addNumber(50, 20);
		//Calculate.addNumber(100, 20);
		//Calculate.addNumber(40, 20);
		//Calculate.addNumber(20, 20);
		
		//Calculate OBsub = new Calculate();
		//OBsub.subNumber(50, 20);
		 
		//Calculate.diNumber(50, 10);
		
		//Calculate.multiNumber(50, 20);
	}

}
