package fr.diginamic.jdr;

public abstract class Protagoniste {
	
	protected int force;
	protected int pdv;

	
	public int getForce() {
		return force;
	}
	public int getPdv() {
		return pdv;
	}
	
	public void infligerDegats(int degats) {
		this.pdv += degats;
	}
	
	public String toString() {
		return 
				"Force         = "+this.force+"\n"
				+"Points de vie = "+this.pdv+"\n";
	}

}
