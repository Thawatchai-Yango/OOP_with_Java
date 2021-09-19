public class Main {

	public static void main(String[] args) {
		Customer c1 = new CompanyCustomer("ABC Software","444444",50000.00);
		Customer c2 = new PersonalCustomer("John","0651234");
		Address ad1 = new Address("13/21 Srichan road","Khon Kaen","Thailand","40000");
		Address ad2 = new Address("Faculty of science","Khon Kaen","Thailand","40002");
		Invoice inv = new Invoice();
		Invoice inv2 = new Invoice();
		inv.setVatRate(7.0); //7%
		inv.setCustomer(c1);
		inv.setAddress(ad1);
		inv2.setVatRate(7.0);
		inv2.setAddress(ad2);
		inv2.setCustomer(c2);
		Product p1 = new Product("C01","Intel Core i7",9000.0);
		Product p2 = new Product("S01" ,"250 GB SSD",2500.0);
		Product p3 = new Product("M02", "Mouse wireless",200.0);
		Product p4 = new Product("M01", "USB Mouse",100.0);
		inv.addNewLine(p1,1);
		inv.addNewLine(p3,3);
		inv.addNewLine(p4,4);
		inv.print();
		inv2.addNewLine(p1,1);
		inv2.addNewLine(p2,2);
		inv2.addNewLine(p3,2);
		inv2.print();
	}

	
	
	
	
	
	
}
