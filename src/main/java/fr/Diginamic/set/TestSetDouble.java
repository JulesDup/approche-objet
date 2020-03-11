package fr.Diginamic.set;

import java.util.*;

public class TestSetDouble {

	/**
	 * affiche le set
	 * 
	 * @param setDouble
	 */
	static void affList(Set<Double> setDouble) {
		for (Double dbl : setDouble) {
			System.out.print(dbl + " / ");
		}
	}

	public static void main(String[] args) {
//EXO 1
		// instanciation du hashset
		Set<Double> setNum = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		// affichage du set
		TestSetDouble.affList(setNum);

		// Affiche la plus grande valeur
		double dblMax = 0.0;
		for (Double dbl1 : setNum) {
			if (dbl1 > dblMax) {
				dblMax = dbl1;
			}
		}
		System.out.println();
		System.out.println("le plus grand : " + dblMax);

		// Affiche la plus petite valeur
		double dblMin = 1000.00;
		for (Double dbl : setNum) {
			if (dbl < dblMin) {
				dblMin = dbl;
			}
		}
		System.out.println("le plus petite : " + dblMin);

		// Affiche la plus petite valeur
		double dblMin1 = 1000.00;
		for (Double dbl : setNum) {
			if (dbl < dblMin1) {
				dblMin1 = dbl;
			}
		}
		setNum.remove(dblMin1);
		TestSetDouble.affList(setNum);

//EXO 2

		
		
	}

}
