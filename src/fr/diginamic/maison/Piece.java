package fr.diginamic.maison;

public abstract class Piece {
	
	protected double superficie;
	protected int etage;
	
	
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()
				+"\nsuperificie : "+this.superficie
				+"\nétage : "+this.etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

}
