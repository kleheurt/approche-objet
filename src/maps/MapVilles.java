package maps;

import java.util.HashMap;
import java.util.Map;

import listes.Continent;
import listes.Ville;

public class MapVilles {
	
	public static void ajouterVille(Map<String, Ville> map, Ville v) {
		map.put(v.getNom(), v);
	}

	public static void main(String[] args) {
		Map<String, Ville> map = new HashMap<>();
		ajouterVille(map, new Ville("Nice", 343000, Continent.EUROPE));
		ajouterVille(map, new Ville("Carcassonne", 47800, Continent.EUROPE));
		ajouterVille(map, new Ville("Narbonne", 53400, Continent.EUROPE));
		ajouterVille(map, new Ville("Lyon", 484000, Continent.EUROPE));
		ajouterVille(map, new Ville("Foix", 9700, Continent.EUROPE));
		ajouterVille(map, new Ville("Pau", 77200, Continent.EUROPE));
		ajouterVille(map, new Ville("Marseille", 850700, Continent.EUROPE));
		ajouterVille(map, new Ville("Tarbes", 40600, Continent.EUROPE));
		
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
