
public class Main {

	public static void main(String[] args) {
		BookShop b1= new BookShop("Order01","Mus","11-01-2021");
		BookShop b2= new BookShop("Order02","Zoll","14-01-2021");
		BookShop b3= new BookShop("Order03","Moll","16-01-2021");
		BookDetail Bd1= new BookDetail("B01","NameBook1","Writer1");
		BookDetail Bd2= new BookDetail("B02","NameBook2","Writer2");
		BookDetail Bd3= new BookDetail("B03","NameBook3","Writer3");
		BookDetail Bd4= new BookDetail("B04","NameBook4","Writer4");
		BookPriceRate BP1= new BookPriceRate("Type1","Horror   ",500.00);
		BookPriceRate BP2= new BookPriceRate("Type2","Adventure",600.00);
		BookPriceRate BP3= new BookPriceRate("Type3","Funny    ",400.00);
		BookPriceRate BP4= new BookPriceRate("Type4","thriller ",700.00);
		b1.addOrder(Bd1, BP1, 10.0);
		b1.addOrder(Bd2, BP2, 5.0);
		b1.addOrder(Bd3, BP3, 6.0);
		b1.addOrder(Bd4, BP4, 7.0);
		
		b2.addOrder(Bd4, BP2, 9.0);
		b2.addOrder(Bd3, BP3, 11.0);
		b2.addOrder(Bd2, BP4, 12.0);
		
		b3.addOrder(Bd1, BP3, 4.0);
		b3.addOrder(Bd2, BP4, 5.0);
		b1.print();
		b2.print();
		b3.print();

	}

}
