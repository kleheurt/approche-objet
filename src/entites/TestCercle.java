package entites;

import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = CercleFactory.makeCercle(10);
		Cercle c2 = CercleFactory.makeCercle(20);
		
		System.out.println(c1.getPerimetre());
		System.out.println(c2.getPerimetre());
		System.out.println(c1.getSurface());
		System.out.println(c2.getSurface());

	}

}
