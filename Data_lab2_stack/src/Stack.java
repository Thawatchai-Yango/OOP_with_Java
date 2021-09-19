
public class Stack {
	private int Top = 0;
	private String[] list ;
	public Stack(){}
	public Stack(int top){
		list = new String[top];
	}
	public void show(){
		System.out.println("------");
		for(int i=0;i<list.length;i++) {
			System.out.println(i+1+" | "+list[i]);
		}
		System.out.println("------");
	}
	public void push(String l){
		if(!this.stackFull()) {
			list[Top]= l;
			Top++;
			this.show();
			System.out.println("Top = "+ Top + " len = "+ (list.length));
		}else {
			System.out.println("*** Stack Full! Can't push ***\n");
		}
		
	}
	
	public void pop(){
		if(!this.stackEmpty()) {
			list[Top-1]=null;
			Top--;
			this.show();
		}else {
			System.out.println("*** Stack Empty! Can't pop ***\n");
		}
			
	}
	
	public void top(){
		if(Top-1 >=0)
			System.out.println("Top --> "+(Top)+"  = "+list[Top-1]);
		else
			System.out.println("Top --> "+(Top)+"  = "+list[Top]);
	}
	public boolean stackEmpty(){
		if(Top > 0) {
			return false;
		}else if(Top == 0 && list[Top]==null) {
			return false;
		}else {
			return true;
		}
	}
	public boolean stackFull(){
		//System.out.println("Top = "+ Top + " len = "+ (list.length));
		if(Top == list.length) {
			return true;
		}else {
			return false;
		}
	}

}
