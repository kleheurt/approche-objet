package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {
	
	public Loup() {
		Random rand = new Random();
		this.force = rand.nextInt(5)+3;
		this.pdv = rand.nextInt(5)+5;
	}
}
