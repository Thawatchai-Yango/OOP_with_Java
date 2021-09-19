import java.util.ArrayList;
import java.util.List;

public class SetOfRectangle {
	private List<Rectangle> regs = new ArrayList<Rectangle>();
	
	
	
	
	public int getLength() {
		if(regs.size()<3) {
			return regs.size();
		}
		else {
			System.err.println("Over Flow");
			return 0;
		}
		
	}




	public void appendNewRectangle(double width, double height) {
		Rectangle AddList = new Rectangle();
		regs.add(AddList);
		
	}




	public Rectangle getRectangle(int n) {//n=3
		if( n >= 0 && n < regs.size()) { //true
			return regs.get(n);
		}
		
		else {
			System.err.println("Out of range");
			return null;
		}
	}
	

	

}
