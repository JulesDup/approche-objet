package fr.Diginamic.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CreationMap {

	public static void main(String[] args) {

//Exercice 1
		Map<String, Double> mapSalaire = new HashMap<String, Double>();
		mapSalaire.put("Paul", 1750d);
		mapSalaire.put("Hicham", 1825d);
		mapSalaire.put("Yu", 2250d);
		mapSalaire.put("Ingrid", 2015d);
		mapSalaire.put("Chantal", 2418d);
		System.out.println("taille de la map : " + mapSalaire.size());
//	Exercice 2

		Map<Integer, String> mapVilles = new HashMap<Integer, String>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

//		• Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

//		• Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
//		• Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
//		• Afficher la taille de la map

		/// Pour les keys
		Set<Integer> listKey = mapVilles.keySet();
		Iterator<Integer> keyIte = listKey.iterator();
		System.out.println("liste keys : -------------------------");
		while (keyIte.hasNext()) {
			int courant = keyIte.next();
			System.out.print(courant + " / ");
		}
		System.out.println("");
		System.out.println("la taille est de : " + listKey.size());
		/// Pour les valeur
		Collection<String> collectionPays = mapVilles.values();
		Iterator<String> iteVille = collectionPays.iterator();
		System.out.println("liste des valeur : -------------------------");
		while (iteVille.hasNext()) {
			String courant = iteVille.next();
			System.out.print(courant + " / ");
		}
		System.out.println("");
		System.out.println("la taille est de : " + collectionPays.size());

//Exercice 3

		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		for (Entry<Integer, String> entry : map3.entrySet())
			System.out.println(entry.getKey() + "  " + entry.getValue());
	}
}
