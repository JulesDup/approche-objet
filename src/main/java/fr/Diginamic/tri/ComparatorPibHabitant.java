package fr.Diginamic.tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		int result = 0;
		if (pays1.getPIBParHabt() < pays2.getPIBParHabt()) {
			result = -1;
		} else if (pays1.getPIBParHabt() < pays2.getPIBParHabt())
			result = 1;
		return result;
	}

}
