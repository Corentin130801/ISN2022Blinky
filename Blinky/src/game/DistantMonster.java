package game;

public class DistantMonster {  // Le monstre qui tire à distance
	
	private int health;
	
	public DistantMonster() {
		health=50;
	}
	

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int Attack() {
		return 40;
	}
}
