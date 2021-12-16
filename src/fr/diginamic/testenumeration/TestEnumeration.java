package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) throws Exception {
		
		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			System.out.println(saison.getLibelle());
		}
		
		String nom = "ETE";
		Saison s1 = Saison.valueOf(nom);
		System.out.println(s1.getLibelle());
		
		String libelle = "Hiver";
		Saison s2 = Saison.getSaison(libelle);
		System.out.println(s2.equals(Saison.HIVER));
		
		
	}
}
