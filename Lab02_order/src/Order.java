import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
	
	String DocNo;
	String docDate;
	double amount;
	String Note;
	Order(){
		DecimalFormat decimalFormat = new DecimalFormat("Order_00000");
		this.DocNo=decimalFormat.format(DocumentSetting.GetRunningNo());//1
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		this.docDate = formatter.format(LocalDateTime.now());///12-*feb-2014
		this.amount = 0.0; //25000
		this.Note = "";//Purchase Tables
	}
	
	public void setAmount(double amount) { //25000
		this.amount = amount;  //25,000
	}
	
	public void setNote(String note) {
		this.Note = note;//Purchase Tables
	}
	public String getDocNo() { // 1
		return this.DocNo;//1
	}
	public String getDateStr() {// +
		return this.docDate;
	}
	public double getAmount() {
		return this.amount;
	}
	public double getVat() {
		return DocumentSetting.vatRate*this.amount; //0.07*25000
	}
	public double getTotal() {
		return this.amount+(DocumentSetting.vatRate*this.amount);//25000+vat
	}
	
	public static void main(String[] args) {
		Order order1= new Order();
		order1.setAmount(25000.00);
		order1.setNote("Purchase computers");
		
		Order order2= new Order();
		order2.setAmount(10000.00);
		order2.setNote("Purchase Tables");
		
		Order order3= new Order();
		order3.setAmount(42000.00);
		order3.setNote("Macbook");
		
		System.out.println("Doc no:"+order1.getDocNo());// oreder_00001
		System.out.println("Note:"+order1.Note);// oreder_00001
		System.out.println("Date :"+order1.getDateStr());//14-feb-2021
		System.out.println("Amount :"+order1.getAmount());//25000
		System.out.println("Vat :"+order1.getVat());//vat
		System.out.println("Total :"+order1.getTotal());//amount +vat
		
		System.out.println("Doc no:"+order2.getDocNo());
		System.out.println("Note:"+order2.Note);
		System.out.println("Date :"+order2.getDateStr());
		System.out.println("Amount :"+order2.getAmount());
		System.out.println("Vat :"+order2.getVat());
		System.out.println("Total :"+order2.getTotal());
		
		System.out.println("Doc no:"+order3.getDocNo());
		System.out.println("Note:"+order3.Note);
		System.out.println("Date :"+order3.getDateStr());
		System.out.println("Amount :"+order3.getAmount());
		System.out.println("Vat :"+order3.getVat());
		System.out.println("Total :"+order3.getTotal());


	}

}
