package fr.Diginamic.Operations;

public class CalculerMoyenne {
//	Attributs
	/** tabD : tableau de doubles */
	double[] tabD = {};

	/**
	 * Constructeur
	 * 
	 * @param tabD
	 */

//	Constructeur
	public CalculerMoyenne() {
		super();
	}

//	Methodes
	public double[] ajout(double d, double[] tab) {
		double[] tabPlus = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tabPlus[i] = tab[i];
		}
		tabPlus[tab.length] = d;
		return tabPlus;
	}

	public void afficherTableau(double[] tab) {
		String afficheTab = null;
		for (int i = 0; i < tab.length; i++) {
			afficheTab += " " + tab[i] + " ";
		}

		System.out.println("[" + afficheTab + "]");

	}

	double calcule(double tab[]) {
		double moyenne = 0;
		for (int i = 0; i < tab.length; i++) {
			moyenne += tab[i];
			moyenne = moyenne / tab.length;
		}
		return moyenne;

	}

}
