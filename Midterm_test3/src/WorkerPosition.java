
public class WorkerPosition {
	private double hour;
	
	private Worker worker;
	private Position position;
	
	public WorkerPosition(Worker worker, Position position,double hour) {
		this.hour = hour;
		this.worker = worker;
		this.position = position;
	}

	public double getHour() {
		return this.hour;
	}
	
	public double getEarnAmount() {
		return this.hour*position.getRate();
	}
	
	
	public Worker getWorker() {
		return this.worker;
	}
	public Position getPosition() {
		return this.position;
	}
}
