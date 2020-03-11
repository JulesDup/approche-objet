package fr.Diginamic.tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestTri {

	public static void main(String[] args) {

		// exercice 1 et 2
		List<Pays> listPays = new ArrayList<>(Arrays.asList(new Pays("USA", 327.2, 57638d),
				new Pays("France", 66.99, 43551d), new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d),
				new Pays("Italie", 60.48, 37970d), new Pays("Japon", 126.8, 42659d),
				new Pays("Chine", 1_395.380, 16624d), new Pays("Russie", 146.780, 27900d),
				new Pays("Inde", 1_368.163, 5174d)));
		// tri de la liste voir les deux comparator dans Pays
		Collections.sort(listPays);
		Iterator<Pays> itListPays = listPays.iterator();
		while (itListPays.hasNext()) {
			Pays courant = itListPays.next();
			System.out.println(courant);
		}
		System.out.println("--------------------------------------------------------------");
		// tri avec classe externalisé avec les nb habitant
		Collections.sort(listPays, new ComparatorHabitant());
		for (Pays courant : listPays) {
			System.out.println(courant);
		}
		System.out.println("--------------------------------------------------------------");
		Collections.sort(listPays, new ComparatorPibHabitant());
		for (Pays courant : listPays) {
			System.out.println(courant);
		}
	}
}
