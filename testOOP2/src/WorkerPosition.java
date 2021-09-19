public class WorkerPosition {
	
	private double hour;
    private worker worker;
    private Position position;
	
    public WorkerPosition(worker worker, Position position, double hour) {
		this.setWorker(worker);
		this.setPosition(position);
		this.hour=hour;
		
	}
    public double getHour() {
    	return this.hour;
    }
    public double getEearnAmount() {
    	return this.hour*getPosition().getrate();
    }
	public worker getworker() {
		return worker;
	}
	public void setWorker(worker worker) {
		this.worker = worker;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

}