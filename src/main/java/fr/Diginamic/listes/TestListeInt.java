package fr.Diginamic.listes;

import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	static void affList(List<Integer> list) {
		for (Integer integer : list) {
			System.out.print(integer + " / ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("exo 1 et 2");
		List<Integer> listNum = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		TestListeInt.affList(listNum);
		System.out.println("=> taille de la liste : " + listNum.size());

		int max = Integer.MIN_VALUE;
		for (Integer integer : listNum) {
			if (integer > max) {
				max = integer;
			}
		}
		System.out.println("exo 3");
		System.out.println(max);

		int min = Integer.MAX_VALUE;
		int indexMin = 0;
		for (int i = 0; i < listNum.size(); i++) {
			if (listNum.get(i) < min) {
				min = listNum.get(i);
				indexMin = i;
			}
		}
		listNum.remove(indexMin);
		TestListeInt.affList(listNum);

		int index = 0;
		for (int i = 0; i < listNum.size(); i++) {
			if (listNum.get(i) < 0) {
				listNum.set(i, Math.abs(listNum.get(i)));
			}
		}
		TestListeInt.affList(listNum);

	}

}
