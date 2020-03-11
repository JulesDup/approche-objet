package fr.Diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			listNum.add(i);
		}
		System.out.println(listNum.get(0));
		System.out.println(listNum.get(99));
		System.out.println(listNum.size());

	}

}
