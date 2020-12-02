package entities;

import weapons.Axe;

public class Dwarf extends Hero {
	
	//On attribut les stats par défaut de la classe "Dwarf"
	public Dwarf(String name) {
		super(name, 140, 10, 5, 10, new Axe());
	}

	//On définit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous effectuez un écrasement sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 8));
	}

}
