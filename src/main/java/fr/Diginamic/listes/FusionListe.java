package fr.Diginamic.listes;

import java.util.*;

public class FusionListe {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> liste3 = new ArrayList<>();

		for (String string : liste1) {
			liste3.add(string);
		}
		for (String string : liste2) {
			liste3.add(string);
		}
		for (String string : liste3) {
			System.out.println(string);
		}
	}

}
