package fr.diginamic.banque.entites;

public class Compte {
	
	private int numero;
	private int solde; //en centimes
	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	

}
