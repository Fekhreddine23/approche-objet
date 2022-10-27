package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vérifiez que votre classe CalculMoyenne correctement en effectuant au moins 2 tests différents
		
			CalculMoyenne  d = new CalculMoyenne();
			
			d.ajout(45.2); //methode ajout
			d.ajout(69.3);
			d.calcul(); //methode calcul
			
			System.out.println(d);

	}

}
