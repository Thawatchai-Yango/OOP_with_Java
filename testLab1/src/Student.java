
public class Student {
	private String id;
	private String name;
	
	public Student() {
	}
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setId(String Id) {
		this.id = Id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return  name;
	}
}
