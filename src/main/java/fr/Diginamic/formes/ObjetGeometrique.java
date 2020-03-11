package fr.Diginamic.formes;

/**
 * Liste les m�thodes obligatoires que doit poss�der un objet g�om�trique
 * 
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {
	/**
	 * Retourne le p�rim�tre d�une forme g�om�trique
	 * 
	 * @return double
	 */
	double calculerPerimetre();

	/**
	 * Retourne la Surface d�une forme g�om�trique
	 * 
	 * @param double
	 */
	double calculerSurface();
}
