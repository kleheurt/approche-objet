package recensement;


/** 
 * 
 * @author Kévin Le Heurt
 *
 * Cette interface liste  les fonctions à implémenter au TP bonus 02 - Recensement
 */
public interface TraitementRecensement {
	
	public String selectPopVille(String s);
	public String selectPopDepartement(String s);
	public String selectPopRegion(String s);
	public String afficher10Regions();
	public String afficher10Departements();
	public String afficher10VillesDept(String s);
	public String afficher10VillesRegion(String s);
	public String afficher10VillesFrance();
}
