package fr.Diginamic.banque.entites;

public class CompteTaux extends Compte {

	// variable
	private int tauxRemuneration;

	/** Getter
	 * @return the tauxRemuneration
	 */
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	// Constructeur
	public CompteTaux(String numCompte, int soldeCompte, int tauxRemuneration) {
		super(numCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	// methodes
	@Override
	public String toString() {
		String nom = super.toString();
		return nom += "CompteTaux [tauxRemuneration=" + tauxRemuneration + "]";
	}

}
