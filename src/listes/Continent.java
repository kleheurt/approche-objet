package listes;

public enum Continent {
	
	EUROPE("Europe"),
	AMERIQUE("Amérique"),
	ASIE("Asie"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	private Continent(String libelle) {
		this.libelle = libelle;
	}
	
	

}
