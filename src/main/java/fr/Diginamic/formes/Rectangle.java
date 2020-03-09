package fr.Diginamic.formes;

public class Rectangle extends Forme implements ObjetGeometrique {
	/** longueur : longueurdu rectange */
	protected int longueur;
	/** largeur : largeur du rectangle */
	protected int largeur;

	/**
	 * Constructeur
	 * 
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]" + "[perimetre ="
				+ this.calculerPerimetre() + "]" + "[surface =" + this.calculerSurface() + "]";
	}

}
