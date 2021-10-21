package fr.m2i;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
			
		
	}
	/**
	 * Methode appelant le constructeur de personnage 
	 * Demande à l'utilisateur le nom de son personnage
	 * Affiche le nom, les points de vie ainsi que les dégâts du personnage
	 */
	
	public static void personnageFactory() {
		
		System.out.print("Entrez le nom de votre personnange : ");
		Scanner scan = new Scanner (System.in);
		String scanNomPerso = scan.next();
		Personnage monPremierPersonnage = new Personnage(100, 10, scanNomPerso);
		System.out.println(monPremierPersonnage.toString());
		
		}


}
