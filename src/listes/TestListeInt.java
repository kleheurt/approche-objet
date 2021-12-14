package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {
		
		Integer[] arr = {-1, 5, 7, 3, -2, 4, 8, 5};
		List<Integer> l = Arrays.asList(arr);
		l = new ArrayList<Integer>(l);
		
		System.out.println(l);					//tous �l�ments
		System.out.println(l.size());			//taille
		
		l.sort(null);
		System.out.println(l.get(0));			//plus petit �l�ment
		System.out.println(l.get(l.size()-1));	//plus grand �l�ment
		
		l.remove(0); 			
		System.out.println(l);					//moins le plus petit �l�ment
		
		l.replaceAll(x -> Math.abs(x));
		System.out.println(l);					//les �l�ments n�gatifs rendus positifs
	}

}
