package fr.m2i;

import java.util.Scanner;


/** 
 * Classe représentant le monde du jeu, elle n'a pas vocation à être instanciée 
 * Contient les "factorys" du jeu, c'est à dire les méthodes permettant la création des personnages et leur personnalisation
 * @author Beusszze
 *
 */

public class Monde {

	
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
