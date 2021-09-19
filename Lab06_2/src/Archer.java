public class Archer extends Human {
	protected int numberOfArraw;
	@Override
	public void attractOpponent(Human Opponent) {
		Opponent.decreaseHealth( super.attackPower+numberOfArraw);
	}

	public void setNumberOfArraw(int i) {
		this.numberOfArraw = i;
	}
	@Override
	public double getHealth() {
		return super.health;
	}

}
