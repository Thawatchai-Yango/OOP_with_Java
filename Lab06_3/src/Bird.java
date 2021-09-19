public class Bird extends Animal {
	
	public Bird(String name, double weight) {
		super(name,weight);
	}
	public void move() {
		System.out.println(super.name+" can fly on the air.");
	}
	public void fly() {
	}
}
