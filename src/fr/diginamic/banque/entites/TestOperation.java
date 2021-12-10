package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] tablOperation = {
				new Credit("101221", 1234),
				new Credit("111221", 5678),
				new Debit ("121221", 9123),
				new Debit ("131221", 4567)
		};
		
		int acc = 0;
		
		for(int i = 0; i < tablOperation.length; i++) {
			Operation tmp = tablOperation[i];
			String type = tmp.getType();
			int val = tmp.getMontant();
			
			System.out.println(type+" du "+tmp.getDate()+" : "+ val+"€\n");
			
			if(type == "CREDIT") {
				acc += val;
			}
			else {
				acc -= val;
			}
			
		}
		
		System.out.println("Montant global = "+acc+"€");
	}

}
