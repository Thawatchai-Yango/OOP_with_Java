import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.stream.Stream; 

public class BasicMain {
	public static void main(String[] args) { 
		String name; 
		double salary; 
		double bonusPercentage;
		
		InputStreamReader reader = new InputStreamReader(System.in); BufferedReader inBuff = new BufferedReader(reader ); 
		try { 
		System.out.print("Enter your name: "); 
		name = inBuff.readLine(); 
		System.out.print("Enter your Salary: "); 
		String salaryStr = inBuff.readLine(); 
		salary = Double.parseDouble(salaryStr); 
		
		bonusPercentage = salary*0.05;

		System.out.println("Your name is "+name); 
		System.out.println("Your salary is "+salary); 
		
		System.out.println("Your bonus is "+bonusPercentage);
		
		} catch (IOException e) { 
		e.printStackTrace(); 
		} 
	} 

}
