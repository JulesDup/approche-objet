package fr.Diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double d) {
		super(date, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Debit [date=" + date + ", montantOperation=" + montantOperation + "]";
	}

	@Override
	public String afficherType() {
		return "Debit";
	}

	@Override
	public double calculerSolde(Double Soldescompte) {

		double soldeGlobal = Soldescompte - this.montantOperation;
		return soldeGlobal;
	}

}
