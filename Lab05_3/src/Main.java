public class Main {
	public static void main(String[] args) {
		
		Matrix a = new Matrix(2,2);
		Matrix b = new Matrix(2,2);
		
		a.setElement(0,0, 1); 
		a.setElement(0,1, 2);
		a.setElement(1,0, 3);
		a.setElement(1,1, 4);
		
		b.setElement(0,0, 7);
		b.setElement(0,1, 8);
		b.setElement(1,0, 9);
		b.setElement(1,1, 10);
		
		a.display(a);
		b.display(b);
		
		int row0 = a.getRow();
		System.out.println("Row matrix a    = "+row0);
		int col0 = a.getCol();
		System.out.println("Column matrix a = "+col0);
		
		row0 = b.getRow();
		System.out.println("\nRow matrix b    = "+row0);
		col0 = a.getCol();
		System.out.println("Column matrix b = "+col0);
		
		int x = a.getElement(0,1);
		System.out.println("\nElement matrix a at(0,1) = "+x);
		int x1 =a.getElement(0,0);
		System.out.println("Element matrix a at(0,0) = "+x1);
		
		int xb = b.getElement(0,1);
		System.out.println("\nElement matrix b at(0,1) = "+xb);
		int xb1= b.getElement(0,0);
		System.out.println("Element matrix b at(0,0) = "+xb1);
		
	}
}
