package fr.Diginamic.jdr;

import java.util.Random;
import java.util.Scanner;
//blanc violet bleu rouge violet jaune

import fr.Diginamic.jdr.entites.Personnage;

public class MainJdr {

	public static void main(String[] args) {
		String menu = "\n Choisissez une action \n 1 - Creer un personnage \n 2 - Combrattre creature \n 3 - Afficher Score \n 4 - Sortir du donjon ";
		System.out.println("Bonjour vous entrez dans le donjon " + menu);

		Scanner scr = new Scanner(System.in);
		int selection = 0;
		do {
			selection = scr.nextInt();
			switch (selection) {
			case 1:
				System.out.println("--------Creation de personnage--------");
				System.out.println("quel est le nom de votre personnage ? ");
				Scanner scr1 = new Scanner(System.in);
				String selection1 = scr1.nextLine();
				Personnage pers = new Personnage(selection1);
				System.out.println("------------------");
				System.out.println(pers.toString());
				System.out.println("------------------");
				System.out.println(menu);
				break;
			case 2:
				System.out.println("--------Combat ! --------");
				MonsterFactory mFactory = new MonsterFactory();
				mFactory.randomMonster();
				System.out.println();
				System.out.println(menu);
				break;
			case 3:
				System.out.println("--------Score--------");
				System.out.println(menu);
				break;
			case 4:
				System.out.println("--------vous sortez du donjon--------");
				System.out.println(menu);
				break;

			default:
				System.out.println("Votre saisie est erronée");
				break;
			}
		} while (selection != 4);
		scr.close();
	}

}
