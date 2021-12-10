package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		AdressePostale addr1 = new AdressePostale();
		AdressePostale addr2 = new AdressePostale();

		p1.setAdresse(addr1);
		p2.setAdresse(addr2);
		
		p1.setNom("Dupond");
		p2.setNom("Dupont");

		p1.setPrenom("Tintin");
		p2.setPrenom("Milou");


	}

}
