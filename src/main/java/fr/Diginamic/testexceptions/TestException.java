package fr.Diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {
		double a = 5;
		double b = 0;

		double rslt = 0;
		try {
			rslt = Opreration.diviser(a, b);
		} catch (DivException e) {

			e.printStackTrace();
		}
		System.out.println(rslt);
	}

}
