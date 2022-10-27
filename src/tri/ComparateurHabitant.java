package tri;

import java.util.Comparator;

public  class ComparateurHabitant implements Comparator<Ville>{
	
	
	//methode 
	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		if (v1.getNombreHabitant() > v2.getNombreHabitant()) {
			return 1;
		} else if (v1.getNombreHabitant() < v2.getNombreHabitant()) {
			return -1;
		} else {
			return 0;
		}
	 }
	}
	


