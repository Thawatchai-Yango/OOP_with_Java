public class CompanyCustomer extends Customer{
	private double creditLimit;
	private String creditDescription;
	public CompanyCustomer(String name,String telephone,double creditLimit) {
		super(name,telephone);
		this.creditLimit = creditLimit;
	}
	@Override
	public double getDiscount() {
		return super.getDiscount();
	}
	public double getCreditLimit() {
		return this.creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
}
