package fr.Diginamic.tri;

public class Pays implements Comparable<Pays> {
	/** nom : nom du pays */
	String nom;
	/** nbhabitant : nb d'habitant du Pays */
	double nbhabitant;
	/** PIBParHabt : PIB par habitnat du pays */
	double PIBParHabt;
	double PIBTot;

	public Pays() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la class Pays
	 * 
	 * @param nom nom du pays
	 * @param d   nb d'habitant du Pays
	 * @param e   PIB par habitnat du pays
	 */
	public Pays(String nom, double d, double e) {
		super();
		this.nom = nom;
		this.nbhabitant = d;
		this.PIBParHabt = e;
		this.PIBTot = nbhabitant * nbhabitant;
	}

	/**
	 * Getter
	 * 
	 * @return the pIBTot
	 */
	public double getPIBTot() {
		return PIBTot;
	}

	/**
	 * Setter
	 * 
	 * @param pIBTot the pIBTot to set
	 */
	public void setPIBTot(double pIBTot) {
		PIBTot = pIBTot;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbhabitant
	 */
	public double getNbhabitant() {
		return nbhabitant;
	}

	/**
	 * Getter
	 * 
	 * @return the pIBParHabt
	 */
	public double getPIBParHabt() {
		return PIBParHabt;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbhabitant the nbhabitant to set
	 */
	public void setNbhabitant(double nbhabitant) {
		this.nbhabitant = nbhabitant;
	}

	/**
	 * Setter
	 * 
	 * @param pIBParHabt the pIBParHabt to set
	 */
	public void setPIBParHabt(double pIBParHabt) {
		PIBParHabt = pIBParHabt;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbhabitant=" + nbhabitant + ", PIBParHabt=" + PIBParHabt + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(PIBParHabt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nbhabitant);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (Double.doubleToLongBits(PIBParHabt) != Double.doubleToLongBits(other.PIBParHabt))
			return false;
		if (Double.doubleToLongBits(nbhabitant) != Double.doubleToLongBits(other.nbhabitant))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

// Pour exo 1
	@Override
	public int compareTo(Pays pays) {
		int result = this.nom.compareTo(pays.getNom());
		return result;
	}
	// Pour exo 2
//	@Override
//	public int compareTo(Pays pays) {
//		int result = 0;
//		if (this.PIBParHabt < pays.getPIBParHabt()) {
//			result = -1;
//		} else if (this.PIBParHabt > pays.getPIBParHabt())
//			result = 1;
//
//		return result;
//	}

}
