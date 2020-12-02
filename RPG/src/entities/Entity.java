package entities;

abstract public class Entity{

	public String name;
	int health;
	int hpMax;
	public EntityPosition position;
	boolean dead;
	
	public Entity(String name, int health, EntityPosition position) {
		this.name = name;
		this.health = health;
		this.hpMax = health;
		this.position = position;
		this.dead = false;
	}
	
	public void getHit(int damage) {
		health -= damage;
		if (health <= 0) {
			dead = true;
			System.out.println( name + " subit " + damage + " de dégats et tombe à 0 HP ... C'est la mort!");
		}
		else {
			System.out.println(name + " subit " + damage + " de dégats\nVie restante : " + health);
		}
	}
	
	
}
