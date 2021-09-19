public class Human {
	protected String name;
	protected double health = 100.0;
	protected long experience = 0;
	protected int attackPower = 1;
	
	public Human(){
	}
	public void decreaseHealth(double h){
	this.health = this.health-h;
	}
	public void attractOpponent( Human Opponent){
	double attrackPower = 0;
	Opponent.decreaseHealth(attrackPower);
	}
	public double getHealth() {
		return this.health;
	}
}
