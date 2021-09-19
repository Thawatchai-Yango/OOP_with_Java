
import static java.lang.System.exit;
public class SLinkStack{
	node top;
	SLinkStack(){
		top = null;
	}
	public void push(String newItem) 
    {
        node temp = new node();
        temp.setItem(newItem) ;
        temp.setLink(top);
        top = temp;
    }
	public boolean Empty()
    {
        return top == null;
    }
	public String Top()
    {
        if (!Empty()) {
            return top.getItem();
        }
        else {
            System.out.println("Stack is empty");
            return "";
        }
    }
    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).getLink();
    }
    public void show()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            node temp = top;
            System.out.print("[ ");
            while (temp != null) {
            	
                System.out.print(temp.getItem());
                temp = temp.getLink();
                System.out.print(" ");
            }
            System.out.println("]");
        }
    }
}
