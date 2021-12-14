package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {
		List<Ville> l = new ArrayList<>();
		l.add(new Ville("Nice", 343000));
		l.add(new Ville("Carcassonne", 47800));
		l.add(new Ville("Narbonne", 53400));
		l.add(new Ville("Lyon", 484000));
		l.add(new Ville("Foix", 9700));
		l.add(new Ville("Pau", 77200));
		l.add(new Ville("Marseille", 850700));
		l.add(new Ville("Tarbes", 40600));

		l.sort(null);
		System.out.println(l.get(l.size()-1).getNom()); //Ville la plus peuplée
		l.remove(0);									//retrait de la ville la moins peuplée
		System.out.println(l.get(0).getNom());			//nouvelle ville la moins peuplée
		
		for (Ville ville : l) {							//Mise en majuscules des grandes villes
			if(ville.getHabitants() > 100000) {
				ville.setNom(ville.getNom().toUpperCase());
				}
			}
		
		for (Ville ville : l) {
			System.out.print(ville.getNom()+" ");
		}
	}

}
