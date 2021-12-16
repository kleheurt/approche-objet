package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps",1),
	ETE("Été",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private String libelle;
	private int num;
	
	private Saison(String libelle, int num) {
		this.libelle = libelle;
		this.num = num;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNum() {
		return num;
	}
	
	public static Saison getSaison(String s) throws Exception {
		for (Saison saison : Saison.values()) {
			if(saison.getLibelle().equals(s)) return saison;
		}
		throw new Exception("Pas une saison");
	}

}
