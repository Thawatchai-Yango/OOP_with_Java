public class Matrix {
	private int [][] matrix;
	
	public Matrix(int row, int col) {
		matrix = new int[row][col];
	}
	
	public void setElement(int row, int col, int num) {
		matrix[row][col] = num;
	}
	
	public int[][] getElement() {
		return matrix;
	}	
	
	public void display(Matrix matrix) {
		int[][] m = matrix.getElement();
		for(int i=0; i < m.length; i++) {
			for(int j=0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");	
			}
			System.out.println();
		}
		System.out.println();	
	}
	
	public int getRow() {
		return matrix.length;
	}
	
	public int getCol() {
		return matrix[0].length;
	}
	
	public String toString() {
		String text="";
		for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[0].length;j++) {
					
				}
		}		
		return text;
	}
	
	public int getElement(int i, int j) {
		return matrix[i][j];
	}
}
