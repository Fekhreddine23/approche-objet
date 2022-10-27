package fr.diginamic.testexceptions;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public TestReflectionUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		//Dans cette classe, créez une instance de Ville et invoquez la méthode afficherAttributs de ReflectionUtils 
		//avec cette instance de Ville.
		
		Ville ville = new Ville("Paris",2000000, Continent.EUROPE);
		
		//instance de ville
		//ReflectionUtils.afficherAttributs(ville);
		
		
		//lorsque on passe null a la methode 
		//message erreur dans la console .
		ReflectionUtils.afficherAttributs(null);

	}

}
