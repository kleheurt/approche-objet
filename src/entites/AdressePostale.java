package entites;

public class AdressePostale {
	
	private int numero;
	private String rue;
	private int cp;
	private String ville;
	
	public AdressePostale(int numero, String rue, int cp, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
