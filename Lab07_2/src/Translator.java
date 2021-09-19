import java.util.ArrayList;
import java.util.List;

public class Translator {
	
	private List<People> p = new ArrayList<People>();
	public Translator(){}
	public void add(People people) {
		this.p.add(people);
	}
	public void greetingToAll() {
		for(int i = 0;i<p.size();i++) {
			System.out.println(p.get(i).name + " " + p.get(i).greeting());
		}
	}
}
