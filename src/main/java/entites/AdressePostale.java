package entites;

public class AdressePostale {
	// Attributs
	private int numRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	// accesseur
	public int getNumRue() {
		return numRue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public String getLibelleRue() {
		return libelleRue;
	}
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	@Override
	public String toString() {
		return "AdressePostale [numRue=" + numRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
