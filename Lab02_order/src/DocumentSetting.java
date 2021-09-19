public class DocumentSetting {
	static int runningNo = 1;
	static double vatRate = 0.07;
	
	DocumentSetting(){}
	public static int GetRunningNo() {
		return runningNo++;
	}
	public static void setRate(double newRate) {
		vatRate = newRate;
	}
	

	public static void main(String[] args) {
		System.out.println(GetRunningNo());

	}

}