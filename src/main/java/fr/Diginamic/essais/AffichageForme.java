package fr.Diginamic.essais;

import fr.Diginamic.Operations.CalculerMoyenne;
import fr.Diginamic.formes.*;

public class AffichageForme {
	/** forme : une forme */
	Forme forme;

	public void affichage(Forme forme) {
		System.out.println("-----Forme---- : " + forme.getClass().getSimpleName() + "\n" + "Perimetre : "
				+ forme.calculerPerimetre() + "\n" + "Surface : " + forme.calculerSurface());

	}
}
