import java.util.Scanner;

public class testStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String item;
		int Size = 0;
		Stack stack = new Stack();
		
		int choice;
		do {
		System.out.print("Main Menu \n1. create stack \n2. push \n3. pop \n4. top \n5. exit \nPlease chose your choice :");
		choice = input.nextInt();
		
		
		switch(choice) {
			case 1:
				System.out.print("Input size of stack : ");
				Size = input.nextInt();
				stack = new Stack(Size);
				break;
			case 2:
				System.out.print("Input item to stack : ");
				item = input.next();
				stack.push(item);
				break;
			case 3:
				stack.pop();
				break;
			case 4:
				stack.top();
				break;
			case 5:
				break;
			default:
				System.out.println("Not correct. please input again");
		}
	}while(choice != 5);
		System.out.print(" === End of Program ===");
	}

}
