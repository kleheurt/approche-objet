package listes;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nantes", 1000, Continent.EUROPE);
		Ville v2 = new Ville("Nantes", 1000, Continent.EUROPE);
		
		System.out.println(v1.equals(v2)); // doit afficher true
		
		v2.setHabitants(2000);
		System.out.println(v1.equals(v2)); // doit afficher false
		
		v1.setHabitants(2000);
		System.out.println(v1.equals(v2)); // doit afficher true
		
		v2.setNom("Bordeaux");
		System.out.println(v1.equals(v2)); // doit afficher false

		v1.setNom("Bordeaux");		
		System.out.println(v1 == v2); //affichera false
		
		v1 = v2;
		System.out.println(v1 == v2); //affichera true

	}

}
