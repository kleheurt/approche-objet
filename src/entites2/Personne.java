package entites2;

import entites.AdressePostale;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale addresse;
	
	
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
		return addresse;
	}
	public void setAdresse(AdressePostale addresse) {
		this.addresse = addresse;
	}
	

}
