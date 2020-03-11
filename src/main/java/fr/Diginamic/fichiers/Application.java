package fr.Diginamic.fichiers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Application {
	public static List lireFichier() {
		List<Ville> listeVilles = new ArrayList<>();
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");

			for (int i = 1; i < lignes.size(); i++) {
				String ligne = lignes.get(i);
//		 On commence par découper la ligne en morceaux sur la base du caractère
//		 séparateur«;». De plus on ne récupère que les morceaux qui nous intéressent.
//		 En l’occurrence on ignore les morceaux 3 et 4 dont on a pas besoin dans le TP
				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];
//		Pour la population, avant la conversion en int, il faut d’abord supprimer les
// 		espaces qui se trouvent à l’intérieur.
				int populationTotale = Integer.parseInt(population.replace(" ", ""));
//		 On cree enfin la ville avec toutes les données utiles
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);
//				System.out.println(ville);
				listeVilles.add(ville);
			}
			System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return listeVilles;

	}

}


