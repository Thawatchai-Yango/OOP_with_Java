import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String item;
		SLinkStack SLink = null;
		int choice = 6;
		do {
		System.out.print("======== Main Menu ======= \n1. create Stack \n2. push \n3. pop \n4. top \n5. show \n6. exit\nPlease chose your choice :");
		choice = input.nextInt();
		switch(choice) {
			case 1:
				System.out.println("--> CREATE STACK");
				SLink = new SLinkStack();
				break;
			case 2:
				System.out.println("--> PUSH");
				System.out.print("Input item : ");
				item = input.next();
				SLink.push(item);
				break;
			case 3:
				System.out.println("--> POP");
				SLink.pop();
				break;
			case 4:
				System.out.println("--> TOP");
				System.out.println("Top element is "+SLink.Top());
				break;
			case 5:
				System.out.println("--> SHOW");
				SLink.show();
				break;
			case 6:
				System.out.println("--> FINAL STACK");
				SLink.show();
				break;
			default:
				System.out.println("Not correct. please input again");
			}

		
		}while(choice != 6);
			System.out.print("--> EXIT .....");

	}
}
