package operations;

public class Operations {
	
	public static double calcul(double a, double b, char op) {
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		default :
			return Double.NaN;
		} 
	}

}
