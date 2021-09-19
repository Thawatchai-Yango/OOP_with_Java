import java.util.ArrayList;
import java.util.List;

public class SetOfRectangle {
	private List<Rectangle> regs = new ArrayList<Rectangle>();
	
	public SetOfRectangle() {
	}
	
	public int getLength() {
		if(regs.size()<3) {
			return regs.size();
		}
		else {
			System.err.println("Over flow");
			return 0;
		}
	}
	
	public Rectangle getRectangle(int n) {
		if (n >= 0 && n < regs.size()){
			return regs.get(n);
		}
		else {
			System.err.println("Out of range");
			return null;
		}		
	}
	
	public void displayRectangle() {
		for(int i = 0;i < regs.size();i++) {
			System.out.println(regs.get(i).to_String());
		}
	}
	
	public double getTotalArea() {
		double ttareas=0;
		for (int i = 0; i < regs.size()-1;i++) {
			ttareas = ttareas + regs.get(i).getArea();
		}
		return ttareas;
	}
	
	public double getTotalCircumferreance() {
		double ttcumfer=0;
		for (int i = 0;i < regs.size()-1;i++) {
			ttcumfer = ttcumfer + regs.get(i).getCircumference();
		}
		return ttcumfer;
	}
	
	public void appendNewRectangle(double width,double height) {
		regs.add(new Rectangle(width,height));
		
	}
}
