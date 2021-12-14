package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		return ((Integer)v1.getHabitants()).compareTo(v2.getHabitants());
	}

}
