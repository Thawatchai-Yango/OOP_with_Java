
public class BookItem {
	
	private String code;
	private int copyNo;
	private int status;
	public BookItem(String code, int copyNo) {
		this.code = code;
		this.copyNo = copyNo;
		this.status = status;
	}
	public String getCode() {
		return this.code;
		
	}
	public int getcopyNo() {
		return this.copyNo;
		
	}
	public void setStatus(int status ) {
		System.out.println(status);
	}
	
}
