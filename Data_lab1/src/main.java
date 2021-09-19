import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle circle = new Circle();
		String stop;
		do {
		System.out.print(" === Program Circle ===\n"
				+ "1.Create Circle\n"
				+ "2.Calculate Area\n"
				+ "3.Calculate Circumference\n"
				+ "4.Calculate volume\n"
				+ "5.Show Radius\n"
				+ "please input choice: ");
		int choice = input.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("Input Radius of circle: ");
			circle.setRadius(input.nextDouble());
			break;
		case 2 :
			System.out.printf("Area of circle: %.2f\n",circle.area());
			break;
		case 3 :
			System.out.printf("Calculate Circumference of circle: %.2f\n",circle.circumference());
			break;
		case 4 :
			System.out.printf("Volume of circle: %.2f\n",circle.volume());
			break;
		case 5 :
			System.out.println("Radius of circle: "+circle.getRadius());
			break;
		default:
			System.out.println("Not correct. please input again");
		}
		System.out.print("Continue? y|n: ");
		stop = input.next();
		}while(stop.equalsIgnoreCase("y"));
		System.out.print(" === End of Program ===");
	}

}
