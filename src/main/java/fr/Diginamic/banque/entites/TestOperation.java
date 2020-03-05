package fr.Diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] opes = new Operation[4];
		opes[0] = new Debit("03/03/2020", 150.0);
		opes[1] = new Debit("03/03/2020", 150.0);
		opes[2] = new Credit("03/03/2020", 150.0);
		opes[3] = new Debit("03/03/2020", 150.0);

		for (int i = 0; i < opes.length; i++) {
			System.out.println(opes[i]);
			System.out.println(opes[i].calculerSolde((double) 10000));
		}
	}
}
