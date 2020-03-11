package fr.Diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	static void affList(List<String> list) {
		for (String string : list) {
			System.out.print(string + " / ");
		}
		System.out.println();
	}

	static void affListVille(List<Ville> listv) {
		for (Ville ville : listv) {
			System.out.print(ville + " / ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		String maxLength = "";
		for (int i = 0; i < listStrings.size(); i++) {
			if (listStrings.get(1).length() > maxLength.length()) {
				maxLength = listStrings.get(i);
			}
		}
		System.out.println(maxLength);

		for (int i = 0; i < listStrings.size(); i++) {
			int indexString = i;

			listStrings.set(i, listStrings.get(i).toUpperCase());
		}
		TestListeString.affList(listStrings);

		for (int i = 0; i < listStrings.size(); i++) {
			if (listStrings.get(i).charAt(0) == 'N') {
				listStrings.remove(i);
			}
		}
		TestListeString.affList(listStrings);

		/// Exo 5
		System.out.println("---------------------------------------- exo 5 ----------------------------------------");
//creation de la liste
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Narbonne", 53400);
		Ville ville3 = new Ville("Lyon", 484000);
		Ville ville4 = new Ville("Foix", 9700);
		Ville ville5 = new Ville("Pau", 77200);
		Ville ville6 = new Ville("Marseille", 850700);
		Ville ville7 = new Ville("Tarbes", 40600);
		List<Ville> listVille = new ArrayList<>(Arrays.asList(ville1, ville2, ville3, ville4, ville5, ville6, ville7));
		String maxPopVille = "";
		int maxPop = 0;
		for (Ville ville : listVille) {
			if (ville.getNbHab() > 0) {
				maxPopVille = ville.getNom();
			}
		}
		int minPop = 0;
		int indexVilleMinPop = 0;
		for (Ville ville : listVille) {
			if (ville.getNbHab() < minPop) {
				minPop = ville.getNbHab();
				indexVilleMinPop = listVille.indexOf(ville);
			}
			listVille.remove(indexVilleMinPop);
		}
		Ville maxPop= new;
		for (int i = 0; i < listVille.size(); i++) {
			if (listVille.get(i).getNbHab() > 100000) {
				courante = listVille.get(i).getNom();

			}

		}
		listVille.set(i, courante.toUpperCase());

		TestListeString.affListVille(listVille);
	}

}