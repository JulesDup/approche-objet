package fr.Diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int nbEtage) {
		super(superficie, nbEtage);

	}

	public String getType() {
		return this.getClass().getSimpleName();
	}

}
