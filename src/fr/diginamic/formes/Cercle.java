package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

	public double calculerSurface() {
		return Math.PI * this.rayon * this.rayon;
	}

	public double calculerPerimetre() {
		return Math.PI * this.rayon * 2;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

}
