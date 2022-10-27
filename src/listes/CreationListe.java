package listes;

import java.util.ArrayList;

public class CreationListe {

	
public static void main(String[] args) {
		
		//Dans la méthode main, créez une ArrayList d’entiers 
	ArrayList<Integer> nombre = new ArrayList<Integer>(); // Create an ArrayList object
	
	 for(int i = 1; i <= 100; i++) {
		 
		 //et stockez-y tous les nombres de 1 à 100
		 nombre.add(i);
		 
	}
     //Affichez la taille de la liste en utilisant la méthode de la classe ArrayList 
	 //fournissant cette information.
	 System.out.println(nombre.size());
  }
}
	
 
