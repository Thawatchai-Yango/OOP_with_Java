public class MyMouse implements MouseEvents{
	@Override
	public String click() {
		return "Click you";
	};
	@Override
	public String press() {
		return "Press you";
	};
	@Override
	public String doubleClick() {
		return "Double click you"; 
	};
}
