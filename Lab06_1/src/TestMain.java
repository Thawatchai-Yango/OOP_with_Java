public class TestMain {
	public static void main(String[] args) {
		Child cObj = new Child();
		cObj.setA(5);    
		//วิธีแก้ให้เรียก setter ในคลาส  Base ผ่าน คลาส Child
		cObj.printInBase();
		//วิธีแก้ให้เอา protected จาก method printInBase ออก
		cObj.b=7;
		cObj.c=8;
		cObj.d =10;
		System.out.println(cObj.getB());//ปริ้นค่า b
		cObj.printInBase();
		//ทดสอบว่า ทุกค่าที่ป้อนเข้าไปจะได้รับค่าเข้าไปในคลาส Base หรือไม่
	}
}
