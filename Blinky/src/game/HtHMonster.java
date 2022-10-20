package game;

public class HtHMonster {   // Le monstre attaquant au corps à corps (Hand to Hand)
	
	private int health;
	
	public HtHMonster() {
		health=30;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int Attack() {
		return 10;
	}

}
