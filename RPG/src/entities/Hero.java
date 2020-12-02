package entities;

import java.util.ArrayList;
import java.util.Scanner;

import world.Shop;
import weapons.*;

public abstract class Hero extends Entity {
	
	protected Weapon weapon;
	ArrayList<Weapon> weapons;
	int mana;
	int manaCost;
	int manaMax;
	int level;
	int gold;
	int xp;
	
	public Hero(String name, int health, int mana, int manaCost, int manaMax, Weapon weapon) {
		super(name,health,new EntityPosition(0,11));
		this.mana = mana;
		this.manaCost = manaCost;
		this.manaMax = manaMax;
		this.weapon = weapon;
		this.level = 1;
		this.xp = 0;
		this.gold = 0;
		weapons = new ArrayList<Weapon>();
		weapons.add(weapon);
	}
	
	public abstract void castSpell(Entity e);
	
	public boolean isDead() {return dead;}
	
	public void useWeapon(Entity e) {e.getHit(weapon.getDmg());}
	
	public void addGold(int nb) {this.gold += nb;}
	
	public int getGold() { return this.gold; }
	
	public void useSpell(Entity e,int damage) {
		e.getHit(damage);
		mana -= manaCost;
	}
	
	public void resetHero() { health = hpMax;mana = manaMax;}
	
	public void moveHero() {
		Scanner scanner = new Scanner(System.in);
		String keyPressed = scanner.next();
		switch(keyPressed) {
			case "z": position.moveUp();break;
			case "s": position.moveDown();break;
			case "d": position.moveRight();break;
			case "q": position.moveLeft();break;
			default: break;
		}
	}
	
	public void changeWeapon() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Arme équipée : " + weapon + "\nSelectionnez une arme dans votre inventaire: ");
		for(int i=0; i < weapons.size(); i++) {
			System.out.println(( i+1 )+") "+ weapons.get(i));
		}
		int choice = scanner.nextInt();
		if ((choice -1) < weapons.size() && (choice -1) >= 0) {
			weapon=weapons.get(choice -1);
		}
		else {
			System.out.println("Arme inchangée!");
		}
	}
	
	public void buyWeapon(Shop shop) {
		
		shop.getShop();
		Weapon weapon = shop.choices();
		System.out.println("Golds actuels: " + this.gold);
		
		if (gold >= weapon.getPrice()) {
			gold-= weapon.getPrice();
			System.out.println("Vous avez acheté l'arme suivante : "+ weapon.getName());
			weapons.add(weapon);
		}
		else {
			System.out.println("Golds insuffisants! Il vous manque" + (this.gold - weapon.getPrice()) + " golds");
		}
	}
	
	
	public void XP(int xp) {
		this.xp += xp;
		
		if (this.xp >= 30 && level == 1) { levelUp(); }
		if (this.xp >= 70 && level == 2) { levelUp(); }
		if (this.xp >= 120 && level == 3) { levelUp(); }
		if (this.xp >= 190 && level == 4) { levelUp(); }
		if (this.xp >= 270 && level == 5) { levelUp(); }
		if (this.xp >= 320 && level == 6) { levelUp(); }
		if (this.xp >= 400 && level == 7) { levelUp(); }
	}
	
	public void levelUp() {
		level++;
		hpMax += 20;
		
		//Un Sorcier aura plus de Mana que les autres classes car celui-ci est basé sur ses sorts et non l'arme
		if(this.getClass().getSimpleName().equals("Wizard")) {
			mana += 20;
		} else {
			mana +=10;
		}
	}

	@Override
	public String toString() {
		return this.name + " | Vie: " + health + " | Niveau: "+ level + " | Gold: "+ gold +" | Arme équipée: "+ weapon.getName();
	}
	
}
