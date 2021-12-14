package listes;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int habitants;
	
	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
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
	public int compareTo(Ville v) {
		return ((Integer)this.habitants).compareTo(v.getHabitants());
	}
	


}
