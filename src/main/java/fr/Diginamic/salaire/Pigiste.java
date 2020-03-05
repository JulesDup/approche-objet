package fr.Diginamic.salaire;

public class Pigiste extends Intervenant {

	/** nbJourTravail : nombre de jours de trvail du pigiste durant un mois */
	private int nbJourTravail;
	/** remunerationJour : remuneration par jour du Pigiste */
	private double remunerationJour;

	/**
	 * Constructeur
	 * 
	 * @param nom              de l'intervenante
	 * @param prenom           de l'intervenante
	 * @param nbJourTravail    nombre de jours de trvail du pigiste sur le mois
	 * @param remunerationJour remuneration par jour du Pigiste
	 */
	public Pigiste(String nom, String prenom, int nbJourTravail, double remunerationJour) {
		super(nom, prenom);
		this.nbJourTravail = nbJourTravail;
		this.remunerationJour = remunerationJour;
	}

	@Override
	double getSalaire() {
		return nbJourTravail * remunerationJour;
	}

}
