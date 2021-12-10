package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String date;
	protected int montant;
	
	public Operation(String date, int montant) {
		this.date = date;
		this.montant = montant;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getMontant() {
		return montant;
	}
	
	public abstract String getType();

}
