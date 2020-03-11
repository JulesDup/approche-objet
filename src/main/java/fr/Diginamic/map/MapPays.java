package fr.Diginamic.map;

import java.util.*;
import java.util.Map.Entry;

import fr.Diginamic.set.*;

public class MapPays {

	public static void main(String[] args) {
		Map<String, Pays> mapPays = new HashMap<String, Pays>();
		Set<Pays> setPays = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d),
				new Pays("France", 66.99, 43551d), new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d),
				new Pays("Italie", 60.48, 37970d), new Pays("Japon", 126.8, 42659d),
				new Pays("Chine", 1_395.380, 16624d), new Pays("Russie", 146.780, 27900d),
				new Pays("Inde", 1_368.163, 5174d)));
		Iterator<Pays> iteSetPays = setPays.iterator();
		while (iteSetPays.hasNext()) {
			Pays pays = iteSetPays.next();
			mapPays.put(pays.getNom(), pays);
		}
		// Afficher ensemble de la map
		for (Entry<String, Pays> entry : mapPays.entrySet())
			System.out.println(entry.getKey() + "  " + entry.getValue());
		// Recherchez et supprimez le pays qui a le moins d’habitants
		// 1 etape : rechercher le pays le moins peuple
		Collection<Pays> collPays = mapPays.values();
		Iterator<Pays> ItePays = collPays.iterator();
		double minHab = Integer.MAX_VALUE;
		Pays paysMoinPeuple = new Pays();
		while (ItePays.hasNext()) {
			Pays courant = ItePays.next();
			if (courant.getNbhabitant() < minHab) {
				minHab = courant.getNbhabitant();
				paysMoinPeuple = courant;
			}
		}
		System.out.println("le pays le moins peuple : " + paysMoinPeuple);
		// 2 etape supprimer le pays le moins peuplé

		mapPays.remove(paysMoinPeuple.getNom());
		// Afficher ensemble de la map
		System.out.println("------------------------------Avec for each-----------------------------");
		for (Entry<String, Pays> entry : mapPays.entrySet())
			System.out.println(entry.getKey() + "  " + entry.getValue());

		// avec iterator
		System.out.println("------------------------------Avec Iterator-----------------------------");
		Iterator<Map.Entry<String, Pays>> iterator = mapPays.entrySet().iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

	}

}
