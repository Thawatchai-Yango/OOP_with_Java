import java.util.Scanner;
public class Stack {
	public int top;
	public int size = 0;
    public int maxsize = 100;  
    public int[] arr = new int[maxsize];  
	
    public Stack() {	
    }
    
	public int createStack(Scanner sc) {	
		System.out.print("Enter the size of stack : ");
	    size = sc.nextInt(); 
	    maxsize = size;
	    System.out.println("Stack has been created(size of: "+size+")");
	    return maxsize;
	}

	public boolean push(Scanner sc) {
		
		if (size == 0){
			System.out.println("Please create a stack!!");
			return false;
		}
		else if(top == maxsize-1)  
        {  
            System.out.println("Stack is full!!");  
            return false;  
        }  
        else   
        {  
            System.out.print("Push an element into the stack: ");  
            int val = sc.nextInt();  
            top++;  
            arr[(int) top]=val;  
            System.out.println("Item pushed into the stack!!");  
            return true;  
        }  
	}

	public  boolean pop (){
		
		 if (top == -1)  
	        {  
	            System.out.println("Stack is empty!!");  
	            return false;  
	        }  
	        else   
	        {  
	            top --;   
	            System.out.println("Item popped from the stack!!");  
	            return true;  
	        }  
	}

	public void top() {
		System.out.print("=> Top element in the stack: ");  
		if( top == -1) {
			System.out.println("stack is empty!!");
		}
		else {
			System.out.println(arr[top]);
		} 
	}
	
	public void show() {
		System.out.println("=> All elements in the stack");  
		System.out.println("--------Stack size:"+size+"--------");
        for(int i = top; i>=0;i--)  
        {  
        	System.out.print("          |  ");  
            System.out.print(arr[i]);
            System.out.println("  |"); 
        }  
        System.out.println("          |======|"); 
    }

	public boolean stackEmpty() {
		
		  return (top < 0);  
		 }  
		   	 
		 {  
		   top = -1;  
	} 
		   
	public boolean stackFull() {
				
		 return (top > 0);  
		 	}  
				
			{  
				top = -1;  
	}
					    		
}
