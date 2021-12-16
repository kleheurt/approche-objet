package recensement.modeleTreeSet;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private String dept;
	private String region;
	private int pop;
	
	public String getNom() {
		return nom;
	}
	public String getDept() {
		return dept;
	}
	public String getRegion() {
		return region;
	}
	public int getPop() {
		return pop;
	}
	
	
	public Ville(String nom, String dept, String region, int pop) {
		super();
		this.nom = nom;
		this.dept = dept;
		this.region = region;
		this.pop = pop;
	}
	
	@Override
	public int compareTo(Ville v) {
		int x = -1 * ((Integer)this.pop).compareTo(v.getPop());
		if(x != 0) return x;
		
		return this.nom.compareTo(v.getNom());
	}
	
	
	@Override
	public String toString() {
		return  "{ "+this.nom+" "+this.pop+" hab. }\n";
	}

	
	
}
