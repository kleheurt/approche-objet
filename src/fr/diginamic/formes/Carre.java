package fr.diginamic.formes;

public class Carre extends Rectangle {
	

	

	public Carre(double longueur) {
		super(longueur);
	}
	
	public double calculerSurface() {
		return longueur * longueur;
	}

	public double calculerPerimetre() {
		return 4*longueur;
	} 

}
