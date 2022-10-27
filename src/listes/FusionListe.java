package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		
		//Créez en utilisant des boucles une liste appelée liste 
		ArrayList<String> liste = new ArrayList<String>();
		 liste.addAll(liste1);
		 liste.addAll(liste2);
		
		 
		//et qui contient l’ensemble des données des 2 listes précédentes.
		for(String n : liste) {
			System.out.println(n);
			
		}
		
		 

	}

}
