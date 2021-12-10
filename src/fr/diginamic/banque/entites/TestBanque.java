package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(01,785259);
		CompteTaux ct = new CompteTaux(02,2458558,2);
		Compte[] tableauComptes = {c1, ct};
		
		for(int i = 0; i < tableauComptes.length ; i++) {
			System.out.println(tableauComptes[i].toString());
			System.out.println("\n");
		}
	}

}
