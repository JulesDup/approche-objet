package fr.Diginamic.testexceptions;

public class Opreration {
	private double a;
	private double b;

	static double diviser(double a, double b) throws DivException {
		double resultat = 0.0;
		if (b == 0) {
			throw new DivException("on ne divise pas par 0 bon dieu!");

		} else {
			resultat = a / b;
		}
		return resultat;

	}

	static double diviserRuntime(double a, double b) throws RuntimeException {
		double resultat = 0.0;
		if (b == 0) {
			throw new RuntimeException("on ne divise pas par 0 bon dieu!");

		} else {
			resultat = a / b;
		}
		return resultat;

	}
}
