import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Invoice {
	private String date;
	private int status;
	private double vatRate;
	private String DocNo;
	private List<ItemLine> Line = new ArrayList<ItemLine>();
	private Customer customer;
	private Address add;
	public Invoice() {
		LocalDate date = LocalDate.now();
		this.date = date.toString();
		this.status = 0;
		this.vatRate = 0;
		this.DocNo = DocumentRunning.DocNo();
		this.customer = new Customer();
		this.add = new Address();
	}
	public void setVatRate(double vat) {
		DocumentRunning.vatRate = vat;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setAddress(Address address) {
		this.add = address;
	}
	public double getTotal() {
		double total=0;
		for(int i=0;i<Line.size();i++) {
			total += Line.get(i).getSubtotal();
		}
		return total;
	}
	public void addNewLine(Product product,int qty) {
		Line.add(new ItemLine(product,qty));
	}
	public void print() {
		System.out.printf("\t\t\tNo. %s\n",this.DocNo);
		System.out.println("\t\t\tDate:"+this.date);
		System.out.println("Customer:  "+customer.getName()+" Tel."+customer.getTelephone());
		System.out.println("Address:");
		System.out.println("\t"+this.add.getAddress());
		System.out.println("===============================================");
		System.out.println("ID\tProduct Name\tQty.\tprice\tAmount");
		System.out.println("===============================================");
		for(int i=0;i<Line.size();i++) {
			System.out.println(Line.get(i).getLineString());
		}
		System.out.println("===============================================");
		System.out.printf("\t\tSubtotal\t%,.2f\n",this.getTotal());
		double vat = this.getTotal()*DocumentRunning.vatRate/100;
		System.out.printf("\t\tVat\t\t%,.2f\n",vat);
		double total = this.getTotal()+vat;
		System.out.printf("\t\tTotal\t\t%,.2f\n\n",total);
	}
}
