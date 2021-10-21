package fr.m2i;

public class Personnage {
	
	
	/**
	 * Classe regroupant les informations des personnages
	 * Un constructeur permet de créer le personnage de base avec un nombre de points de vie, de dégats qu'il inflige et son nom 
	 * Getters et setters associés afin de récupérer et de modifier les valeurs des attributs dans d'autres classes
	 */
	

	// Attributs 
	
	private int pointsDeVie;
	private int degats;
	private String nom;
	
	// Constructeurs
	
	
	public Personnage () {
		super ();
	}

	public Personnage(int pointsDeVie, int degats, String nom) {
		super();
		this.pointsDeVie = pointsDeVie;
		this.degats = degats;
		this.nom = nom;
	}


	
	// Getters et setters
	
	
	
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personnage [nom= " + this.nom + ", pointsDeVie=" + this.pointsDeVie + ", degats=" + this.degats + "]";
	}
	
	
	
	

}
