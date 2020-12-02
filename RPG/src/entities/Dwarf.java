package entities;

import weapons.Axe;

public class Dwarf extends Hero {
	
	//On attribut les stats par d�faut de la classe "Dwarf"
	public Dwarf(String name) {
		super(name, 140, 10, 5, 10, new Axe());
	}

	//On d�finit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous effectuez un �crasement sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 8));
	}

}
