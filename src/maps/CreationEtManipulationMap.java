package maps;

import java.util.*;

public class CreationEtManipulationMap{

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		for (Integer i : mapVilles.keySet()) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n");
		
		for(String s : mapVilles.values()) {
			System.out.print(s+"  ");
		}
		
		System.out.println("\n"+mapVilles.size());

	}

}
