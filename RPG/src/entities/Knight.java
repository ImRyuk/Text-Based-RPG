package entities;

import weapons.Sword;

public class Knight extends Hero {
	
	//On attribut les stats par d�faut de la classe "Knight"
	public Knight(String name) {
		super(name, 180, 10, 5, 10, new Sword());
	}

	//On d�finit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous effectuez une frappe divine sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 6));
	}
}
