package fr.Diginamic.essais;

import fr.Diginamic.formes.Carre;
import fr.Diginamic.formes.Cercle;
import fr.Diginamic.formes.Forme;
import fr.Diginamic.formes.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		Forme form1 = new Cercle(12);
		Forme form2 = new Rectangle(23, 42);
		Forme form3 = new Carre(12);
		Forme[] tabForms = { form1, form2, form3 };
		for (Forme forme : tabForms) {
			System.out.println(forme);

		}

	}

}
