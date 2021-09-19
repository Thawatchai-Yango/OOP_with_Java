public class Dog extends Animal {
	public Dog(String name, double weight) {
			super(name,weight);
	}
	@Override
	public void move() {
		System.out.println(super.name+" can walk and run.");
	}
	public void walk() {
	}
	public void run() {
	}
}
