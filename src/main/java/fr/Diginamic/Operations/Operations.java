package fr.Diginamic.Operations;

public class Operations {
	/**
	 * @param a un chiffre
	 * @param b un deuxieme chiffer
	 * @param ope un operateur
	 * @return le resultat
	 */
	public static double calcul(double a, double b, char ope) {
		double rslt = 0;
		switch (ope) {
		case '+':
			rslt = a + b;
			break;
		case '-':
			rslt = a - b;
			break;
		case '*':
			rslt = a * b;
			break;
		case '/':
			rslt = a / b;
			break;

		default:
			System.out.println("erreur d'opérateur !");
			break;
		}
		return rslt;
	}

}
