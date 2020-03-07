package fr.Diginamic.maison;

public class Salon extends Piece {

	public Salon(double superficie, int nbEtage) {
		super(superficie, nbEtage);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return this.getClass().getSimpleName();
	}

}
