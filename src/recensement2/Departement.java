package recensement2;

public class Departement implements Comparable<Departement>{

	private String nom;
	private int pop;
	
	@Override
	public int compareTo(Departement o) {
		return -1 * ((Integer)this.pop).compareTo(o.getPop());
	}
	public String getNom() {
		return nom;
	}
	public int getPop() {
		return pop;
	}
	public Departement(String nom) {
		super();
		this.nom = nom;
		this.pop = 0;
	}
	
	public void raisePop(int val) {
		this.pop += val;
	}
	
	@Override
	public String toString() {
		return "Département "+this.nom+" | "+this.pop+" hab.\n";
	}
}
