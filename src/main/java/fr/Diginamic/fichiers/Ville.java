package fr.Diginamic.fichiers;

public class Ville {
	/** codeRegion : de la ville */
	String codeRegion;
	/** nomRegion : de la ville */
	String nomRegion;
	/** codeDepartement : de la ville */
	String codeDepartement;
	/** codeCommune : de la ville */
	String codeCommune;
	/** nomCommune : de la ville */
	String nomCommune;
	/** populationTotale : de la ville */
	int populationTotale;

	public Ville() {

	}

	/**
	 * Constructeur
	 * 
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/**
	 * Setter
	 * 
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * Setter
	 * 
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * Setter
	 * 
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * Setter
	 * 
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * Setter
	 * 
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [ nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement + ", nomCommune=" + nomCommune
				+ ", populationTotale=" + populationTotale + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeCommune == null) ? 0 : codeCommune.hashCode());
		result = prime * result + ((codeDepartement == null) ? 0 : codeDepartement.hashCode());
		result = prime * result + ((codeRegion == null) ? 0 : codeRegion.hashCode());
		result = prime * result + ((nomCommune == null) ? 0 : nomCommune.hashCode());
		result = prime * result + ((nomRegion == null) ? 0 : nomRegion.hashCode());
		result = prime * result + populationTotale;
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
		Ville other = (Ville) obj;
		if (codeCommune == null) {
			if (other.codeCommune != null)
				return false;
		} else if (!codeCommune.equals(other.codeCommune))
			return false;
		if (codeDepartement == null) {
			if (other.codeDepartement != null)
				return false;
		} else if (!codeDepartement.equals(other.codeDepartement))
			return false;
		if (codeRegion == null) {
			if (other.codeRegion != null)
				return false;
		} else if (!codeRegion.equals(other.codeRegion))
			return false;
		if (nomCommune == null) {
			if (other.nomCommune != null)
				return false;
		} else if (!nomCommune.equals(other.nomCommune))
			return false;
		if (nomRegion == null) {
			if (other.nomRegion != null)
				return false;
		} else if (!nomRegion.equals(other.nomRegion))
			return false;
		if (populationTotale != other.populationTotale)
			return false;
		return true;
	}

}
