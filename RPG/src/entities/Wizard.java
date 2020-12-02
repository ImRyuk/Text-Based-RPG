package entities;

import weapons.Potato;

public class Wizard extends Hero {
	
	//On attribut les stats par défaut de la classe "Wizard"
	public Wizard(String name) {
		super(name, 75, 40, 5, 40, new Potato());
	}

	//On définit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous lancez un éclair sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 16));
	}
}
