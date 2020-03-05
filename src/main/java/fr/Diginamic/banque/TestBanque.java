package fr.Diginamic.banque;

import fr.Diginamic.banque.entites.Compte;
import fr.Diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// Tp1 Tp2
		Compte compte1 = new Compte("123456789", 10000);
		System.out.println(compte1.getNumCompte());
		System.out.println(compte1.getSoldeCompte());
		System.out.println("Compte Normal:" + compte1.toString());

		// Tp3
		Compte compte2 = new Compte("123456789", 10000);
		CompteTaux compteTaux1 = new CompteTaux("123456789", 10000, 456);
		System.out.println("Compte avec taux :" + compteTaux1);

		Compte[] tableauCompte = new Compte[2];
		tableauCompte[0] = compte1;
		tableauCompte[1] = compteTaux1;
		System.out.println("-------------------------Tableau de comptes-------------------------");
		double soldeGlobal = 0.0;
		for (int i = 0; i < tableauCompte.length; i++) {
			System.out.println(tableauCompte[i]);
			soldeGlobal += tableauCompte[i].getSoldeCompte();
		}
		System.out.println(soldeGlobal);
	}

}
