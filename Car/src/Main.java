
public class Main {

	public static void main(String[] args) {
		Car ObjConstructors = new Car();
		System.out.println(ObjConstructors.Brand);
		System.out.println(ObjConstructors.yearsMfg);
		
		System.out.println(Car.speed);
		System.out.println(Car.model);
		System.out.println(Car.type);
		
		
		Car Obj = new Car();
		Obj.inputBrand("Toyota");
		Obj.inputyearsMfg("1997");
		Car.inputspeed(200);
		Car.inputmodel("xxx");
		Car.inputtype("classic");
		System.out.println(" ");
		
		Car Obj1 = new Car();
		Obj1.inputBrand("Mimi");
		Obj1.inputyearsMfg("1980");
		Car.inputspeed(200);
		Car.inputmodel("xy");
		Car.inputtype("classic");
		
		
	}

}

/*OUTPUT
BMW
1995
250
fff
supercar
Brand is Toyota
yearsMfg is 1997
Speed is 1400
Model is xxx
Type is classic
 
Brand is Mimi
yearsMfg is 1980
Speed is 1400
Model is xy
Type is classic
*/