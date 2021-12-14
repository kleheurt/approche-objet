package sets;

public class Pays {
	private String nom;
	private int habitants;
	private int pib;
	
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
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public Pays(String nom, int habitants, int pib) {
		super();
		this.nom = nom;
		this.habitants = habitants;
		this.pib = pib;
	}
	
	//approximation
	public int getPibTotal() {
		return (int)(this.habitants / 1000000) * this.pib;
	}
	
	
}
