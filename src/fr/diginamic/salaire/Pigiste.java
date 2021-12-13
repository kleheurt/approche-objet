package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	private int jours;
	private double montant;
	
	@Override
	public double getSalaire() {
		return jours * montant;
	}

	public int getJours() {
		return jours;
	}

	public void setJours(int jours) {
		this.jours = jours;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
	}

}
