package fr.Diginamic.formes;

/**
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 * 
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {
	/**
	 * Retourne le périmètre d’une forme géométrique
	 * 
	 * @return double
	 */
	double calculerPerimetre();

	/**
	 * Retourne la Surface d’une forme géométrique
	 * 
	 * @param double
	 */
	double calculerSurface();
}
