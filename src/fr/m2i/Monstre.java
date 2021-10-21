package fr.m2i;

public class Monstre extends AbstractCombattant{
	
	/** 
	 * Classe Monstre héritant de la classe AbstractCombattant
	 * Un monstre possède les mêmes attributs qu'un personnage (points de vie, dégats, nom)
	 */
	
	
	
	public Monstre () { // Constructeur vide
		super ();
	}

	public Monstre(String nom, int pointsDeVie, int degats) {
		super(nom, pointsDeVie, degats);
	} 

	
	

}
