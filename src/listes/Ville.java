package listes;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int habitants;
	private Continent continent;
	
	public Ville(String nom, int habitants, Continent continent) {
		super();
		this.nom = nom;
		this.habitants = habitants;
		this.continent = continent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHabitants() {
		return habitants;
	}
	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}
	
	@Override
	// Ne concerne pas le TP Tri
	// Comparaison mise en place pour trier les villes dans le TP 10 (et non le TP 13)
	public int compareTo(Ville v) {
		return ((Integer)this.habitants).compareTo(v.getHabitants());
	}
	
	public boolean equals(Ville v) {
		return this.nom.equals(v.getNom()) && ((Integer) this.habitants).equals(v.getHabitants());
	}
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return this.nom+" ("+this.continent.getLibelle()+") : "+this.habitants+" hab.";
	}


}
