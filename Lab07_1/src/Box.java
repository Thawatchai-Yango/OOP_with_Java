import java.util.ArrayList;
import java.util.List;

public class Box {
	private List<Shape> shapes = new ArrayList<Shape>();
	private String description;
	public Box(String s) {
		this.description = s;
	}
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	public double getTotalArea() {
		double total =0;
		for(int i = 0;i<shapes.size();i++) {
			total += shapes.get(i).getArea();
		}
		return total;
	}
	public double getTotalCircumference() {
		double total =0;
		for(int i = 0;i<shapes.size();i++) {
			total += shapes.get(i).getCircumference();
			
		}
		return total;
	}
}
