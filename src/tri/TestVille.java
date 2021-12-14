package tri;

import java.util.ArrayList;
import java.util.List;

public class TestVille {
	
	public static String affichage(List<Ville> l) {
		String s = "{ ";
		for (Ville ville : l) {
			s += ville.getNom()+" ";
		}
		return s+"}\n";
	}

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
		System.out.println(affichage(l));
		
		l.sort(new ComparatorNom());
		System.out.println(affichage(l));
		
		l.sort(new ComparatorHabitant());
		System.out.println(affichage(l));


	}

}
