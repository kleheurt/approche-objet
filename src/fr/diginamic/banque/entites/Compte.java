package fr.diginamic.banque.entites;

public class Compte {
	
	private int numero;
	private int solde; //en centimes
	
	public Compte(int numero, int solde) {
		this.numero = numero;
		this.solde = solde;
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
	
	//en euros
	public String toString() {
		return "Compte n° : "+this.numero+"\nSolde : "+((double)this.solde/100)+"€";
	}

}
