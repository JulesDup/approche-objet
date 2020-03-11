package fr.Diginamic.fichiers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.ListView;

import org.apache.commons.io.FileUtils;

/**
 * @author jules
 *
 */
public class GestionPopulation {

	/**
	 * Permet de recupérer une ville dans une liste de villes
	 * 
	 * @param ville       ville recherché
	 * @param listeVilles liste de Ville
	 * @return un objet ville
	 */
	public static Ville getVille(String ville, List<Ville> listeVilles) {
		int index = 0;
		for (int i = 0; i < listeVilles.size(); i++) {
			if (listeVilles.get(i).getNomCommune().equals(ville)) {
				index = i;
			}
		}
		Ville villeReturn = listeVilles.get(index);
		return villeReturn;
	}

	/**
	 * permet de réccupérer population total d'un ville ou commune a partir d'une
	 * liste de ville
	 * 
	 * @param ville  ville dont on cherche pop
	 * @param villes liste de villes
	 * @return un int de la population de la ville
	 */
	public static int getPopByVille(String ville, List<Ville> villes) {
		int pop = 0;
		for (Ville courante : villes) {
			if (courante.getNomCommune().equals(ville)) {
				pop = courante.getPopulationTotale();
			}
		}
		return pop;

	}

	/**
	 * permet de recuperer population total d'un département
	 * 
	 * @param departement departement dont on veut connaitre la population
	 * @param villes      liste de villes
	 * @return int de population total d'un département
	 */
	public static int getPopBydepartement(String departement, List<Ville> villes) {
		int popdept = 0;
		for (Ville courante : villes) {
			if (courante.getCodeDepartement().equals(departement)) {
				popdept += courante.getPopulationTotale();
			}
		}

		return popdept;

	}

	/**
	 * permet de recuperer population total d'un region
	 * 
	 * @param region region dont on cherche la polpulation
	 * @param villes liste de villes
	 * @return int de la population total de la region
	 */
	public static int getPopByRegion(String region, List<Ville> villes) {
		int popRegion = 0;
		for (Ville courante : villes) {
			if (courante.getNomRegion().equals(region)) {
				popRegion += courante.getPopulationTotale();
			}
		}
		return popRegion;

	}

	public static Set<String> getVilleByDepartement(String departement, List<Ville> villes) {
		Set<String> set = new HashSet<>();
		for (Ville courante : villes) {
			if (courante.getCodeDepartement().equals(departement))
				set.add(courante.getNomCommune());
		}
		return set;

	}

	/**
	 * Cree une liste de toute les regions
	 * 
	 * @param villes
	 * @return
	 */
	public static Set<String> getAllRegion(List<Ville> villes) {
		Set<String> set = new HashSet<>();
		for (Ville courante : villes) {
			set.add(courante.getNomRegion());
		}
		return set;

	}

	/**
	 * cree une liste de tout les departements
	 * 
	 * @param villes
	 * @return
	 */
	public static Set<String> getAllDepartement(List<Ville> villes) {
		Set<String> set = new HashSet<>();
		for (Ville courante : villes) {
			set.add(courante.getCodeDepartement());
		}
		return set;

	}

	public static Map<Integer, String> getMapVillePopByDept(String departement, List<Ville> villes) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		Set<String> set = new HashSet<>();
		// rempli un set des differente villes d'un département, supprime les doublons
		set = GestionPopulation.getVilleByDepartement(departement, villes);
		// rempli la Map avec les ville et leur population, le treemap tri en
		// fonction de la clé popDepartement
		for (String villeCourante : set) {
			int popDepartementCourant = GestionPopulation.getPopByVille(villeCourante, villes);
			map.put(popDepartementCourant, villeCourante);
		}

		return map;
	}

	/**
	 * Afficher les régions les plus peuplées dans l'ordre du moin au plus peuplé
	 * 
	 * @param villes
	 * @return
	 */
	public static Map<Integer, String> getMapDepartPop(List<Ville> villes) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		Set<String> set = new HashSet<>();
		// rempli un set des differents département, supprime les doublons
		for (Ville courante : villes) {
			set.add(courante.getCodeDepartement());
		}
		// rempli la Map avec les département et leur population, le treemap tri en
		// fonction de la clé popDepartement
		for (String departementCourant : set) {
			int popDepartementCourant = GestionPopulation.getPopBydepartement(departementCourant, villes);
			map.put(popDepartementCourant, departementCourant);
		}

		return map;

	}

	/**
	 * Afficher les régions les plus peuplées dans l'ordre du moin au plus peuplé
	 * 
	 * @param Villes
	 * @return
	 */
	public static Map<Integer, String> getMapRegionsPop(List<Ville> villes) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		Set<String> set = new HashSet<>();
		for (Ville courante : villes) {
			set.add(courante.getNomRegion());
		}
		for (String regionCourante : set) {
			int popRegionCourante = GestionPopulation.getPopByRegion(regionCourante, villes);
			map.put(popRegionCourante, regionCourante);
		}

		return map;

	}

	/**
	 * Permet d'afficher une map
	 *
	 * @param <V> la clé correspondant ici a la pop
	 * @param <K>
	 * @param
	 */
	public static <V, K> void afficheHashMap(Map<Integer, String> map) {
		for (Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getValue() + "  " + entry.getKey());
	}
}
