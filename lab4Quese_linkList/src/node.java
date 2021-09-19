
public class node {
	private String item;
	private node link;
	// constructors
	// head node
	node() {
		link = null;
	}
	// last node
	node(String newItem) {
		item = newItem;
		link = null;
	}
	
	node(String newItem, node nextNode) {
		item = newItem;
		link = nextNode;
	}
	
	//method
	public void setItem(String newItem) {
		item = newItem;
	}
	
	public String getItem() {
		return item;
	}
	
	public void setLink(node nextNode) {
		link = nextNode;
	}
	public node getLink() {
		return link;
	}
}
