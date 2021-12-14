package sets;

import java.util.*;

public class TestSetString{
	
	public static void main (String[] args) {
		String[] s = {"France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
		Set<String> hs = new HashSet<>(Arrays.asList(s));
		System.out.println(hs);
		
		String plusGrand = "";
		int longueur =0;
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			int x = tmp.toCharArray().length;
			if(x > longueur) {
				longueur = x;
				plusGrand = tmp;
			}
		}
		hs.remove(plusGrand);
		System.out.println(hs);
	}
}