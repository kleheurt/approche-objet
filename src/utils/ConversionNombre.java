package utils;

public class ConversionNombre {

	public static void main(String[] args) {
		String chaine = "12";
		int chaineInt = Integer.decode(chaine).intValue();
		int a = chaineInt ; int b = 6;
		System.out.println(Integer.max(a,b));
	}

}
