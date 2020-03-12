package fr.Diginamic.testexceptions;

public class TestRuntimeException {

	public static void main(String[] args) {
		try {
			double rslt = Opreration.diviserRuntime(5.0, 0.0);
			System.out.println(rslt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("suite du prog");
	}

}
