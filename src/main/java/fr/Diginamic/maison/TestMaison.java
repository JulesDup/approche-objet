package fr.Diginamic.maison;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMaison {

	public static void main(String[] args) {

		Maison maMaison = new Maison();
		maMaison.ajouterPiece(new WC(8, 1));
		maMaison.ajouterPiece(new WC(8, 2));
		maMaison.ajouterPiece(new WC(8, 0));
		maMaison.ajouterPiece(new SalleDeBain(8, 1));
		maMaison.ajouterPiece(new Chambre(12, 1));
		maMaison.ajouterPiece(new Chambre(12, 2));
		maMaison.ajouterPiece(new Chambre(12, 2));
		maMaison.ajouterPiece(new Cuisine(14, 0));
		maMaison.ajouterPiece(new Salon(20, 0));

		System.out.println(maMaison);
		System.out.println("-----------------------");
		System.out.print("Superficie RDC : ");
		System.out.println(maMaison.getSuperficieEtage(0));
		System.out.print("Superficie Etage 1 : ");
		System.out.println(maMaison.getSuperficieEtage(1));
		System.out.print("Superficie Etage 2 : ");
		System.out.println(maMaison.getSuperficieEtage(2));
		System.out.println("-----------------------");

		System.out.println("------------------Test-------------------");
		maMaison.ajouterPiece(null);
		maMaison.ajouterPiece(new Salon(-20, 0));
		maMaison.ajouterPiece(new Salon(-20, -1));

//		double sup = maMaison.getSuperficieMaison();
//		System.out.println(sup);
//		Iterator it = listPiece1.iterator();
//		while (it.hasNext()) {
//			System.out.println();
//		}

	}

}
