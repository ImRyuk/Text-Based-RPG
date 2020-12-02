package world;

import java.util.ArrayList;

import entities.*;

public class Map {
	
	int dimension;
	ArrayList<EntityPosition> positions;
	ArrayList<Entity> entities;

	public Map(int dimension) {
		this.dimension = dimension;
		this.positions = new ArrayList<EntityPosition>();
		this.entities = new ArrayList<Entity>();
	}
	
	public void addEntity(Entity entity) {
		entities.add(entity);
		positions.add(entity.position);
	}

	public void getMap() {
		System.out.println("==========================");
		for (int i = 0; i < dimension; i++) {
			System.out.print("|");
			for (int j = 0; j < dimension*2; j++) {
				System.out.print(renderEntity(j, i));
			}
			System.out.println("|");
		}
		System.out.println("==========================");
		System.out.println("Commandes (lettres minuscules) : Haut = z - Bas = s - Gauche = g - Droite = d");
		System.out.println("Changer d'arme : 3 ");
		System.out.println("Index : Hero = H - Smaug = B - Spider = S - Skeleton = X - Rat = R - Loubard = N - Market = M");
	}

	String renderEntity(int x, int y) {
		
		//Rendering Shop
		if(x == 23 && y == 11) {return "M"; }
		
		for (int i = 0; i < positions.size(); i++) {
			EntityPosition position = positions.get(i);
			Entity entity = entities.get(i);
			
			//Rendering Entities
			if (position.x == x && position.y == y) {
				if(entity.getClass().getSimpleName().equals("Wizard") || entity.getClass().getSimpleName().equals("Knight") || entity.getClass().getSimpleName().equals("Elf") || entity.getClass().getSimpleName().equals("Dwarf")) {
					return "H";
				}
				if(entity.getClass().getSimpleName().equals("Spider")) { return "S"; }
				if(entity.getClass().getSimpleName().equals("Skeleton")) {return "X";	}
				if(entity.getClass().getSimpleName().equals("Rat")) {return "R"; }
				if(entity.getClass().getSimpleName().equals("Loubard")) {return "N"; }
				if(entity.getClass().getSimpleName().equals("Smaug")) {return "B"; }
			}
		}
		return " ";
	}

}
