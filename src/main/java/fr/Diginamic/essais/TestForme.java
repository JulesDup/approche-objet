package fr.Diginamic.essais;

import fr.Diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle = new Cercle(56);
		Rectangle rectangle = new Rectangle(65, 78);
		Carre carre = new Carre(68);
		AffichageForme affForm = new AffichageForme();

		affForm.affichage(cercle);
		affForm.affichage(rectangle);
		affForm.affichage(carre);

	}

}
