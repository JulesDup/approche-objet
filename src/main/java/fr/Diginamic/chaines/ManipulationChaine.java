package fr.Diginamic.chaines;


import entites.Personne;
import fr.Diginamic.banque.entites.Compte;

public class ManipulationChaine {
	public static void main(String[] args) {
		/** chaine : chaine de string */
		String chaine = "Durand;Marcel;012543;1 523.5";

		// r�ccup�re premier caract�re
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caract�re: " + premierCaractere);

		// renvoi taille de la chaine
		System.out.println("taille chaine de caract�re : " + chaine.length());

		// renvoi taille index de ";"

		System.out.println("Index de \";\":  " + chaine.indexOf(';'));

		// affiche une portion de la chaine
		String str = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Premier element : " + str);

		// modif chaine de caract�re
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// affichage chaine de caract�re d�coup�
		String[] strDecoup = chaine.split(";");
		String strAffichage = "Chaine split�e : ";

		for (int i = 0; i < strDecoup.length; i++) {
			strAffichage += strDecoup[i] + " / ";
		}
		System.out.println(strAffichage);

		Personne prs1 = new Personne(strDecoup[0], strDecoup[1], null);
		double strToInt = Double.parseDouble(strDecoup[3].replaceAll(" ", ""));
		Compte cpt1 = new Compte(strDecoup[2], strToInt);

		System.out.println(prs1);
		System.out.println(cpt1);

	}
}
