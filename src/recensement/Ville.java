package recensement;

public class Ville implements Comparable<Ville>, Collectivite {
	
	private String nom;
	private int pop; 


	public Ville( String ville, int pop) {
		super();

		this.nom = ville;
		this.pop = pop;
	}



	@Override
	public String getNom() {
		return nom;
	}


	@Override
	public int getPop() {
		return pop;
	}


	@Override
	public int compareTo(Ville v) {
		int x = ((Integer)this.pop).compareTo(v.getPop());
		if(x != 0) return x;
		
		return this.nom.compareTo(v.getNom());
	}
	
	@Override
	public String toString() {
		return  "{ "+this.nom+" "+this.pop+" hab. }\n";
	}

}
