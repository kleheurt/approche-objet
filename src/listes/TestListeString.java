package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
	
	//liste des villes commençant pas 'N'
	public static List<String> getN(List<String> l){
		List<String> ln = new ArrayList<String>();
		for (String str : l) {
			if (str.toCharArray()[0] == 'N') ln.add(str);
		}
		return ln;
	}

	public static void main(String[] args) {
		String[] arr = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"};
		List<String> l = Arrays.asList(arr);
		l = new ArrayList<String>(l);
		
		l.replaceAll(x -> x.toUpperCase());
		System.out.println(l);
		
		List<String> ln = getN(l);
		l.removeAll(ln);
		System.out.println(l);
	}

}
