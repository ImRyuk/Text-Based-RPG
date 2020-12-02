package entities;

public abstract class Monster extends Entity {
	int damage;
	int goldGiven;
	int expGiven;
	
	public Monster(EntityPosition pos, String name,int health, int damage, int goldGiven, int expGiven) {
		super(name, health, pos);
		this.damage = damage;
		this.goldGiven = goldGiven;
		this.expGiven = expGiven;
	}
	
	public String toString() {
		return "Monstre: " + name + "\nDégats: " + damage + "\nVie Actuelle " + health;
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public void attackPlayer(Entity entity) {
		entity.getHit(damage);
	}
	
	public void getLooted(Hero hero) {
		hero.XP(expGiven);
		hero.addGold(goldGiven);
	}
	
}
