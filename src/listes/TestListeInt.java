package listes;

import java.util.*;

public class TestListeInt {

	public static void main(String[] args) {
		
		Integer[] arr = {-1, 5, 7, 3, -2, 4, 8, 5};
		List<Integer> l = Arrays.asList(arr);
		l = new ArrayList<Integer>(l);
		
		System.out.println(l);					//tous éléments
		System.out.println(l.size());			//taille
		
		l.sort(null);
		System.out.println(l.get(0));			//plus petit élément
		System.out.println(l.get(l.size()-1));	//plus grand élément
		
		l.remove(0); 			
		System.out.println(l);					//moins le plus petit élément
		
		l.replaceAll(x -> Math.abs(x));
		System.out.println(l);					//les éléments négatifs rendus positifs
	}

}
