package recensement.modeleObjet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departement implements Collectivite, Comparable<Departement> {

	private String nom;
	private List<Ville> villes;
	private int pop;

	public List<Ville> getVilles() {
		return villes;
	}

	public Departement(String nom) {
		super();
		this.villes = new ArrayList<Ville>();
		this.nom = nom;
		this.pop = 0;
	}

	@Override
	public int getPop() {
		return this.pop;
	}

	@Override
	public String getNom() {
		return nom;
	}

	public void ajouterVille(Ville v) {
		this.villes.add(v);
	}

	public int setPop() {
		this.pop = 0;
		for (Ville ville : villes) {
			this.pop += ville.getPop();
		}
		this.villes.sort(null);
		return this.pop;
	}

	public int selectPop(String nom, String plage) {
		for (Ville ville : villes) {
			if(ville.getNom().equals(nom)) return ville.getPop();
		}
		return -1;
	}

	@Override
	public int compareTo(Departement o) {
		return ((Integer)this.getPop()).compareTo(o.getPop());
	}
	
	@Override
	public String toString() {
		return "Département "+this.nom+"\n";
	}

	public List<Ville> selectVilles(String nom, String plage){
		if(this.getClass().getSimpleName().equals(plage) && this.getNom().equals(nom)) {
			return this.villes;
		}
		else {
			return Collections.emptyList();
		}
	}

}
