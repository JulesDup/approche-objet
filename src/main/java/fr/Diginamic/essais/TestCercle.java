package fr.Diginamic.essais;

import fr.Diginamic.entites.Cercle;
import fr.Diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(32);
		Cercle cercle2 = new Cercle(42);
		System.out.println(cercle1);
		System.out.println(cercle2);

		System.out.println("-------------Crer cercle avec factory-------------");
		Cercle monCercle = CercleFactory.crerCercle(42);
		System.out.println(monCercle);
	}
}
