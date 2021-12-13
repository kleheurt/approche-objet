package entites;

public class Theatre {
	private String nom;
	private int capaMax;
	private int totalClients;
	private double recetteTotale;
	
	public void inscrire(int nb, double prix) {
		if(this.totalClients + nb <= capaMax) {
			this.totalClients += nb;
			recetteTotale += (nb * prix);
		}
		else {
			System.out.println(" >> Capacité dépassée ; inscription annulée !\n");
		}
	}
	
	public Theatre(String nom, int capaMax) {
		this.nom = nom;
		this.capaMax = capaMax;
	}
	
	public String toString() {
		return "*** Théâtre "+this.nom+" ***\n"
	    +"Capacité maximale : "+this.capaMax+"\n"
		+"Clients inscrits  : "+this.totalClients+"\n"
		+"Recette totale    : "+this.recetteTotale+"\n";
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapaMax() {
		return capaMax;
	}
	public void setCapaMax(int capaMax) {
		this.capaMax = capaMax;
	}
	public int getTotalCliens() {
		return totalClients;
	}
	public void setTotalCliens(int totalCliens) {
		this.totalClients = totalCliens;
	}
	public double getRecetteTotale() {
		return recetteTotale;
	}
	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	
	
	

}
