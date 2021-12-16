package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import recensement.modeleObjet.Pays;
import recensement.modeleTreeSet.TraitementVilles;

public class ComparaisonModeles {
	
	public static void essai10Dept(TraitementRecensement modeleO, TraitementRecensement modeleT) {
		System.out.println("Afficher les 10 départements les plus peuplés :");
		
		long dO = System.currentTimeMillis();
		modeleO.afficher10Departements();
		long fO =  System.currentTimeMillis();
		
		long dT = System.currentTimeMillis();
		modeleT.afficher10Departements();
		long fT =  System.currentTimeMillis();
		
		fO -= dO;
		fT -= dT;
		
		System.out.println("Temps de traitement du modèle Objet : "+fO+"ms");
		System.out.println("Temps de traitement du modèle TreeSet : "+fT+"ms");
	}
	
	public static void essaiPopNantes(TraitementRecensement modeleO, TraitementRecensement modeleT) {
		System.out.println("Afficher la population d'une ville donnée (en l'occurrence Nantes) :");
		
		long dO = System.currentTimeMillis();
		modeleO.selectPopVille("Nantes");
		long fO =  System.currentTimeMillis();
		
		long dT = System.currentTimeMillis();
		modeleT.selectPopVille("Nantes");
		long fT =  System.currentTimeMillis();
		
		fO -= dO;
		fT -= dT;
		
		System.out.println("Temps de traitement du modèle Objet : "+fO+"ms");
		System.out.println("Temps de traitement du modèle TreeSet : "+fT+"ms");
	}
	
	public static void essai10VillesPdL(TraitementRecensement modeleO, TraitementRecensement modeleT) {
		System.out.println("Afficher les 10 villes les plus peuplées d'une région (en l'occurrence Pays de la Loire) :");
		
		long dO = System.currentTimeMillis();
		modeleO.afficher10VillesRegion("Pays de la Loire");
		long fO =  System.currentTimeMillis();
		
		long dT = System.currentTimeMillis();
		modeleT.afficher10VillesRegion("Pays de la Loire");
		long fT =  System.currentTimeMillis();
		
		fO -= dO;
		fT -= dT;
		
		System.out.println("Temps de traitement du modèle Objet : "+fO+"ms");
		System.out.println("Temps de traitement du modèle TreeSet : "+fT+"ms");
	}
	
	public static void essai10VillesFrance(TraitementRecensement modeleO, TraitementRecensement modeleT){
		System.out.println("Afficher les 10 villes les plus peuplées de France :");
		
		long dO = System.currentTimeMillis();
		modeleO.afficher10VillesFrance();
		long fO =  System.currentTimeMillis();
		
		long dT = System.currentTimeMillis();
		modeleT.afficher10VillesFrance();
		long fT =  System.currentTimeMillis();
		
		fO -= dO;
		fT -= dT;
		
		System.out.println("Temps de traitement du modèle Objet : "+fO+"ms");
		System.out.println("Temps de traitement du modèle TreeSet : "+fT+"ms");
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
		
		TraitementRecensement modeleO = new Pays("FRANCE", lines);
		TraitementRecensement modeleT = new TraitementVilles(lines);
		
		essai10Dept(modeleO,modeleT);
		System.out.println("\n");
		essaiPopNantes(modeleO, modeleT);
		System.out.println("\n");
		essai10VillesPdL(modeleO, modeleT);
		System.out.println("\n");
		essai10VillesFrance(modeleO, modeleT);
	}

}
