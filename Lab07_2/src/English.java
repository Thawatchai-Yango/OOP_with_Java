public class English extends People{
	public English(String name) {
		super(name);
	}
	public String hello() {
		return "Hello";
	}
	@Override
	public String greeting() {
		return this.hello();
	}
}
