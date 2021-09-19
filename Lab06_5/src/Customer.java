public class Customer {
	private String name;
	private String telephone;
	Customer(){}
	
	public Customer(String name,String telephone) {
		this.name = name;
		this.telephone = telephone;
	}
	public double getDiscount() {
		return 0;
	}
	public String getTelephone() {
		return this.telephone;
	}
	public String getName() {
		return this.name;
	}
}
