
public class SingleLinkList {
	node newNode;
	node head;
	node curr;
	node prev;
	

	// ������ҧ�ԧ����ʵ�ҧ����
	public void add (String newItem) {
		if (head == null) {
			newNode = new node(newItem);
			
		} else {
			newNode = new node(newItem, head);
		}
		head = newNode;
		showdata();
	}
	// ��ä��Ң����ź��ԧ����ʵ�ҧ����
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
	
	// ���ź�˹���ԧ����ʵ�ҧ����
	public void deleteNode(String item) {
		// ��ҡ�����¡�����ʹ searchData ���ͤ��ҵ���˹觷���ͧ���ź
		if (searchData(item)==true) {
			//���ź�˹�������˹��á�ͧ�ԧ����ʵ�
			if (head == curr) {
				head = curr.getLink();
			} else if (curr.getLink() == null) {
				// ���ź�˹�������˹��ش���¢ͧ�ԧ����ʵ�
				prev.setLink(null);
			} else {
				// ���ź�˹�������������ҧ�˹���ԧ����ʵ�
				prev.setLink(curr.getLink());
			}
		}
	}
	// ����á�˹�����ԧ����ʵ�ҧ����
	public void insertNode(String iteminsert, String newItem) {
		// ��ҡ�����ҧ�˹�������з�ҡ���á
		newNode = new node(newItem);
		// ���¡���ʹ searchData ���ͤ��ҵ���˹觷���ͧ����á�˹�
		if (searchData(iteminsert)) {
			// ��ҡ���á�˹�������˹��á
			if (head == curr) {
				newNode.setLink(curr);
				head = newNode;
			}else if (curr.getLink()==null){
				//�á��ͷ��� �ó��������˹�
				curr.setLink(newNode);
			}else {
				// ��ҡ���á�˹���������ҧ�˹���ԧ����ʵ�
				newNode.setLink(curr);
				prev.setLink(newNode);
			}
		}
	}
	
	// ����ʴ���������ԧ����ʵ�ҧ����
	public void showdata() {
		curr = new node();
		prev = new node();
		curr = head;
		prev = null;
		while (curr != null) {
			// ����Ͷ֧�����˹��з�ҡ����ҹ��Ң����ŷ������˹����ʴ�
			System.out.print(curr.getItem() + "\t");
			prev = curr;
			curr = curr.getLink();
		}
	}
	
	
}
