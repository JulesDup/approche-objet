package fr.Diginamic.jdr;

import java.lang.invoke.SwitchPoint;
import java.util.Random;

import fr.Diginamic.jdr.entites.Gobelin;
import fr.Diginamic.jdr.entites.Loup;
import fr.Diginamic.jdr.entites.Monstre;
import fr.Diginamic.jdr.entites.Troll;

public class MonsterFactory {

	public Monstre randomMonster() {
		Random r = new Random();
		int valeur = 1 + r.nextInt(6 - 1);

		switch (valeur) {
		case 1:
		case 2:
		case 3:
			Loup ms = new Loup();
			break; 
		case 4:
		case 5:
			Gobelin ms = new Gobelin();

		case 6:
			Troll ms = new Troll();
		}
		return ms;

	}

}
