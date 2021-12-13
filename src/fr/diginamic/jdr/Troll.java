package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

	public Troll () {
		Random rand = new Random();
		this.force = rand.nextInt(5)+10;
		this.pdv = rand.nextInt(10)+20;
	}
}
