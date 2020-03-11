package fr.Diginamic.fichiers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.NavigableMap;

import org.apache.commons.io.FileUtils;

public class Main {
	public static void main(String[] args) {

//Etape 1: Chargement du fichier et optention de la liste
		List<Ville> listeVilles = new ArrayList<>();
		listeVilles = Application.lireFichier();
//Etape2 et 3 : afficher info d'un ville 
		Ville montepellier = GestionPopulation.getVille("Montpellier", listeVilles);
		System.out.println(montepellier);

// Etape 4 : Exploitez les données dont vous disposez pour afficher la population de tout le département de l’Hérault.
		String herault = "34";
		int popHerault = 0;
		popHerault = GestionPopulation.getPopBydepartement(herault, listeVilles);
		System.out.println("population de l'herault : " + popHerault);

//Etape 5 : Affichez la plus petite ville du département
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap = GestionPopulation.getMapVillePopByDept(herault, listeVilles);
		// GestionPopulation.afficheHashMap(map);
		System.out.println("ville la moins peuple : " + ((TreeMap<Integer, String>) treemap).firstEntry());
//Etape 6 :  Affichez les 10 plus grandes villes du département
		NavigableMap reverseTreemap = ((TreeMap<Integer, String>) treemap).descendingMap();
		GestionPopulation.afficheHashMap(reverseTreemap);
		// int popVille = GestionPopulation.getPopByVille("Niort", listeVilles);
//		System.out.println("nombre d'habitant de Niort est de : " + popVille);
//
//		// Somme des pop d'un departement dans la liste
//		int popDepartement = GestionPopulation.getPopBydepartement("94", listeVilles);
//		System.out.println("nombre d'habitant du département 94 : " + popDepartement);
//
//		// Somme des pop d'une region dans la liste
//		int popRegion = GestionPopulation.getPopByRegion("Guyane", listeVilles);
//		System.out.println("nombre d'habitant de la region Guyane : " + popRegion);
//
//		//Faire liste de region
//		Set<String> set = new HashSet<String>();
//		set = GestionPopulation.getAllRegion(listeVilles);
//		for (String string : set) {
//			System.out.println(string);
//		}
//		Map<Integer, String> map = new TreeMap<Integer, String>();
//		map = GestionPopulation.getMapRegionsPop(listeVilles);
//		GestionPopulation.afficheHashMap(map);
//		for (String string : map.) {
//			System.out.println(string);
//		}

	}

}