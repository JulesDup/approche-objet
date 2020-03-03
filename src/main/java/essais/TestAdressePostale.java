package essais;

import entites.*;

public class TestAdressePostale {

	public static void main(String[] args) {

		// creation adresse
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();

		adresse1.setLibelleRue("rue Chaussette");
		adresse1.setNumRue(42);
		adresse1.setCodePostal(44000);
		adresse1.setVille("Nantes");

		adresse2.setLibelleRue("rue Chaussette");
		adresse2.setNumRue(42);
		adresse2.setCodePostal(44000);
		adresse2.setVille("Nantes");

		System.out.println(adresse1.toString());
		System.out.println(adresse2.toString());

		// Creation Personne
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();

		personne1.setNom("Daniel");
		personne1.setPremon("Antoine");
		personne1.setAdresse(adresse1);

		personne2.setNom("Astier");
		personne2.setPremon("alex");
		personne2.setAdresse(adresse2);
		System.out.println(personne1.toString());
		System.out.println(personne2.toString());
	}

}
