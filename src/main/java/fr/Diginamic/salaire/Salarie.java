package fr.Diginamic.salaire;

public class Salarie extends Intervenant {

	/** salaireMensuel : Salaire d'un intervenant */
	double salaireMensuel;

	/**
	 * Constructeur
	 * 
	 * @param salaireMensuel
	 * @param nom,           String prenom
	 */
	public Salarie(double salaireMensuel, String nom, String prenom) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

}
