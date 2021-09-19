import java.util.ArrayList;
import java.util.List;

public class Test_array1 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(30);
		number.add(20);
		number.add(15);
		number.add(10);
		
		System.out.println(number);
		System.out.println(number.get(1));
		System.out.println(number.size());
		
		for(Integer i:number) {
			System.out.println(i);
		}

		List<Float> number1 = new ArrayList<Float>();
		number1.add(20.00f);
		number1.add(10.00f);
		
		System.out.println(number1);
		
		List<String> word = new ArrayList<String>();
		word.add("one");
		word.add("two");
		
		System.out.println(word);
		
		for(String i:word) {
			System.out.println(i);
		}
		
		
		
		
	}

}
