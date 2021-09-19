public class Fish extends Animal {
	public Fish(String name, double weight) {
		super(name,weight);
	}
	public void move() {
		System.out.println(super.name+" can swims.");	
	}
}
