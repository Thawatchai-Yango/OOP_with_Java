public class Main {
	public static void main(String[] args) {
		Archer r = new Archer();
		FireArcher f = new FireArcher();

		r.setNumberOfArraw(10);
		r.decreaseHealth(2);
		r.setNumberOfArraw(3);
		f.setNumberOfFireArray(1);
		f.attractOpponent(r);

		System.out.println(" Health score of r ="+ r.getHealth());
		System.out.println(" Health score of f ="+ f.getHealth());

	}

}
