package fr.diginamic.essais;

import fr.diginamic.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	
	public static void main(String[] args) {
		
		Cercle[]  tabledeRayon = new Cercle[3];
		tabledeRayon[0] = new Cercle(54);
		System.out.println(tabledeRayon[0].getPerimetre() );
		
		tabledeRayon[1] = new Cercle(63);
		System.out.println(tabledeRayon[1].getPerimetre() );
		
		
		
		//dans la classe TestCercle, faites appel à la méthode static de CercleFactory 
	   //pour créer vos cercles.	
		//CercleFactory  v1 = new CercleFactory();
		//tabledeRayon[2] =  v1.afficherCercle(63);//appel methode pas static
		tabledeRayon[2] =  CercleFactory.afficherCercle(63);//appel de methode static
		System.out.println(tabledeRayon[2]);
		
		
		
	}		

}
	
	
