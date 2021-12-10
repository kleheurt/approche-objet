package entites2;

import entites.AdressePostale;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressePostale addresse) {
		this.adresse = addresse;
	}
	

}
