package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("longueur : "+chaine.length());
		System.out.println("Premier ; "+chaine.indexOf(';'));
		System.out.println("Une sous-chaîne :"+chaine.substring(5,10));
		String s = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom : "+ s );
		System.out.println("Nom en maj : "+s.toUpperCase());
		System.out.println("Nom en min : "+s.toLowerCase());
		
		System.out.println("\n");
		String[] split = chaine.split(";");
		for(int i = 0; i < split.length ; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("\n");
		double salaire = Double.parseDouble(split[2].replace(" ",""));
		Salarie s1 = new Salarie(split[0],split[1],salaire);
		System.out.println(s1.toString());
	}

}
