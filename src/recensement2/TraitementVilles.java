package recensement2;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import recensement.TraitementRecensement;


public class TraitementVilles implements TraitementRecensement {
	
	private NavigableSet<Ville> treeVilles;
	private NavigableSet<Region> treeRegion;
	private NavigableSet<Departement> treeDept;
	
	public void extraireLigne(String s) {
		String[] tab = s.split(";");

		String nomVille = tab[6];
		String region = tab[1];
		String dept = tab[2];
		String sPop = tab[9].trim().replaceAll(" ", "");
		int pop = Integer.parseInt(sPop);
		
		this.getRegion(region).raisePop(pop);
		this.getDepartement(dept).raisePop(pop);
		this.treeVilles.add(new Ville(nomVille, dept, region, pop));
	}
	
	private Region getRegion(String nomRegion) {
		for (Region region : treeRegion) {
			if(region.getNom().equals(nomRegion)) return region;
		}
		Region newRegion = new Region(nomRegion);
		this.treeRegion.add(newRegion);
		return newRegion;
	}
	
	private Departement getDepartement(String nomDept) {
		for (Departement departement : treeDept) {
			if(departement.getNom().equals(nomDept)) return departement;
		}
		Departement newDept = new Departement(nomDept);
		this.treeDept.add(newDept);
		return newDept;
	}

	public NavigableSet<Ville> getVilles() {
		return treeVilles;
	}
	
	public NavigableSet<Region> getRegions(){
		return treeRegion;
	}
	
	public NavigableSet<Departement> getDept(){
		return treeDept;
	}
	
	private void updateRegions() {
		NavigableSet<Region> tmp = new TreeSet<>();
		for (Region region : this.treeRegion) {
			tmp.add(region);
		}
		this.treeRegion = tmp;
	}
	
	private void updateDept() {
		NavigableSet<Departement> tmp = new TreeSet<>();
		for (Departement departement : this.treeDept) {
			tmp.add(departement);
		}
		this.treeDept = tmp;
	}
	
	public TraitementVilles(List<String> villes) {
		this.treeVilles = new TreeSet<Ville>();
		this.treeRegion = new TreeSet<Region>();
		this.treeDept = new TreeSet<Departement>();
		
		villes.remove(0);
		for (String s : villes) {
			extraireLigne(s);
		}
		
		updateRegions();
		updateDept();
	}
	
	public NavigableSet<Ville> selectVilles(int stopAt, String typePlage, String nomPlage, NavigableSet<Ville> set, NavigableSet<Ville> res) throws Exception {
		if(set.size() < (stopAt - res.size())) throw new Exception("Ville introuvable ou trop petite");
		
		if(res.size() >= stopAt) return res;
		
		else {
			Ville v = set.first();
			String cle = "";
			switch(typePlage) {
			case "Region":
				cle = v.getRegion();
				break;
			case "Departement":
				cle = v.getDept();
				break;
			case "Ville":
				cle = v.getNom();
				break;
			default:
				cle = "France";
				break;
			}
			if (cle.equals(nomPlage)){	
				res.add(v);
				return selectVilles(stopAt, typePlage, nomPlage, set.tailSet(v, false), res);
				}
			else 
				return selectVilles(stopAt, typePlage, nomPlage, set.tailSet(v, false), res);
		}
	}
	
	public NavigableSet<Region> selectRegions(int stopAt, NavigableSet<Region> set, NavigableSet<Region> res) throws Exception {
		if(set.size() < (stopAt - res.size())) throw new Exception("Collectivité locale introuvable");
		
		if(res.size() >= stopAt) return res;
		
		else {
			Region r = set.first();
			res.add(r);
			return selectRegions(stopAt, set.tailSet(r, false), res);
		}
	}
	
	public NavigableSet<Departement> selectDept(int stopAt, NavigableSet<Departement> set, NavigableSet<Departement> res) throws Exception {
		if(set.size() < (stopAt - res.size())) throw new Exception("Collectivité locale introuvable");
		
		if(res.size() >= stopAt) return res;
		
		else {
			Departement r = set.first();
			res.add(r);
			return selectDept(stopAt, set.tailSet(r, false), res);
		}
	}
	
	@Override
	public String afficher10Regions() {
		NavigableSet<Region> res = new TreeSet<>();
		try {
			res = selectRegions(10, this.treeRegion, res);
		}
		catch(Exception e) {
			return "Région introuvable";
		}
		return affichage(res);
	}
	
	@Override
	public String afficher10Departements() {
		NavigableSet<Departement> res = new TreeSet<>();
		try {
			res = selectDept(10, this.treeDept, res);
		}
		catch(Exception e) {
			return "Département introuvable";
		}
		return affichage(res);
	}
	
	@Override
	public String afficher10VillesFrance() {
		NavigableSet<Ville> res = new TreeSet<>();
		try {
			res = selectVilles(10, "Pays", "France", this.treeVilles, res);
		} catch (Exception e) {
			return "Collectivité locale introuvable";
		}
		return affichage(res);
	}
	
	@Override
	public String afficher10VillesRegion(String region) {
		NavigableSet<Ville> res = new TreeSet<>();
		try {
			res = selectVilles(10, "Region", region, this.treeVilles, res);
		} catch (Exception e) {
			return "Collectivité locale introuvable";
		}
		return affichage(res);
	}
	
	@Override
	public String afficher10VillesDept(String dept) {
		NavigableSet<Ville> res = new TreeSet<>();
		try {
			res = selectVilles(10, "Departement", dept, this.treeVilles, res);
		} catch (Exception e) {
			return "Collectivité locale introuvable";
		}
		return affichage(res);
	}
	
	public String afficherVille(String nomVille) {
		NavigableSet<Ville> res = new TreeSet<>();
		try {
			res = selectVilles(1, "Ville", nomVille, this.treeVilles, res);
		} catch (Exception e) {
			return "Collectivité locale introuvable";
		}
		return affichage(res);
	}
 
	public String affichage(NavigableSet res) {
		String s = "";
		for (Object o : res) {
			s += o.toString();
		}
		return s;
	}

	@Override
	public String selectPopVille(String s) {
		return afficherVille(s);
	}

	@Override
	public String selectPopDepartement(String s) {
		Departement d = getDepartement(s);
		if(d.getPop() == 0) return "Département introuvable";
		return d.toString();
	}

	@Override
	public String selectPopRegion(String s) {
		Region r = getRegion(s);
		if (r.getPop() == 0) return "Région introuvable";
		return r.toString();
	}
	
}
