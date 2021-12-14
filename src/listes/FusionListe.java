package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	
	public static void ajouter(List<String> l, List<String> l3) {
		for(int i = 0; i < l.size(); i++) {
			l3.add(l.get(i));
		}
		
	}
	
	public static String toString(List<String> l) {
		String s = "{ ";
		for(int i = 0; i < l.size(); i++) {
			s += l.get(i)+", ";
		}
		return s+" }";
	}

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		ajouter(liste1, liste3);
		ajouter(liste2, liste3);
		
		System.out.println(liste3.toString());

	}

}
