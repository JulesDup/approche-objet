package fr.Diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int nbEtage) {
		super(superficie, nbEtage);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return this.getClass().getSimpleName();
	}

}
