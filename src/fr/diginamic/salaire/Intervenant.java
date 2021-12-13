package fr.diginamic.salaire;

public abstract class Intervenant {

	protected String nom;
	protected String prenom;
	
	public abstract double getSalaire();
	
	public void afficherDonnees() {
		String s = this.nom+" "+this.prenom+"\n";
		s += "salaire : "+this.getSalaire()+"€\n";
		s += "statut : "+this.getClass().getSimpleName()+"\n";
		System.out.println(s);
	}

	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
}
