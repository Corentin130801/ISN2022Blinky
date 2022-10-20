package game;

public class GhostMonster {
	
	private int health;
	
	public GhostMonster() {
		health=35;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int Attack() {
		return 25;
	}

}
