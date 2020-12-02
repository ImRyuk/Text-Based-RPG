package weapons;

public abstract class Weapon {
	
	protected String name;
	protected int damage;
	protected int price;
	
	public Weapon (String name, int damage, int price) {
		this.name = name;
		this.damage = damage;
		this.price = price;
	}
	
	public String toString() {
		return this.name + "\nDégats: " + this.damage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDmg() {
		return this.damage;
	}
	
	public int getPrice() {
		return this.price;
	}

}
