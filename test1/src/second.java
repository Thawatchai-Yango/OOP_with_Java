public class second {	
	public static void main(String[] args) {
		Main Object = new Main();
		Object.setX(40);
		System.out.println("the value x" +Object.getX()+ "test" +Object.getX()+ "test2");
		
		 
		third Object3rd = new third();
		System.out.println(Object3rd.y);
		
		int sum = Object.getX() + Object3rd.y;
		System.out.println(sum);
		
		third Object3 = new third();
		Object3.second3();
		
		//third.second3();
		
		//Main OBmain =new Main();
		//OBmain.main2();
		
		third.second2();
		Main.main2();
		
		third OBadd =new third();
		OBadd.AddNumber(5, 8, 8);
		
		
		
	}
}
