package fr.diginamic.jdr;

public abstract class Creature extends Protagoniste{
	
	public String toString() {
		return "--- "+this.getClass().getSimpleName()+" ---\n"+super.toString();
	}

}
