public class FireArcher extends Archer {
	protected int numberOfFireArraw;
	
	@Override
	public void attractOpponent(Human Opponent) {
		Opponent.decreaseHealth(super.attackPower+numberOfArraw+numberOfFireArraw);
	}
	
	public void setNumberOfFireArray(int i) {
		this.numberOfFireArraw = i;
	}


}
