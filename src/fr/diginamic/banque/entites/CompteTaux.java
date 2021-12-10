package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private int taux;

	public CompteTaux(int numero, int solde, int taux) {
		super(numero, solde);
		this.setTaux(taux);
	}

	public int getTaux() {
		return taux;
	}

	public void setTaux(int taux) {
		this.taux = taux;
	}
	
	public String toString() {
		return super.toString()+"\nTaux : "+this.taux+"%";
		
	}

}
