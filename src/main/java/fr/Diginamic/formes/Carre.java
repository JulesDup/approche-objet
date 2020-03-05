package fr.Diginamic.formes;

public class Carre extends Rectangle {

	public Carre(int longueur) {
		super(longueur, longueur);
	}

	public double calculerSurface() {
		return longueur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur * 2;
	}

}
