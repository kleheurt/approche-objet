package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {
	
	public static void main(String[] args) {
		Salarie s1 = new Salarie("Dupond", "Jean");
		s1.setSalaire(2000);
		System.out.println(s1.getSalaire());
		
		Pigiste p1 = new Pigiste("Martin", "Jeannot");
		p1.setJours(10);
		p1.setMontant(52);
		System.out.println(p1.getSalaire()+"\n");
		
		s1.afficherDonnees();
		p1.afficherDonnees();
		
	}

}
