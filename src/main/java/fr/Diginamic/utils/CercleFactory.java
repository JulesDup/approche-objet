package fr.Diginamic.utils;

import fr.Diginamic.entites.Cercle;

public class CercleFactory {

	/**
	 * @param r rayon d'un cercle
	 * @return un cercle
	 */
	public static Cercle crerCercle(double r) {
		return new Cercle(r);

	}
}