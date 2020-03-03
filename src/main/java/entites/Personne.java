package entites;

public class Personne {
	// Attribut
	private String nom;
	private String prenom;
	private AdressePostale adresse;

	/**
	 * Constructor
	 * 
	 * @param nom     nom de la personne
	 * @param prenom  prenom de la personne
	 * @param adresse adresse de la personne
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// Accesseur

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

	// methode
	/**
	 * permet de recuperer nom en maj et prenom
	 * 
	 * @param nom    de la personne
	 * @param prenom de la personne
	 * @return
	 */
	public String sePresenter(String nom, String prenom) {
		nom = nom.toUpperCase();
		String nomPrenom = nom + " " + prenom;

		return nomPrenom;
	}

	/**
	 * Methode toString
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", premon=" + prenom + ", adresse=" + adresse + "]";
	}

}
