package maps;

import listes.Ville;
import java.util.*;

public class MapVilles {
	
	public static void ajouterVille(Map<String, Ville> map, Ville v) {
		map.put(v.getNom(), v);
	}

	public static void main(String[] args) {
		Map<String, Ville> map = new HashMap<>();
		ajouterVille(map, new Ville("Nice", 343000));
		ajouterVille(map, new Ville("Carcassonne", 47800));
		ajouterVille(map, new Ville("Narbonne", 53400));
		ajouterVille(map, new Ville("Lyon", 484000));
		ajouterVille(map, new Ville("Foix", 9700));
		ajouterVille(map, new Ville("Pau", 77200));
		ajouterVille(map, new Ville("Marseille", 850700));
		ajouterVille(map, new Ville("Tarbes", 40600));
		
		int minHab = Integer.MAX_VALUE;
		Ville plusPetite = null;
		for (Ville v : map.values()) {
			if(v.getHabitants() < minHab) {
				minHab = v.getHabitants();
				plusPetite = v;
			}
		}
		map.remove(plusPetite.getNom());
		
		System.out.println(map);
	}

}
