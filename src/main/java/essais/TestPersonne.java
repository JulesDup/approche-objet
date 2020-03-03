package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale(42, "rue Chaussette", 79000, "Niort");
		AdressePostale adresse2 = new AdressePostale(42, "rue Chaussette", 44000, "Nantes");
		Personne personne1 = new Personne("Daniel", "Antoine", adresse2);
		Personne personne2 = new Personne("Astier", "alexandre", adresse2);

//		System.out.println(adresse1.toString());
//		System.out.println(adresse2.toString());
//
//		System.out.println(personne1.toString());
//		System.out.println(personne2.toString());

		// TP3
		// Test methode upperCase
		String str;
		str = personne1.sePresenter(personne1.getNom(), personne1.getPrenom());
		System.out.println(str);

		// Test methode Setter et getter
		personne2.setNom("chaussette");
		personne2.setPrenom("chaussette");
		personne2.setAdresse(new AdressePostale(42, "rue machin", 44000, "Nantes"));
		System.out.println(personne1.getNom());
		System.out.println(personne1.getPrenom());
		System.out.println(personne2.toString());
	}

}
