package essais;

import operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne cm = new CalculMoyenne();
		System.out.println(cm.toString());
		cm.ajout(100);
		System.out.println(cm.toString());
		cm.ajout(200);
		System.out.println(cm.toString());
		cm.ajout(100);
		System.out.println(cm.toString()+"\n");
		System.out.println(cm.calcul()+"\n");
		
		CalculMoyenne cm2 = new CalculMoyenne();
		System.out.println(cm2.toString());
		cm2.ajout(8);
		System.out.println(cm2.toString());
		cm2.ajout(17);
		System.out.println(cm2.toString());
		cm2.ajout(16);
		System.out.println(cm2.toString()+"\n");
		System.out.println(cm2.calcul()+"\n");

	}

}
