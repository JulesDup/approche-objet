package fr.Diginamic.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
	static void affList(Set<String> setString) {
		Iterator<String> itSetStr = setString.iterator();
		while (itSetStr.hasNext()) {
			String str = itSetStr.next();
			System.out.print(str + " / ");
		}
		System.out.println();
	}

	static void affListPays(Set<Pays> setPays) {
		Iterator<Pays> itSetStr = setPays.iterator();
		while (itSetStr.hasNext()) {
			Pays pays = itSetStr.next();
			System.out.print(pays + " / ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// instanciation du hashset
		Set<String> setString = new HashSet<>(
				Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		// affichage du set
		TestSetString.affList(setString);

		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres

		int nbMaxLettre = 0;
		String strLePlusGrand = "";
		Iterator<String> itSetStr = setString.iterator();
		while (itSetStr.hasNext()) {
			String str = itSetStr.next();
			int nbLettres = str.length();
			if (nbLettres > nbMaxLettre) {
				nbMaxLettre = nbLettres;
				strLePlusGrand = str;
			}

		}
		System.out.println("le pays avec le plus de lettre est : " + strLePlusGrand);
		setString.remove(strLePlusGrand);
		System.out.println("suppression de " + strLePlusGrand);
		TestSetString.affList(setString);

//	Exercice 3

		Set<Pays> setPays = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d),
				new Pays("France", 66.99, 43551d), new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d),
				new Pays("Italie", 60.48, 37970d), new Pays("Japon", 126.8, 42659d),
				new Pays("Chine", 1_395.380, 16624d), new Pays("Russie", 146.780, 27900d),
				new Pays("Inde", 1_368.163, 5174d)));
		// Recherchez le pays avec le PIB/habitant le plus important
		double maxPIBParHabt = 0;
		String paysMaxPIBParHabt = "";
		Pays lePaysMaxPIBParHabt = new Pays();

		Iterator<Pays> itSetPays = setPays.iterator();
		while (itSetPays.hasNext()) {
			Pays pays = itSetPays.next();
			double pibPays = pays.getPIBParHabt();
			if (pibPays > maxPIBParHabt) {
				maxPIBParHabt = pibPays;
				paysMaxPIBParHabt = pays.getNom();
				lePaysMaxPIBParHabt = pays;
			}
		}
		System.out.println("le Pays avec le PIB le plus grands" + paysMaxPIBParHabt);
		System.out.println(lePaysMaxPIBParHabt);

		// Recherchez le pays avec le PIB total le plus important
		double maxPIB = 0;
		String paysMaxPIB = "";
		Pays lePaysMaxPIB = new Pays();

		itSetPays = setPays.iterator();
		while (itSetPays.hasNext()) {
			Pays pays = itSetPays.next();
			double pibPays = pays.getPIBTot();
			if (pibPays > maxPIB) {
				maxPIB = pibPays;
				paysMaxPIB = pays.getNom();
				lePaysMaxPIB = pays;
			}
		}
		System.out.println("le Pays avec le PIB TOT le plus grands" + paysMaxPIB);
		System.out.println(lePaysMaxPIB);

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB
		// total le plus petit

		double minPIB = Double.MAX_VALUE;
		String paysMinPIB = "";
		Pays lePaysMinPIB = new Pays();

		itSetPays = setPays.iterator();
		while (itSetPays.hasNext()) {
			Pays pays = itSetPays.next();
			double pibPays = pays.getPIBTot();
			if (pibPays < minPIB) {
				minPIB = pibPays;
				paysMinPIB = pays.getNom();
				lePaysMinPIB = pays;
			}
		}
		System.out.println("le Pays avec le PIB TOT le plus petit : " + paysMinPIB);
		System.out.println(lePaysMinPIB);
		lePaysMinPIB.setNom(lePaysMinPIB.getNom().toUpperCase());
		System.out.println(lePaysMinPIB);

		// Supprimez le pays dont le PIB total est le plus petit

		setPays.remove(lePaysMinPIB);
		TestSetString.affListPays(setPays);
	}

}
