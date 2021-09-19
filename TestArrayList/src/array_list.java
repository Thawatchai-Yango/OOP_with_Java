import java.util.ArrayList;
import java.util.List;


public class array_list {

	public static void main(String[] args) {
	List<String> cars = new ArrayList<String>();
	cars.add("TOYOTA");
	cars.add("NISSAN");
	cars.add("VOLVO");
	cars.add("BENZ");
	
	System.out.println("ArrayList in String");
	System.out.println("The size of list: "+cars.size());
	System.out.println("The items in the list: "+cars);
	System.out.println("Fisrt item is: "+cars.get(0));
	System.out.println("Second item is: "+cars.get(1) );
	
	System.out.println("Print item using for loop");
	for (String i : cars) {
	      System.out.println(i);
	    }
	
	
	 List<Integer> myNumbers = new ArrayList<Integer>();
	 myNumbers.add(33);
	 myNumbers.add(15);
	 myNumbers.add(20);
	 myNumbers.add(34);
	 myNumbers.add(8);
	 myNumbers.add(12);
	 System.out.println("\nArrayList in Integer");
	 System.out.println("The size of list: "+myNumbers.size());
	 System.out.println("The items in the list: "+myNumbers);
	 System.out.println("Fisrt item is: "+myNumbers.get(0));
	 System.out.println("Second item is: "+myNumbers.get(1) );
		
	 System.out.println("Print item using for loop");
	 for (Integer i : myNumbers) {
		    System.out.println(i);
	 }
	 
	}
}
