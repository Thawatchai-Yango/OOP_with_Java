public class Main {

	public static void main(String[] args) {
		Toy t1 = new CarToy();
		Toy t2 = new TrainToy();
		ToyController.play(t1);
		ToyController.play(t2);
	}

}
