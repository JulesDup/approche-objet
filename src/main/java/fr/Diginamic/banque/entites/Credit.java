package fr.Diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double d) {
		super(date, d);
	}

	@Override
	public String toString() {
		return "Credit [date=" + date + ", montantOperation=" + montantOperation + "]";
	}

	@Override
	public String afficherType() {
		return "Crédit";
	}

	@Override
	public double calculerSolde(Double Soldescompte) {
		double soldeGlobal = Soldescompte + this.montantOperation;
		return soldeGlobal;
	}

}
