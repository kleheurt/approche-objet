package fr.diginamic.jdr;

import java.util.Random;


public class Personnage extends Protagoniste {
	
	private int score;
	private String pseudo;

	public int getScore() {
		return score;
	}
	
	public void majScore(String opposant) {
		switch(opposant) {
		case "Loup":
			this.score += 1;
			System.out.println("Votre score augmente de 1 point");
			break;
		case "Gobelin":
			this.score += 2;
			System.out.println("Votre score augmente de 2 point");
			break;
		case "Troll":
			this.score += 5;
			System.out.println("Votre score augmente de 5 point");
			break;
		}
	}

	public Personnage(String pseudo) {
		super();
		this.pseudo = pseudo;
		this.score = 0;
		Random rand = new Random();
		this.force = rand.nextInt(6)+12;
		this.pdv = rand.nextInt(30)+20;
	}
	
	public String toString() {
		return  "--- "+this.pseudo+" ---\n"
				+super.toString()
				+"Score         = "+this.score+"\n";
		
	}

}
