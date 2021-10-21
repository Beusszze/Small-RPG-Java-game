package fr.m2i;


/**
 * Classe abstraite permettant l'instanciation d'objets Combattant dans les classes filles
 * @author Beusszze
 *
 */

	public abstract class AbstractCombattant {
		
	// Attributs

	private String nom;
	private int pointsDeVie;
	private int degats;
	
	
	
	// Constructeurs 
	
	public AbstractCombattant () {
		super ();
	}
	
	public AbstractCombattant(String nom, int pointsDeVie, int degats) {
		super();
		this.nom = nom;
		this.pointsDeVie = pointsDeVie;
		this.degats = degats;
	}

	
			
	
	
	// Getters & setters
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}
	
	
	
	// toString
	


	@Override
	public String toString() {
		return "AbstractCombattant [nom=" + this.nom + ", pointsDeVie=" + this.pointsDeVie + ", degats=" + this.degats + "]"; 
	}
	
	

}
