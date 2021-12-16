package recensement2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import recensement.Pays;
import recensement.TraitementRecensement;

public class AppliRecensement2 {
	
	private static String afficherOptions() {
		return " *** Recensement France ****\n"
			  +" (1) Afficher la population d'une ville\n"
			  +" (2) Afficher la population d'un d�partement\n"
			  +" (3) Afficher la population d'une r�gion\n"
			  +" (4) Afficher les dix r�gions les plus peupl�es\n"
			  +" (5) Afficher les 10 d�partements les plus peupl�s\n"
			  +" (6) Afficher les 10 villes les plus peupl�es d�un d�partement\n"
			  +" (7) Afficher les 10 villes les plus peupl�es d�une r�gion\n"
			  +" (8) Afficher les 10 villes les plus peupl�es de France\n"
			  +" (9) Sortir\n";
	}
	
	private static void menu(Scanner scan, TraitementRecensement fr) {
		System.out.println(afficherOptions());
		int choix = scan.nextInt();
		scan.nextLine();
		String s = "";
		switch(choix) {
		case 9 : 
			return;
		case 1 :
			s = scan.nextLine();
			System.out.println(fr.selectPopVille(s));
			break;
		case 2:
			s = scan.nextLine();
			System.out.println(fr.selectPopDepartement(s));
			break;
		case 3:
			s = scan.nextLine();
			System.out.println(fr.selectPopRegion(s));
			break;
		case 4:
			System.out.println(fr.afficher10Regions());
			break;
		case 5:
			System.out.println(fr.afficher10Departements());
			break;
		case 6:
			s = scan.nextLine();
			System.out.println(fr.afficher10VillesDept(s));
			break;
		case 7:
			s = scan.nextLine();
			break;
		case 8:
			System.out.println(fr.afficher10VillesFrance());
			break;
		default:
			menu(scan,fr);
		}
		menuIntermediaire(scan, fr);
	}
	
	private static void menuIntermediaire(Scanner scan, TraitementRecensement fr) {
		System.out.println("\n------------------------------------\n"
				+ " (0) Retour au menu\n"
				+ " (1) Quitter\n");
		int choix = scan.nextInt();
		if(choix == 0) 
			menu(scan,fr);
		else if(choix == 1) 
			return;
		else 
			menuIntermediaire(scan,fr);
	}
	
	public static TraitementRecensement choixModele(Scanner scan, List<String> lines) {
		System.out.println(" Choix du mod�le de traitement :\n"
				+" (0) mod�le \"Objet\"\n"
				+" (1) mod�le \"TreeSet\"\n");
		int choix = scan.nextInt();
		if(choix == 0)
			return new Pays("FRANCE", lines);
		else if(choix == 1)
			return new TraitementVilles(lines);
		else
			return choixModele(scan, lines);
	}

	public static void main(String[] args) {
		
		//lecture du fichier
		Path path = Paths.get("C:\\Temp\\recensement.csv");
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		// Initialisation du scanner et boucle r�cursive
		Scanner scan = new Scanner(System.in);
		TraitementRecensement fr = choixModele(scan,lines);
		menu(scan,fr);
		scan.close();
		
	}

}
