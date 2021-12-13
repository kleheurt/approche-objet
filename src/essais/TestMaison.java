package essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		Maison m = new Maison();
		
		Chambre ch1 = new Chambre(15,1);
		Cuisine cu = new Cuisine(20,0);
		Salon sa = new Salon(30,0);
		Chambre ch2 = new Chambre(10,1);
		SalleDeBain sdb = new SalleDeBain(15,1);
		Wc wc = new Wc(5,1);
		
		Chambre absurde = new Chambre(-150,-1);
		
		m.ajouterPiece(ch1);
		m.ajouterPiece(ch2);
		m.ajouterPiece(cu);
		m.ajouterPiece(sa);
		m.ajouterPiece(sdb);
		m.ajouterPiece(wc);

		System.out.println(m.superficieEtage(1));
		System.out.println(m.superficieTotale());
		
		m.ajouterPiece(null);		
		System.out.println(m.superficieEtage(1));
		System.out.println(m.superficieTotale());
		
		m.ajouterPiece(absurde);		
		System.out.println(m.superficieEtage(-1));
		System.out.println(m.superficieTotale());
		
		System.out.println(m.superficieParPiece("Chambre"));
		System.out.println(m.nbPiece("Chambre"));
		System.out.println(m.nbPiece("SalleDeBain"));

	}

}
