
public class SingleLinkList {
	node newNode;
	node head;
	node curr;
	node prev;
	

	// การสร้างลิงค์ลิสต์ทางเดียว
	public void add (String newItem) {
		if (head == null) {
			newNode = new node(newItem);
			
		} else {
			newNode = new node(newItem, head);
		}
		head = newNode;
		showdata();
	}
	// การค้นหาข้อมูลบนลิงค์ลิสต์ทางเดียว
	public boolean searchData(String item) {
		curr = new node();
		prev = new node();
		curr = head;
		prev = null;
		while (curr != null) {
			if (curr.getItem().equalsIgnoreCase(item)) {
				return true;
			} else {
				prev = curr;
				curr = curr.getLink();
			}
		}
		return false;
	}
	
	// การลบโหนดในลิงค์ลิสต์ทางเดียว
	public void deleteNode(String item) {
		// ทําการเรียกใช้เมธอด searchData เพื่อค้นหาตําแหน่งที่ต้องการลบ
		if (searchData(item)==true) {
			//การลบโหนดที่ตําแหน่งแรกของลิงค์ลิสต์
			if (head == curr) {
				head = curr.getLink();
			} else if (curr.getLink() == null) {
				// การลบโหนดที่ตําแหน่งสุดท้ายของลิงค์ลิสต์
				prev.setLink(null);
			} else {
				// การลบโหนดที่อยู่ระหว่างโหนดในลิงค์ลิสต์
				prev.setLink(curr.getLink());
			}
		}
	}
	// การแทรกโหนดเข้าลิงค์ลิสต์ทางเดียว
	public void insertNode(String iteminsert, String newItem) {
		// ทําการสร้างโหนดใหม่ที่จะทําการแทรก
		newNode = new node(newItem);
		// เรียกเมธอด searchData เพื่อค้นหาตําแหน่งที่ต้องการแทรกโหนด
		if (searchData(iteminsert)) {
			// ทําการแทรกโหนดที่ตําแหน่งแรก
			if (head == curr) {
				newNode.setLink(curr);
				head = newNode;
			}else if (curr.getLink()==null){
				//แทรกต่อท้าย กรณีมีหลายโหนด
				curr.setLink(newNode);
			}else {
				// ทําการแทรกโหนดเข้าระหว่างโหนดในลิงค์ลิสต์
				newNode.setLink(curr);
				prev.setLink(newNode);
			}
		}
	}
	
	// การแสดงข้อมูลในลิงค์ลิสต์ทางเดียว
	public void showdata() {
		curr = new node();
		prev = new node();
		curr = head;
		prev = null;
		while (curr != null) {
			// เมื่อถึงแต่ละโหนดจะทําการอ่านค่าข้อมูลที่เก็บในโหนดมาแสดง
			System.out.print(curr.getItem() + "\t");
			prev = curr;
			curr = curr.getLink();
		}
	}
	
	
}
