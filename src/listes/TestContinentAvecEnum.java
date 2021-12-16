package listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

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
		
		l.add(new Ville("New York", 999999, Continent.AMERIQUE));
		l.add(new Ville("Tokyo", 999999, Continent.ASIE));
		
		for (Ville ville : l) {
			System.out.println(ville);
		}

	}

}
