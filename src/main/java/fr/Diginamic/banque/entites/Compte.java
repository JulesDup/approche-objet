package fr.Diginamic.banque.entites;

public class Compte {

	// Attributs
	protected String numCompte;
	protected int soldeCompte;

	// Constructeur
	public Compte(String numCompte, int soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public Compte(Compte compte) {
		// TODO Auto-generated constructor stub
	}

	// Getter Setter
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	// Metodes
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}

}
