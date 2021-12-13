package essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t1 = new Theatre("La Comédie Française", 100);
		
		System.out.println(t1.toString());
		t1.inscrire(50,15);
		System.out.println(t1.toString());
		t1.inscrire(50,10);
		System.out.println(t1.toString());
		t1.inscrire(10, 250);
		System.out.println(t1.toString());
	}

}
