package fr.Diginamic.essais;

import fr.Diginamic.Operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		double a = 69;
		double b = 42;
		char[] opes = new char[4];
		opes[0] = '+';
		opes[1] = '-';
		opes[2] = '*';
		opes[3] = '/';

		for (int i = 0; i < opes.length; i++) {
			System.out.println(Operations.calcul(a, b, opes[i]));
			
		}
	}

}
