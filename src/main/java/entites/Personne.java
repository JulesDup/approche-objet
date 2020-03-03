package entites;

public class Personne {
	// Attribut
	private String nom;
	private String premon;
	private AdressePostale adresse;

	// Constructor
	public Personne(String nom, String premon, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.premon = premon;
		this.adresse = adresse;
	}

	// Accesseur
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPremon() {
		return premon;
	}

	public void setPremon(String premon) {
		this.premon = premon;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", premon=" + premon + ", adresse=" + adresse + "]";
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
}
