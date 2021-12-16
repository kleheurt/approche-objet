package recensement.modeleObjet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Region implements Collectivite, Comparable<Region> {

	private String nom;
	private List<Departement> dept;
	private int pop;

	public List<Departement> getDept() {
		return dept;
	}

	public Region(String nom) {
		super();
		this.dept = new ArrayList<Departement>();
		this.nom = nom;
		this.pop = 0;

	}

	@Override
	public int getPop() {
		return pop;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	public Departement getDepartement(String s) {
		Iterator<Departement> it = dept.iterator();
		while (it.hasNext()) {
			Departement departement = it.next();
			if (departement.getNom().equals(s))
				return departement;
		}
		return ajouterDepartement(s);
	}

	public Departement ajouterDepartement(String s) {
		Departement d = new Departement(s);
		this.dept.add(d);
		return d;
	}

	@Override
	public String toString() {
		String s = this.nom + " : ";
		for (Departement departement : dept) {
			s += departement.getNom() + " ";
		}
		return s + " | " + this.pop + " hab.\n";
	}

	public int setPop() {
		this.pop = 0;
		for (Departement departement : dept) {
			this.pop += departement.setPop();
		}
		this.dept.sort(null);
		return this.pop;
	}

	public int selectPop(String nom, String plage) {
		if (this.dept.get(0).getClass().getSimpleName().equals(plage)) {
			for (Departement departement : dept) {
				if (departement.getNom().equals(nom))
					return departement.getPop();
			}
		} else {
			for (Departement departement : dept) {
				int tmp = departement.selectPop(nom, plage);
				if (tmp != -1)
					return tmp;
			}
		}
		return -1;
	}

	@Override
	public int compareTo(Region o) {
		return ((Integer)this.pop).compareTo(o.getPop());
	}

	public ArrayList<Ville> selectVilles(String nom, String plage){
		ArrayList<Ville> tmp = new ArrayList<>();
		if(this.getClass().getSimpleName().equals(plage) && this.getNom().equals(nom)) {
			for(Departement departement : dept) {
				tmp.addAll(departement.selectVilles(departement.getNom(), departement.getClass().getSimpleName()));
			}
		}
		else {
			for(Departement departement : dept) {
				tmp.addAll(departement.selectVilles(nom,plage));
			}
		}
		return tmp;
	}

}
