package world;

import java.util.Scanner;

import weapons.*;

public class Shop {
	
	public static Weapon[] weapons = {new BigSword(),new BigAxe(), new ExtensiveBow()};
	
	public void getShop() {
		for (int i=0; i < weapons.length; i++) {
			System.out.println((i + 1) + " - Nom : " + weapons[i].getName() + " - Dégats : " + weapons[i].getDmg() + " - Prix : " + weapons[i].getPrice());
		}
	}
	
	public Weapon choices() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sélectionnez l'arme voulue");
		int i = scanner.nextInt();
		while(i < 1 || i > weapons.length)
		{
			System.out.println("Saisie inconnue");
			i = scanner.nextInt();
		}
		return weapons[i-1];
	}
}
