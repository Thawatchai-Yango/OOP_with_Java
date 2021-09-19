public class MouseEventMain {
	public static void main(String[] args) {
		String text1,text2,text3;
		MouseEvents mymouse = new MouseEvents() 
		{
			public String click() {
				return "Click Me";
			}
			public String press() {
				return "Press Me";
			}
			public String doubleClick(){
				return "Double click at mymouse";
			}
		};
		System.out.println("Question 2.1");
		text1 = mymouse.click();
		System.out.println(text1);
		text2 = mymouse.press();
		System.out.println(text2);
		text3 = mymouse.doubleClick();
		System.out.println(text3);
		
		System.out.println("\nQuestion 2.2");
		MyMouse yourMouse = new MyMouse();
		text1 = yourMouse.click();
		System.out.println(text1);
		text2 = yourMouse.press();
		System.out.println(text2);
		text3 = yourMouse.doubleClick();
		System.out.println(text3);
	}
}
