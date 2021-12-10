package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale addr1 = new AdressePostale(1, "rue de la Paix", 75001, "Paris");
		AdressePostale addr2 = new AdressePostale(2, "Bd Malsherbes", 75002, "Paris");
		Personne p1 = new Personne("Dupond", "Tintin", addr1);
		Personne p2 = new Personne("Dupont", "Tintin", addr2);
	

	}

}
