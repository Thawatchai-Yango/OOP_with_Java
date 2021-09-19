public class Main {
	public static void main(String[] args) {
		Book ObjCon = new Book();
		System.out.println(ObjCon.BookName);
		System.out.println(ObjCon.Writer);
		System.out.println(ObjCon.Price);
		System.out.println(Book.Page);
		System.out.println(Book.Sale);
		System.out.println(Book.NumberOfBook);
		
		Book Obj1 = new Book();
		Obj1.inputBookName("Meme");
		Obj1.inputWriter("Nany");
		Obj1.inputPrice(125.0f);
		Book.inputPage(100);
		Book.inputSale("Yes");
		Book.inputNumberOfBook(3);
		
		Book Obj2 = new Book();
		Obj2.inputBookName("Momo");
		Obj2.inputWriter("Nuna");
		Obj2.inputPrice(110.0f);
		Book.inputPage(120);
		Book.inputSale("No");
		Book.inputNumberOfBook(0);
	}
}
/*OUTPUT
No Name
Unknown
0.0
0
Unknown
0.0

Book name is Meme
Writer name is Nany
Price of book is 125.0
Page is 100
Sale :  Yes
You have to pay 375.0

Book name is Momo
Writer name is Nuna
Price of book is 110.0
Page is 120
Sale :  No
You have to pay 0.0
*/
