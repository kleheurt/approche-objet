package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {
	
	private Scanner scan;
	private Combat combat;
	
	
	public  int getChoix() {
		System.out.println(" Quelle créature souhaitez-vous affronter ?\n"
				  +" (0) Un loup\n"
				  +" (1) Un gobelin\n"
				  +" (2) Un troll\n");
		int choix = scan.nextInt();
		if(choix == 0 || choix == 1 || choix == 2) return choix;
		else return getChoix();
		
	}
	
	public  int getContinuer() {
		System.out.println(" (0) Pour quitter\n"
				  +" (1) Pour continuer à jouer\n");
		int choix = scan.nextInt();
		if(choix == 0 || choix == 1) return choix;
		else return getContinuer();
	}
	
	public  Personnage generatePerso() {
		System.out.println("Création d'un nouveau personnage");
		System.out.println("Entrez un pseudo : ");
		String pseudo = "";
		while(pseudo.length() == 0) pseudo = scan.nextLine();
		return new Personnage(pseudo);
	}
	
	public  void viePersonnage( Personnage perso) {
		if(perso == null) {
			perso = generatePerso();
		}
		else {
			if(getContinuer() == 0) return;
			if(perso.getPdv() <= 0) perso = generatePerso();
		}
		
		int choix = getChoix();
		combat = new Combat(perso,choix,scan);
		System.out.println("C'est parti !");
		combat.attaquer();
		int continuer = getContinuer();
		if(continuer == 0) return;
		else viePersonnage(perso);
	}
	
	public void jouer() {
		System.out.println(" *** Jouez contre des créatures ***");
		viePersonnage(null);
		scan.close();
		System.out.println("*** Fin du jeu. ***");
	}

	public Jeu() {
		this.scan = new Scanner(System.in);

	}

}
