package fr.Diginamic.banque.entites;

public abstract class Operation {
	// attribut
	protected String date;
	protected double montantOperation;

	// Constructeur
	public Operation(String date, double d) {
		this.date = date;
		this.montantOperation = d;
	}

	// methode
	/**
	 * Cette methode retourne le type de l'Operation (debit ou credit)
	 * 
	 * @return
	 */
	public abstract String afficherType();

	public abstract double calculerSolde(Double Soldescompte);

}
