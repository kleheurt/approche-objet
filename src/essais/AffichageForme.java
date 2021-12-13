package essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme f) {
		System.out.println("Perimetre = "+f.calculerPerimetre());
		System.out.println("Surface = "+f.calculerSurface());
		System.out.println("\n");
	}

}
