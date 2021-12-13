package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double salaire;
	
	@Override
	public double getSalaire() {
		return this.salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public Salarie(String nom, String prenom) {
		super(nom, prenom);
	}

}
