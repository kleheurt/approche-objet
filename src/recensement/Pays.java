package recensement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pays implements Collectivite, TraitementRecensement {

	private ArrayList<Region> arr;
	private int pop;
	private String nom;

	public void extraireLigne(String s) {
		String[] tab = s.split(";");

		String nomVille = tab[6];
		String region = tab[1];
		String dept = tab[2];
		String sPop = tab[9].trim().replaceAll(" ", "");

		int pop = Integer.parseInt(sPop);

		Region r = getRegion(region);

		Departement d = r.getDepartement(dept);

		d.ajouterVille(new Ville(nomVille, pop));
	}

	public Region ajouterRegion(String s) {
		Region r = new Region(s);
		this.arr.add(r);
		return r;
	}
	
	public Region getRegion(String s) {
		Iterator<Region> it = this.arr.iterator();
		while (it.hasNext()) {
			Region region = it.next();
			if (region.getNom().equals(s))
				return region;
		}
		return ajouterRegion(s);
	}

	public ArrayList<Region> getFrance() {
		return this.arr;
	}

	@Override
	public int getPop() {
		return this.pop;
	}
	
	public String selectPop(String nom, String plage) throws Exception {
		if(this.arr.get(0).getClass().getSimpleName().equals(plage)) {
			for (Region region : arr) {
				if(region.getNom().equals(nom)) return Integer.toString(region.getPop());
			}
		}
		else {
			for (Region region : arr) {
				int tmp = region.selectPop(nom, plage);
				if(tmp != -1) return Integer.toString(tmp);
			}
		}
		throw new Exception("Collectivité locale introuvable");
	}
	
	public ArrayList<Ville> selectVilles(String nom, String plage) throws Exception{
		ArrayList<Ville> tmp = new ArrayList<>();
		if(this.getClass().getSimpleName().equals(plage) && this.getNom().equals(nom)) {
			for (Region region : arr) {
				tmp.addAll(region.selectVilles(region.getNom(), region.getClass().getSimpleName()));
			}
		}
		else {
			for (Region region : arr) {
				tmp.addAll(region.selectVilles(nom,plage));
			}
		}
		
		if(tmp.size() == 0) throw new Exception("Collectivité locale introuvable");
		tmp.sort(null);
		return tmp;
	}
	
	@Override
	public String selectPopRegion(String nom) {
		try {
			return this.selectPop(nom, "Region");
		} catch (Exception e) {
			return "Région introuvable";
		}
	}
	
	@Override
	public String selectPopDepartement(String nom) {
		try {
			return this.selectPop(nom, "Departement");
		} catch (Exception e) {
			return "Département introuvable";
		}
	}
	
	@Override
	public String selectPopVille(String nom) {
		try {
			return this.selectPop(nom, "Ville");
		} catch (Exception e) {
			return "Ville introuvable\n"
					+"( Ville de Lyon : précisez 1er ou \033[3mN\033[0me Arrondissement )";
		}
	}
	
	public List<Ville> selectVilleFrance(int intervalle) throws Exception {
		List<Ville> l = this.selectVilles("FRANCE", "France");
		int len = l.size();
		return l.subList(len - intervalle, len);
	}
	
	public List<Ville> selectVilleRegion(String nom, int intervalle) throws Exception {
		List<Ville> l = this.selectVilles(nom,"Region");
		int len = l.size();
		return l.subList(len - intervalle, len);
	}
	
	public List<Ville> selectVilleDept(String nom, int intervalle) throws Exception {
		List<Ville> l = this.selectVilles(nom, "Departement");
		int len = l.size();
		return l.subList(len - intervalle, len);
	}
	
	public List<Region> selectRegions(int intervalle) {
		int len = arr.size();
		return arr.subList(len - (intervalle), len);
	}
	
	@Override
	public String afficher10Regions() {
		return this.affichage(this.selectRegions(10));
	}
	
	@Override
	public String afficher10Departements() {
		return this.affichage(this.selectDept(10));
	}
	
	@Override
	public String afficher10VillesFrance() {
		try {
			return this.affichage(this.selectVilleFrance(10));
		} catch (Exception e) {
			return "Collectivité locale introuvable.";
		}
	}
	
	@Override
	public String afficher10VillesRegion(String nom) {
		try {
			return this.affichage(this.selectVilleRegion(nom,10));
		} catch (Exception e) {
			return "Collectivité locale introuvable.";
		}
	}
	
	@Override
	public String afficher10VillesDept(String nom) {
		try {
			return this.affichage(this.selectVilleDept(nom, 10));
		} catch (Exception e) {
			return "Collectivité locale introuvable.";
		}
	}
	 
	
	// raw type List should be parametrized
	private String affichage(List l) {
		String s = "";
		for (Object o : l) {
			s += o.toString();
		}
		return s;
	}
	
	public List<Departement> selectDept(int intervalle){
		List<Departement> dept = new ArrayList<Departement>();
		for (Region region : arr) {
			dept.addAll(region.getDept());
		}
		dept.sort(null);
		int len = dept.size();
		return dept.subList(len - intervalle, len);
	}
	
	

	public int setPop() {
		this.pop = 0;
		for (Region region : arr) {
			this.pop += region.setPop();
		}
		this.arr.sort(null);
		return this.pop;
	}

	public Pays(String nom, List<String> villes) {
		this.nom = nom;
		villes.remove(0);
		this.arr = new ArrayList<Region>();

		for (String s : villes) {
			extraireLigne(s);
		}
		this.setPop();
		this.arr.sort(null);
	}

	@Override
	public String getNom() {
		return nom;
	}

}
