package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import world.*;

public class main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Shop shop = new Shop();
		Map map = new Map(12);
		ArrayList<Monster> monsters = generateMonsters(map);
		
		Hero hero = createHero();
		map.addEntity(hero);
		
		//On affiche le jeu tant que le boss final est en vie ou que le joueur l'est
		while (!hero.isDead() && !monsters.get(monsters.size() - 1).isDead()) {

			System.out.println(hero);
			map.getMap();hero.moveHero();hero.changeWeapon();
			
			System.out.println("\n\n");
			System.out.println("\nGolds actuels: " + hero.getGold());
			for (int i = 0; i < monsters.size(); i++) {
				if ((hero.position.x == monsters.get(i).position.x) && (hero.position.y == monsters.get(i).position.y)) {
					fight(hero, monsters.get(i));
				}
			}
			if (hero.position.x == 23 && hero.position.y == 11) { hero.buyWeapon(shop); }
		}
		if(hero.isDead()) { System.out.println("Partie terminée! Vous avez été vaincu..."); }
		if(monsters.get(monsters.size() - 1).isDead()) { System.out.println("Vous avez vaincu Smaug le puissant! Félicitations!"); }

	}

	private static void fight(Hero hero, Monster monster) {
		int lap = 1;
		System.out.println("Vous engagez un combat contre " + monster.name);
		while (!hero.isDead() && !monster.isDead()) {
			if (lap % 2 == 1) {
				System.out.println("\nQue souhaitez-vous faire?");
				System.out.println("1.Attaquer | 2.Lancer un sort | 3.Changer d'arme ");
				int choice = scanner.nextInt();
				while (choice < 1 || choice > 3) {
					System.out.println("Saisie invalide!.");
					choice = scanner.nextInt();
				}
				switch (choice) {
				case 1:
					hero.useWeapon(monster);
					break;
				case 2:
					hero.castSpell(monster);
					break;
				case 3:
					hero.changeWeapon();
					break;
				}
				lap++;
			} else if (lap % 2 == 0) {
				System.out.println();
				System.out.println(monster.getClass().getSimpleName() + " vous attaque.");
				monster.attackPlayer(hero);
				System.out.println();
				lap++;
			}
		}
		//Si le héro gagne, il récupère le loot du monstre et sa vie ainsi que son mana est rétablit
		if (monster.isDead()) {
			monster.getLooted(hero);
			hero.resetHero();
			monster.position.dead();
		}
	}

	private static Hero createHero() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenue héro! Quel est votre nom?");
		String name = scanner.nextLine();
		System.out.println("Enchanté " + name + "\nChoississez votre rôle parmis la liste suivante : ");
		System.out.println("1. Wizard: Vie: 75 | Arme principale: Potato | Mana: 40 | Dégats du sort: 16 | Cout en Mana: 5");
		System.out.println("2. Knight: Vie: 180 | Arme principale: Sword | Mana: 10 | Dégats du sort: 6 | Cout en Mana: 5");
		System.out.println("3. Elf: Vie: 100 | Arme principale: Bow | Mana: 15 | Dégats du sort: 10 | Cout en Mana: 5");
		System.out.println("4. Dwarf: Vie: 140 | Arme principale: Axe | Mana: 10 | Dégats du sort: 8 | Cout en Mana: 5");
		
		int choix = scanner.nextInt();
		while(choix!=1 && choix !=2 && choix!=3 && choix !=4) {
			System.out.println("Veuillez saisir un choix valide!");
			choix = scanner.nextInt();
		}
		System.out.println("Votre but est de monter en niveau en terassant les nombreux ennemis présents sur la carte, une fois que vous serez prêt il vous faudra faire face à l'affreux Dragon Smaug, qui règne sur ces terres...");
		System.out.println("Bonne chance " + name + "!\nPour lancer la partie, appuyez sur une touche...");
		scanner.next();
		switch (choix) {
		case 1:
			return new Wizard(name);
		case 2:
			return new Knight(name);
		case 3:
			return new Elf(name);
		case 4:
			return new Dwarf(name);
		default:
			return new Knight(name);
		}
	}

	static ArrayList<Monster> generateMonsters(Map map) {
		
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		
		//Adding all the Loubards monsters
		Loubard lb1 = new Loubard(new EntityPosition(22, 0));Loubard lb2 = new Loubard(new EntityPosition(22, 1));
		Loubard lb3 = new Loubard(new EntityPosition(23, 1));Loubard lb4 = new Loubard(new EntityPosition(20, 0));
		Loubard lb5 = new Loubard(new EntityPosition(20, 1));Loubard lb6 = new Loubard(new EntityPosition(20, 2));
		Loubard lb7 = new Loubard(new EntityPosition(21, 2));Loubard lb8 = new Loubard(new EntityPosition(22, 2));
		Loubard lb9 = new Loubard(new EntityPosition(23, 2));
		map.addEntity(lb1);monsters.add(lb1);map.addEntity(lb2);monsters.add(lb2);map.addEntity(lb3);monsters.add(lb3);
		map.addEntity(lb4);monsters.add(lb4);map.addEntity(lb5);monsters.add(lb5);map.addEntity(lb6);monsters.add(lb6);
		map.addEntity(lb7);monsters.add(lb7);map.addEntity(lb8);monsters.add(lb8);map.addEntity(lb9);monsters.add(lb9);
		
		//Adding all the skeletons monsters
		Skeleton sk1 = new Skeleton(new EntityPosition(2, 1));Skeleton sk2 = new Skeleton(new EntityPosition(12,3 ));
		Skeleton sk3 = new Skeleton(new EntityPosition(2, 7));Skeleton sk4 = new Skeleton(new EntityPosition(10, 4));
		Skeleton sk5 = new Skeleton(new EntityPosition(6, 7));Skeleton sk6 = new Skeleton(new EntityPosition(18, 9));
		Skeleton sk7 = new Skeleton(new EntityPosition(8, 8));Skeleton sk8 = new Skeleton(new EntityPosition(17, 9));
		Skeleton sk9 = new Skeleton(new EntityPosition(19, 11));Skeleton sk10 = new Skeleton(new EntityPosition(7, 10));
		map.addEntity(sk1);monsters.add(sk1);map.addEntity(sk2);monsters.add(sk2);map.addEntity(sk3);monsters.add(sk3);
		map.addEntity(sk4);monsters.add(sk4);map.addEntity(sk5);monsters.add(sk5);map.addEntity(sk6);monsters.add(sk6);
		map.addEntity(sk7);monsters.add(sk7);map.addEntity(sk8);monsters.add(sk8);map.addEntity(sk9);monsters.add(sk9);
		map.addEntity(sk10);monsters.add(sk10);
		
		//Adding all the Rats monsters
		Rat rat1 = new Rat(new EntityPosition(0, 10));Rat rat2 = new Rat(new EntityPosition(1,10 ));
		Rat rat3 = new Rat(new EntityPosition(1, 11));Rat rat4 = new Rat(new EntityPosition(14, 11));
		Rat rat5 = new Rat(new EntityPosition(17, 11));Rat rat6 = new Rat(new EntityPosition(18, 9));
		Rat rat7 = new Rat(new EntityPosition(12, 6));Rat rat8 = new Rat(new EntityPosition(14, 9));
		Rat rat9 = new Rat(new EntityPosition(15, 8));Rat rat10 = new Rat(new EntityPosition(19, 6));
		Rat rat11 = new Rat(new EntityPosition(20, 4));
		map.addEntity(rat1);monsters.add(rat1);map.addEntity(rat2);monsters.add(rat2);map.addEntity(rat3);monsters.add(rat3);
		map.addEntity(rat4);monsters.add(rat4);map.addEntity(rat5);monsters.add(rat5);map.addEntity(rat6);monsters.add(rat6);
		map.addEntity(rat7);monsters.add(rat7);map.addEntity(rat8);monsters.add(rat8);map.addEntity(rat9);monsters.add(rat9);
		map.addEntity(rat10);monsters.add(rat10);map.addEntity(rat11);monsters.add(rat11);
		
		//Adding all the Spiders monsters
		Spider sp1 = new Spider(new EntityPosition(5, 0));Spider sp2 = new Spider(new EntityPosition(3, 5));
		Spider sp3 = new Spider(new EntityPosition(4, 1));Spider sp4 = new Spider(new EntityPosition(2, 5));
		Spider sp5 = new Spider(new EntityPosition(4, 2));Spider sp6 = new Spider(new EntityPosition(8, 7));
		Spider sp7 = new Spider(new EntityPosition(9, 3));Spider sp8 = new Spider(new EntityPosition(12, 7));
		Spider sp9 = new Spider(new EntityPosition(14, 3));Spider sp10 = new Spider(new EntityPosition(14, 9));
		Spider sp11 = new Spider(new EntityPosition(17, 3)); Spider sp12 = new Spider(new EntityPosition(15, 11));
		map.addEntity(sp1);monsters.add(sp1);map.addEntity(sp2);monsters.add(sp2);map.addEntity(sp3);monsters.add(sp3);
		map.addEntity(sp4);monsters.add(sp4);map.addEntity(sp5);monsters.add(sp5);map.addEntity(sp6);monsters.add(sp6);
		map.addEntity(sp7);monsters.add(sp7);map.addEntity(sp8);monsters.add(sp8);map.addEntity(sp9);monsters.add(sp9);
		map.addEntity(sp10);monsters.add(sp10);map.addEntity(sp11);monsters.add(sp11);map.addEntity(sp12);monsters.add(sp12);
		
		//Adding Final Boss
		Smaug boss = new Smaug(new EntityPosition(23, 0));
		map.addEntity(boss);monsters.add(boss);
		
		return monsters;
	}

}
