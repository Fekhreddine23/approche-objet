package fr.diginamic.essais;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;


public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//• Dans ce package, creez une classe TestOperations 
		//qui permet de tester les 4 opérations.
		System.out.println("addition "+Operations.calcul(23,89,'+'));
		System.out.println("soustraction "+Operations.calcul(23,89,'-'));
		System.out.println("multiplication "+Operations.calcul(23,89,'*'));
		System.out.println("division "+Operations.calcul(23,89,'/'));
	}

}
