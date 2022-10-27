package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dans cette classe instanciez une ArrayList d’entiers
		ArrayList<Integer> nombre2 = new ArrayList<Integer>();
		nombre2.add(-1);
		nombre2.add(5);
		nombre2.add(3);
		nombre2.add(-2);
		nombre2.add(4);
		nombre2.add(8);
		nombre2.add(5);
		
		System.out.println(nombre2);
		
		//Affichez la taille de la liste
		System.out.println(nombre2.size());
		
		//Recherchez et affichez le plus grand élément de la liste
		Object elementMax = Collections.max(nombre2);
	    System.out.println(elementMax);    
	    
	    //Supprimez le plus petit élément de la liste et affichez le résultat
	    Object elementMin = Collections.min(nombre2);
	    nombre2.remove(elementMin);
	    System.out.println(elementMin);
	    
	    //Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs
	    for(var i = 0; i < nombre2.size(); i++) {
	    	
	    	Integer p = nombre2.get(i);
	    	System.out.println(p);
	    	
	    	if( p < 0) {
	    		nombre2.set(i, - p);
	    	}
	    	
	    	for(Integer n : nombre2) {
	    		System.out.println(n);
	    	}
	    	
	    }
	    
          
	}

}
