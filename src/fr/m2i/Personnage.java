package fr.m2i;

public class Personnage extends AbstractCombattant{
	
	
	/**
	 * Classe regroupant les informations des personnages
	 * Un constructeur permet de créer le personnage de base avec un nombre de points de vie, de dégats qu'il inflige et son nom 
	 * Getters et setters associés afin de récupérer et de modifier les valeurs des attributs dans d'autres classes
	 */
	

	// Attributs identiques à la classe parent
	
	
	// Constructeurs
	
	
	public Personnage () {
		super ();
	}

	public Personnage(String nom, int pointsDeVie, int degats) {
		super(nom, pointsDeVie, degats);
	}

 
	
	
	
	
	

}
