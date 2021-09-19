public class Thai extends People{
	public Thai(String name) {
		super(name);
	}
	public String swatdee() {
		return "Swatdee";
	}
	@Override
	public String greeting() {
		return this.swatdee();
	}
}
