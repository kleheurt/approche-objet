package fr.diginamic.testexceptions;

import listes.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) {
		Ville v = new Ville("Singapour", 999999, Continent.ASIE);
		
		try {
			ReflectionUtils.afficherAttributs(v);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			e.printStackTrace();
		}

	}

}
