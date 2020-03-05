package fr.Diginamic.Operations;

public class CalculerMoyenne {
//	Attributs
	/** tabD : tableau de doubles */
	double[] tabD = {};

//	Constructeur
	/** Constructeur vide */
	public CalculerMoyenne() {
		super();
	}

//	Methodes
	/**
	 * @param d   un double a rajouter
	 * @param tab tableau qui contiendra l'ajout
	 * @return tableau avec un double ajouté
	 */
	public double[] ajout(double d, double[] tab) {
		double[] tabPlus = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			tabPlus[i] = tab[i];
		}
		tabPlus[tab.length] = d;
		return tabPlus;
	}

	/**
	 * @param tab tablean a afficher permet affichage d'un tableau dans la console
	 */
	public void afficherTableau(double[] tab) {
		String afficheTab = null;
		for (int i = 0; i < tab.length; i++) {
			afficheTab += " " + tab[i] + " ";
		}

		System.out.println("[" + afficheTab + "]");

	}

	/**
	 * @param tab tableau contenant des doubles
	 * @return moyenne des doubles du tableau
	 */
	public double calcule(double tab[]) {
		double moyenne = 0;
		for (int i = 0; i < tab.length; i++) {
			moyenne += tab[i];
			moyenne = moyenne / tab.length;
		}
		return moyenne;

	}

}
