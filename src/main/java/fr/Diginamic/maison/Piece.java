package fr.Diginamic.maison;

/**
 * @author jules
 *
 */
public abstract class Piece {

	/** superficie : superficie de la piece */
	double superficie;
	/** nbEtage : numero de l'etage */
	int nbEtage;

	/**
	 * Constructeur
	 * 
	 * @param superficie
	 * @param nbEtage
	 */
	public Piece(double superficie, int nbEtage) {
		this.superficie = superficie;
		this.nbEtage = nbEtage;
	}

	/**
	 * Getter
	 * 
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * Setter
	 * 
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * Getter
	 * 
	 * @return the nbEtage
	 */
	public int getNbEtage() {
		return nbEtage;
	}

	/**
	 * Setter
	 * 
	 * @param nbEtage the nbEtage to set
	 */
	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

}
