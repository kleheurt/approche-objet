package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class Combat {
	
	private Personnage perso;
	private Creature opposant;
	private Scanner scan;
	private int compteur;
	
	public Combat(Personnage perso, int choix, Scanner scan) {
		super();
		this.compteur = 0;
		this.scan = scan;
		this.perso = perso;
		switch(choix) {
		case 0:
			this.opposant = new Loup();
			break;
		case 1:
			this.opposant = new Gobelin();
			break;
		case 2:
			this.opposant = new Troll();
			break;
	
		}
		System.out.println("\nVotre personnage :");
		System.out.println(this.perso.toString());
		System.out.println("\nVous jouez contre :");
		System.out.println(this.opposant.toString()+"\n");
	}
	
	
	public void tour(int numTour) {
		Random rand = new Random();
		int r1 = rand.nextInt(10)+1;
		int r2 = rand.nextInt(10)+1;
		r1 += this.perso.getForce();
		r2 += this.opposant.getForce();	
		int res = r1 - r2;
		
		if(res == 0) tour(numTour);
		else {
			System.out.println("\nTour n°"+numTour);
			if(numTour > 1) System.out.println("Appuyer sur entrée pour continuer...");
			scan.nextLine();
			System.out.println("Vous avez "+this.perso.getPdv()+" points de vie.");
			System.out.println("Votre force : "+r1);
			System.out.println("La force de votre adversaire : "+r2);
			if(res < 0) {
				this.perso.infligerDegats(res);
				System.out.println("Vous perdez ce combat !");
				System.out.println("Vous perdez "+(res * -1)+" points de vie.");
			}
			else {
				this.opposant.infligerDegats(res);
				System.out.println("Vous gagnez ce tour !");
			}
		}
	}
	
	public void attaquer() {
		if(this.perso.getPdv() <= 0) {
			System.out.println("\nVotre personnage est décédé. Il a obtenu le score de "
					+this.perso.getScore()
					+" points.");
			return;
		}
		else if(this.opposant.getPdv() <= 0) {
			this.perso.majScore(this.opposant.getClass().getSimpleName());
			System.out.println("\nVous avez gagné contre votre opposant ! Votre score est de "
					+this.perso.getScore()
					+" points.");
			return;
		}
		compteur++;
		tour(compteur);
		attaquer();
	}
	

}
