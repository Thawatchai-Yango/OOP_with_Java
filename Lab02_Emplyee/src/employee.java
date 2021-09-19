import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
// Import java.io ตามที่ต้อองการใช้ในโปรแกรม

public class employee { //ประกาศ คลาส 
	public static void main(String[] args) {
		String emp_id; //ประกาศตัวแปรตามชนิดข้อมูล
		String name;
		double salary;
		double bonusPercentage;
		
		InputStreamReader reader = new
				InputStreamReader(System.in);
		BufferedReader inBuff = new BufferedReader(reader );
			try {
				System.out.print("Enter your id: ");
				emp_id = inBuff.readLine(); //รับค่าไอดี ของพนักงาน
				
				System.out.print("Enter your name: ");
				name = inBuff.readLine(); //รับค่าชื่อของพนักงาน
				
				System.out.print("Enter your Salary: ");
				String salaryStr = inBuff.readLine(); //รับเงินเดือนของพนักกงาน
				salary = Double.parseDouble(salaryStr); //เปลี่ยน เป็นค่าที่ต้องการ
				System.out.print("\n");
				System.out.println("Id : "+emp_id); //แสดง ไอดี พนักงาน
				System.out.println("Name: "+name); //แสดงชื่อของพนักงาน
				System.out.println("Salary: "+salary); //เแสดงเงินเดือนของพนักงาน
				
				//ขั้นตอน การคำนวนโบนัส ของพนักงานตาม เพดานของเงินเดือน โดยใช้ IF ELSE
				if (salary > 0 && salary <= 50000)
				{
					bonusPercentage = salary*0.05;
					System.out.println("Bonus: "+bonusPercentage);
				}
				else if (salary > 50000 && salary <= 100000)
				{
					bonusPercentage = salary*(0.07);
					System.out.println("Bonus: "+bonusPercentage);
				}
				else if (salary > 50000 && salary <= 100000)
				{
					bonusPercentage = salary*(0.07);
					System.out.println("Bonus: "+bonusPercentage);
				}
				else if (salary > 100000)
				{
					bonusPercentage = salary*(0.10);
					System.out.println("Bonus: "+bonusPercentage);
				}
				else
				{
					System.out.println("Bonus: 0.0");
				}
			
				} catch (IOException e) {
				e.printStackTrace();
			}
        }
}