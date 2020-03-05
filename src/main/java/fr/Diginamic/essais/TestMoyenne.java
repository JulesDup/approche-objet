package fr.Diginamic.essais;

import fr.Diginamic.Operations.CalculerMoyenne;
import fr.Diginamic.Operations.Operations;

public class TestMoyenne {

	public static void main(String[] args) {
		double a = 69;
		double b = 42;
		double[] tab = new double[1];
		CalculerMoyenne calcmoy = new CalculerMoyenne();

		char[] opes = new char[4];
		opes[0] = '+';
		opes[1] = '-';
		opes[2] = '*';
		opes[3] = '/';

		for (int i = 0; i < opes.length; i++) {
			double db = Operations.calcul(a, b, opes[i]);
			tab = calcmoy.ajout(db, tab);
		}
		calcmoy.afficherTableau(tab);
		System.out.println(calcmoy.calcule(tab));

	}

}
