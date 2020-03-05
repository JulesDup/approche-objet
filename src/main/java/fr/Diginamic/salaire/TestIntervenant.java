package fr.Diginamic.salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie = new Salarie(1600, "Bicrave", "Jean");
		Pigiste pigiste = new Pigiste("Chausette", "Henri", 5, 38);
		System.out.println("Salaire mensuel d'un " + salarie.getClass().getSimpleName() + " : " + salarie.getSalaire());
		System.out.println("Salaire mensuel du " + pigiste.getClass().getSimpleName() + " : " + pigiste.getSalaire());

		System.out.println(salarie);
		System.out.println(pigiste);
	}

}
