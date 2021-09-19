import java.text.DecimalFormat;

public class DocumentRunning {
	public static int runningNo = 0;
	public static String prefix;
	public static double vatRate;
	public static String DocNo() {
		runningNo++;
		DecimalFormat d = new DecimalFormat("INV0000");
		return d.format(runningNo);
	}
}
