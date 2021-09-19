public class WorkerPosition {
	private double hour;
	private Worker worker;
	private Position position;
	
	public WorkerPosition(Worker worker, Position position, double hour) {
		this.worker = worker;
		this.position = position;
		this.hour = hour;
	}
	
	public double getHour()
	{
		return this.hour;
	}
	
	public Worker getWorker() {
		return this.worker;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public double getEearnAmount() {
		return this.hour*position.getRate();
	}
}
