package tri;

import java.util.Comparator;

public class ComparateurNom implements Comparator<Ville>{

	 
	@Override
	public int compare(Ville v1, Ville v2) {
		//
		int result = v1.getNom().compareTo(v2.getNom());
		return result;
	}
}
