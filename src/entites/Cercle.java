package entites;


public class Cercle {
	
	private double rayon;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return 2 * Math.PI * rayon;
	}
	
	public double getSurface() {
		return Math.PI * rayon * rayon;
	}

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
		
	}
	
	
}
