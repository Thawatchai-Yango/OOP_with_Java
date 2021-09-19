public class Main {

	public static void main(String[] args) {
		People p1= new Thai("Somchai");
		People p2 = new English("John");
		Translator t= new Translator();
		t.add(p1);
		t.add(p2);
		t.greetingToAll();

	}

}
