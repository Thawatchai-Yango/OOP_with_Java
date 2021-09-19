import java.util.Scanner;
public class testStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
	
		do {
			System.out.print("_______________________________________");
			System.out.print("\n== Main menu for stack implementation==\n"
					+ "1. Create stack\n"
					+ "2. Push\n"
					+ "3. pop\n"
					+ "4. top\n"
					+ "5. exit\n"
					+ "please chose your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				//System.out.print("Input the size of a stack: ");
				stack.createStack(sc);
				break;
			case 2 :
				stack.push(sc);
				stack.show();
				break;
			case 3 :
				stack.pop();
				stack.show();
				break;
			case 4 :
				stack.top();
				break;
			case 5 :
				System.out.println("******Program is terminated******");
				stack.show();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid choice");
				}
			}while(true);
	}
}
