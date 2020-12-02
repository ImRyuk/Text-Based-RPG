package entities;

import weapons.Bow;

public class Elf extends Hero {
	
	//On attribut les stats par défaut de la classe "Elf"
	public Elf(String name) {
		super(name, 100, 15, 5, 15, new Bow());
	}

	//On définit le sort de la classe 
	@Override
	public void castSpell(Entity e) {
		System.out.println("Vous lancez une ruée de flèches sur "+ e.getClass().getSimpleName());
		useSpell(e,(level * 10));
	}
}
