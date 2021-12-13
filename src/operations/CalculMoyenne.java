package operations;

public class CalculMoyenne {
	
	double[] tab;

	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	public String toString() {
		String s = "{ ";
		for(int i = 0; i < this.tab.length ; i++) {
			s += (this.tab[i]+" ");
		}
		return s+"}";
	}

	public CalculMoyenne() {
		super();
		this.tab = new double[0];
	}
	
	public void ajout(double x) {
		int len = this.tab.length;
		double[] newTab = new double[(len+1)];
		for(int i=0; i < len ; i++) {
			newTab[i] = this.tab[i];
		}
		newTab[len] = x;
		this.tab = newTab;
	}
	
	public double calcul() {
		double acc = 0;
		for(int i = 0; i < this.tab.length ; i++) {
			acc += this.tab[i];
		}
		return acc / (this.tab.length);
	}

}
