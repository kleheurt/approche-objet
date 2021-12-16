package recensement.modeleTreeSet;

public class Region implements Comparable<Region>{
	
	private String nom;
	private int pop;
	
	public String getNom() {
		return nom;
	}
	public int getPop() {
		return pop;
	}
	public Region(String nom) {
		super();
		this.nom = nom;
		this.pop = 0;
	}
	
	public void raisePop(int val) {
		this.pop += val;
	}
	@Override
	public int compareTo(Region o) {
		return -1 * ((Integer) this.pop).compareTo(o.getPop());
	}
	
	@Override
	public String toString() {
		return this.nom+" | "+this.pop+" hab.\n";
	}
}
