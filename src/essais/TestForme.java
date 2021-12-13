package essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		Cercle ce = new Cercle(10);
		Rectangle r = new Rectangle(10);
		r.setLargeur(5);
		Carre ca = new Carre(10);
		AffichageForme.afficher(ce);
		AffichageForme.afficher(r);
		AffichageForme.afficher(ca);
		
	}

}
