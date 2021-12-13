package essais;

import operations.Operations;

public class TestOperations {
	
	public static void main(String[] args) {
		double a = 10;
		double b = 10;
		
		System.out.println(Operations.calcul(a,b,'+'));
		System.out.println(Operations.calcul(a,b,'-'));
		System.out.println(Operations.calcul(a,b,'*'));
		System.out.println(Operations.calcul(a,b,'/'));
		System.out.println(Operations.calcul(a,b,'$'));

	}

}
