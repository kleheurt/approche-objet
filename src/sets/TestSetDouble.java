package sets;

import java.util.*;

public class TestSetDouble {

	public static void main(String[] args) {
		Double[] arr = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		Set<Double> hs = new HashSet<>(Arrays.asList(arr));
		System.out.println(hs);
		
		//affichage du plus grand nombre
		Iterator<Double> it = hs.iterator();
		Double dmax = it.next();
		while(it.hasNext()) {
			Double dtmp = it.next();
			if(dmax < dtmp) dmax = dtmp;
		}
		System.out.println(dmax);
		
		//suppression du plus petit nombre et affichage
		it = hs.iterator();
		Double dmin = it.next();
		while(it.hasNext()) {
			Double dtmp = it.next();
			if(dmin >dtmp) dmin = dtmp;
		}
		hs.remove(dmin);
		System.out.println(hs);
	}

}
