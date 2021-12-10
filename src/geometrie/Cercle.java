package geometrie;

public class Cercle implements ObjetGeometrique{
	
	private double rayon;

	public double perimetre() {
		return 2 * Math.PI * this.rayon;
	}

	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
