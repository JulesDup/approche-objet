package fr.Diginamic.banque.entites;

public class CompteTaux extends Compte {

	// variable
	int tauxRemuneration;

	// Constructeur
	public CompteTaux(String numCompte, int soldeCompte, int tauxRemuneration) {
		super(numCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	// methodes
	@Override
	public String toString() {
		return "CompteTaux [tauxRemuneration=" + tauxRemuneration + ", numCompte=" + numCompte + ", soldeCompte="
				+ soldeCompte + "]";
	}

}
