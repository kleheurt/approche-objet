package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> l = new ArrayList<>();
		l.add(new Ville("Nice", 343000, Continent.EUROPE));
		l.add(new Ville("Carcassonne", 47800, Continent.EUROPE));
		l.add(new Ville("Narbonne", 53400, Continent.EUROPE));
		l.add(new Ville("Lyon", 484000, Continent.EUROPE));
		l.add(new Ville("Foix", 9700, Continent.EUROPE));
		l.add(new Ville("Pau", 77200, Continent.EUROPE));
		l.add(new Ville("Marseille", 850700, Continent.EUROPE));
		l.add(new Ville("Tarbes", 40600, Continent.EUROPE));

		l.sort(null);
		System.out.println(l.get(l.size()-1).getNom()); //Ville la plus peupl�e
		l.remove(0);									//retrait de la ville la moins peupl�e
		System.out.println(l.get(0).getNom());			//nouvelle ville la moins peupl�e
		
		for (Ville ville : l) {							//Mise en majuscules des grandes villes
			if(ville.getHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
				}
			}
		
		for (Ville ville : l) {
			System.out.print(ville.getNom()+" ");
		}
		System.out.print("\n");
		for (Ville ville : l) {
			System.out.println(ville);
		}
	}

}
