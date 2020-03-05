package fr.Diginamic.formes;

/**
 * @author jules
 *
 */
/**
 * @author jules
 *
 */
public class Cercle extends Forme {

	// Attributs
	/** rayon : Le rayon du cercle */
	private double rayon;

	// Constructeurs
	/**
	 * Constructeur
	 * 
	 * @param rayon le rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	// Getter Setter
	/**
	 * Getter
	 * 
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Setter
	 * 
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	// Methods
	/**
	 * @return le perimetre du cerlce
	 */
	public double calculerPerimetre() {
		double perimetre = this.rayon * 2 * Math.PI;
		return perimetre;
	}

	/**
	 * @return le perimetre du cerlce
	 */
	public double calculerSurface() {
		double surface = this.rayon * this.rayon * Math.PI;
		return surface;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]" + "[perimetre =" + this.calculerPerimetre() + "]" + "[surface ="
				+ this.calculerSurface() + "]";
	}

}
