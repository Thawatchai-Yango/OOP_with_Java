
public class Car {
	public String Brand;
	public String yearsMfg;
	public static int speed;
	public static String model;
	public static String type;
	
	public  Car() {
		this.Brand = "BMW";
		this.yearsMfg = "1995";
		speed = 250;
		model = "fff";
		type = "supercar";
	}
	public void inputBrand(String Brand){
		this.Brand= Brand;
		System.out.println("Brand is "+Brand);	
	}
	public void inputyearsMfg(String yearsMfg){
		this.yearsMfg = yearsMfg;
		System.out.println("yearsMfg is "+yearsMfg);
		
	}
	static void inputspeed(int speed) {
		speed = speed*7;
		System.out.println("Speed is "+speed);
		
	}
	static void inputmodel(String model) {
		System.out.println("Model is "+model);
		
	}
	static void inputtype(String type) {
		System.out.println("Type is "+type);
	}
	

}
