package fr.m2i;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe représentant le monde du jeu, elle n'a pas vocation à être instanciée
 * Contient les "factorys" du jeu, c'est à dire les méthodes permettant la
 * création des personnages et leur personnalisation
 * 
 * @author Beusszze
 *
 */

public class Monde {

	private static int compteurDePersonnages;
	private static int compteurDeMonstres;

	/**
	 * Methode appelant le constructeur de personnage Demande à l'utilisateur le nom
	 * de son personnage Affiche le nom, les points de vie ainsi que les dégâts du
	 * personnage
	 */

	public static Personnage personnageFactory() {

		System.out.print("Entrez le nom de votre personnage : ");
		Scanner scan = new Scanner(System.in);
		String scanNomPerso = scan.next();
		Personnage monPremierPersonnage = new Personnage(scanNomPerso, 100, 10);
		System.out.println(monPremierPersonnage.toString());
		compteurDePersonnages++;
		return monPremierPersonnage;

	} 

	/**
	 * Methode appelant le constructeur de monstre Demande à l'utilisateur le nom de
	 * son monstre Affiche le nom, les points de vie ainsi que les dégâts du m
	 */
	public static Monstre monstreFactory() {
		System.out.print("L'adversaire de " + personnageFactory().getNom() + " est : " + genererNom() + ".");
		Monstre monPremierMonstre = new Monstre(genererNom(), 100, 10);
		compteurDeMonstres++;
		return monPremierMonstre;
 
	}

	/**
	 * Méthode permettant de générer le nom d'un monstre
	 * Deux tableaux distincts, l'un pour le début l'autre pour la fin du nom
	 * Génération de deux chiffres aléatoires qui vont permettre de piocher à l'index aléatoire dans les tableaux
	 * Récupération de ces deux parties de noms et concaténation des deux en les séparants par un espace
	 * @return String : nom composé du monstre en une partie
	 */

	public static String genererNom() {
		String[] debutNom = { "chat", "chien", "lion", "aigle", "serpent", "dragon", "crocodile" };
		String[] finNom = { "de feu", "agressif", "monstrueux", "sans peine", "ensanglanté", "enragé"};
		Random rand = new Random(); 
		int nombreAleatoireUn = rand.nextInt(7);
		int nombreAleatoireDeux = rand.nextInt(6);
		String nomComplet = debutNom[nombreAleatoireUn] + " " + finNom[nombreAleatoireDeux];
		return nomComplet;
		
	}
	
	
	
	/**
	 * Méthode simulant un combat en tour par tour opposant un personnage et un monstre
	 * Retire à l'entité touchée un nombre de points de vie (pointsDeVie) équivalent à la force d'attaque de son ennemi (degats)
	 * Boucle tant que les deux combattants sont en vie 
	 * Quand l'un d'eux n'a plus de pointsDeVie, l'autre est déclaré vainqueur
	 * @param personnage 
	 * @param monstre
	 */
	
	public static void combat (Personnage personnage, Monstre monstre) {
		int compteurTour = 1;
		while (personnage.getPointsDeVie() > 0 && monstre.getPointsDeVie() > 0) {
			System.out.println("===== Tour n°" + compteurTour + " =====");
			System.out.println(monstre.getNom() + " attaque !");
			personnage.setPointsDeVie(personnage.getPointsDeVie() - monstre.getDegats());
			System.out.println("Outch, il reste " + personnage.getPointsDeVie() + " points de vie " + "à " 
			+ personnage.getNom() + " qui attaque à son tour!");
			monstre.setPointsDeVie(monstre.getPointsDeVie() - personnage.getDegats());
			System.out.println("Il reste " + monstre.getPointsDeVie() + " points de vie à " + monstre.getNom() + ".");
			compteurTour ++;
		}
		if (personnage.getPointsDeVie() <= 0 ) {
			System.out.println(monstre.getNom() + " a gagné en " + compteurTour + " tours, " + 
			"il lui restait " + monstre.getPointsDeVie() + " points de vies.");
		} else {
			System.out.println(personnage.getNom() + "a gagné en " + compteurTour + " tours, " + 
					"il lui restait " + personnage.getPointsDeVie() + " points de vies.");
		}
		
	}


	/**
	 * Méthode affichant les informations du monde
	 */

	public static void afficherInformations() {
		System.out.println("Il y a " + compteurDePersonnages + " personnages et " + compteurDeMonstres
				+ " monstres dans le monde.");

	}

}
