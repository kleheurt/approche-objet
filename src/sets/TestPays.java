package sets;

import java.util.*;

public class TestPays {

	public static void main(String[] args) {
		
		Set<Pays> hs = new HashSet<>();
		hs.add(new Pays("USA",332915000,62606));
		hs.add(new Pays("France",65426000,42878));
		hs.add(new Pays("Allemagne",83900000,48264));
		hs.add(new Pays("UK",68207000,42558));
		hs.add(new Pays("Italie",60367000,34260));
		hs.add(new Pays("Japon",126051000,39306));
		hs.add(new Pays("Chine",1444246000,9608));
		hs.add(new Pays("Russie",145912000,11327));
		hs.add(new Pays("Inde",1393409000,2306));

		//plus grand pib / hab
		Pays plusGrand = null;
		int val =0;
		Iterator<Pays> it = hs.iterator();
		while(it.hasNext()) {
			Pays tmp = it.next();
			int x = tmp.getPib();
			if(x > val) {
				val = x;
				plusGrand = tmp;
			}
		}
		System.out.println(plusGrand.getNom());
		
		
		//plus grand pib total 
		plusGrand = null;
		val =0;
		it = hs.iterator();
		while(it.hasNext()) {
			Pays tmp = it.next();
			int x = tmp.getPibTotal();
			if(x > val) {
				val = x;
				plusGrand = tmp;
			}
		}
		System.out.println(plusGrand.getNom());
		
		//plus petit pib total
		Pays plusPetit = null;
		val = plusGrand.getPibTotal();
		it = hs.iterator();
		while(it.hasNext()) {
			Pays tmp = it.next();
			int x = tmp.getPibTotal();
			if(x < val) {
				val = x;
				plusPetit = tmp;
			}
		}
		//nom en majuscules
		plusPetit.setNom(plusPetit.getNom().toUpperCase());		
		for (Pays pays : hs) {
			System.out.print(pays.getNom()+" ");
		}
		
		//suppression
		System.out.print("\n");
		hs.remove(plusPetit);
		for (Pays pays : hs) {
			System.out.print(pays.getNom()+" ");
		}
	}

}
