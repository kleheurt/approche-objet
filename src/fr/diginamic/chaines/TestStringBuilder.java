package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		for(int i = 0; i <= 100000; i++) {
			sb.append(i);
		}
		long fin = System.currentTimeMillis();
		
		System.out.println("StringBuilder / Temps �coul� en ms :"+ (fin - debut));
		
		String s = "";
		debut =  System.currentTimeMillis();
		for(int i = 0; i <= 100000; i++) {
			s += i;
		}
		fin = System.currentTimeMillis();
		System.out.println("String / Temps �coul� en ms :"+ (fin - debut));
	}

}
