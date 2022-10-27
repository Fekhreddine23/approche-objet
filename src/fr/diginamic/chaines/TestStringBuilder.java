package fr.diginamic.chaines;

import java.io.PrintStream;
import java.util.Iterator;

public class TestStringBuilder {

	public TestStringBuilder() {
		 
		
		
	}

	public static void main(String[] args) {
		//Dans cette classe, ajoutez tous les nombres de 1 à 100 000 
		//dans une instance de StringBuilder
		
		long debut = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		//String b = "";
		for(var i = 1 ; i < 100000; i++) {
			
			builder.append(i);
			//b += i;
			
		}
		
		long fin = System.currentTimeMillis();
		
		
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		//Temps écoulé en millisecondes :15
		//Bcp plus rapide que avec la classe String et operateur +
	
		
	}

}
