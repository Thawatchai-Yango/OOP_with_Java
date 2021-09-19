public class Address {
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String postCode;
	public Address() {}
	public Address(String addressLine1,String addressLine2,String addressLine3,String postCode) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.postCode = postCode;
	}
	public String getAddress() {
		
		return this.addressLine1+","+this.addressLine2+","+this.addressLine3+","+this.postCode;
	}
	public String getAddressLine1() {
		return this.addressLine1;
	}
	public String getAddressLine2() {
		return this.addressLine2;
	}
	public String getAddressLine3() {
		return this.addressLine3;
	}
}
