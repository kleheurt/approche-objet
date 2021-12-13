package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double largeur;
	protected double longueur;
	
	
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public Rectangle(double longueur) {
		super();
		this.largeur = Double.NaN;
		this.longueur = longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double calculerSurface() {
		return longueur * largeur;
	}

	public double calculerPerimetre() {
		return 2*longueur + 2*largeur;
	}

}
