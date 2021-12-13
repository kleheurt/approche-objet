package utils;

import entites.Cercle;

public class CercleFactory {
	
	public static Cercle makeCercle(double rayon) {
		return new Cercle(rayon);
	}

}
