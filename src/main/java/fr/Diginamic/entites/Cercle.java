package fr.Diginamic.entites;

public class Cercle {

	// Attributs
	/** rayon : Le rayon du cercle */
	double rayon;

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
	double getPerimetre() {
		double perimetre = this.rayon * 2 * Math.PI;
		return perimetre;
	}

	double getSurface() {
		double surface = this.rayon * this.rayon * Math.PI;
		return surface;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]"+"[perimetre =" + this.getPerimetre() + "]"+"[surface =" + this.getSurface() + "]";
	}
	
}
