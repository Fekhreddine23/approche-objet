package fr.diginamic.essais;

import entites.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		// Créez une instance de Salarie et affichez le résultat retourné par la méthode getSalaire()
		// Créez une instance de Pigiste et affichez le résultat retourné par la méthode getSalaire()
  
		Salarie salaire1 = new Salarie("jean", "valjean", 5.2);
		//salaire1.getSalaire();
		salaire1.toString();
		
		System.out.println(salaire1);
		
		Pigiste pigiste1 = new Pigiste("gavroche", "petit", 89, 5.9);
		pigiste1.toString();
		System.out.println(pigiste1);
		
	}

}
