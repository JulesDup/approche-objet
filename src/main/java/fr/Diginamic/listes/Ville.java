package fr.Diginamic.listes;

public class Ville {
	/** nom : de la ville */
	String nom;
	/** nbHab : nombre d'habitant de la ville */
	int nbHab;

	/**
	 * Constructeur d'une ville
	 * 
	 * @param nom   de la ville
	 * @param nbHab de la ville
	 */
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", nbHab=" + nbHab + "]";
	}

}
