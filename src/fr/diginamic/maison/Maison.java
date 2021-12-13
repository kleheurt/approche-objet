package fr.diginamic.maison;

public class Maison {
	
	private Piece[] tab;

	public Piece[] getTab() {
		return tab;
	}

	public void setTab(Piece[] tab) {
		this.tab = tab;
	}
	
	public Maison() {
		this.tab = new Piece[0];
	}
	
	public void ajouterPiece(Piece piece) {
		
		if(		   piece == null
				|| piece.getEtage() < 0
				|| piece.getSuperficie() < 0) return; //contrôle 
		
		int len = this.tab.length;
		Piece[] newTab = new Piece[len+1];
		for(int i = 0; i < len; i++) {
			newTab[i] = this.tab[i];
		}
		newTab[len] = piece;
		this.tab =  newTab;
	}
	
	public double superficieTotale() {
		double acc = 0;
		for(int i = 0; i < this.tab.length ; i++) {
			acc += this.tab[i].getSuperficie();
		}
		return acc;
	}
	
	public double superficieEtage(int etage) {
		if(etage < 0) return Double.NaN;
		
		double acc = 0;
		for(int i = 0; i < this.tab.length ; i++) {
			if(this.tab[i].getEtage() == etage) {
				acc += this.tab[i].getSuperficie();
			}
		}
		return acc;
	}
	
	public double superficieParPiece(String piece) {
		double acc = 0;
		for(int i = 0; i < this.tab.length; i++) {
			if(this.tab[i].getClass().getSimpleName().equals(piece)) {
				acc += this.tab[i].getSuperficie();
			}
		}
		return acc;
	}
	
	public int nbPiece(String piece) {
		int acc = 0;
		for(int i = 0; i < this.tab.length; i++) {
			if(this.tab[i].getClass().getSimpleName().equals(piece)) {
				acc += 1;
			}
		}
		return acc;
	}

}
