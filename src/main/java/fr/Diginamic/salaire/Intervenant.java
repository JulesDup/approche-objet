package fr.Diginamic.salaire;

public abstract class Intervenant {
	/** nom : nom de l'intervenant */
	protected String nom;
	/** prenom : prenom de l'intervenant */
	protected String prenom;

	/**
	 * Constructeur de class abstraite
	 * 
	 * @param nom    de l'intervenante
	 * @param prenom de l'intervenante
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return le salaire d'un intervenant
	 */
	abstract double getSalaire();

	@Override
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + ", Salaire =" + getSalaire() + ", Statut ="
				+ getClass().getSimpleName() + "]";
	}
}
