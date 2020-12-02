package entities;

import weapons.Potato;

public class Wizard extends Hero {
	
	//On attribut les stats par d�faut de la classe "Wizard"
	public Wizard(String name) {
		super(name, 75, 40, 5, 40, new Potato());
	}

	//On d�finit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous lancez un �clair sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 16));
	}
}
