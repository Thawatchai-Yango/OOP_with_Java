public class Base{
	private int a;
	protected int b;
	public int c;
	int d;
	
	public Base(){
	}
	void printInBase(){
		System.out.print(" a ="+a);
		System.out.print(" b ="+b);
		System.out.print(" c ="+c);
		System.out.print(" d ="+d);
	}
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a=a;
	} 
	protected int getB(){
		return b;
	}
	public int getC(){
		return c;
	}
	int getD(){
		return d;
	}
}

