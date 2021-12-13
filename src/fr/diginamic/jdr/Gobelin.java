package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {
	
	public Gobelin() {
		Random rand = new Random();
		this.force = rand.nextInt(5)+5;
		this.pdv = rand.nextInt(5)+10;
	}

}
