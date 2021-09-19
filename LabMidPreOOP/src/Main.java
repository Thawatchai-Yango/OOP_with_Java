public class Main {
	public static void main(String[] args) {
		Project p1= new Project("P01","NPK-Project");
		Project p2= new Project("P02","KK-Project");
		Worker w1= new Worker("w01","John");
		Worker w2= new Worker("w02","Frank");
		Worker w3= new Worker("w03","Sumon");
		Position po1= new Position("o1","Programmer",300.00);
		Position po2= new Position("o2","Engineer",400.00);
		Position po3= new Position("o3","Officer",200.00);
		p1.addMember(w1, po1, 10.0);
		p1.addMember(w2, po2, 5.0);
		p1.addMember(w3, po3, 7.0);
		p2.addMember(w1, po2, 4);
		p2.addMember(w2, po2, 3);
		p1.print();
		p2.print();
	}
	
}
