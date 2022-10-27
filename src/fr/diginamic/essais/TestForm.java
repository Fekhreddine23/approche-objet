package fr.diginamic.essais;

import fr.diginamic.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForm {

	//Créer une variable de type cercle, une de type rectangle et une de type carré 
	//et tester la méthode afficher avec ces diverses variables
	
	public static void main(String[] args) {
		
		//cercle
		Cercle n1 = new Cercle(56);
		Rectangle r1 = new Rectangle(23, 8);
		Carre c1 = new Carre(45);
		
		System.out.println("le perimetre du cercle est de " + n1.getPerimetre());
		System.out.println("le perimetre du rectangle est de " + r1.calculerSurface());
		System.out.println("le perimetre du carre est de " + c1.getLongueur());
		
	}
	//comme vous le constatez la méthode afficher peut prendre en paramètre n’importe quelle instance d’une classe qui hérite de Forme.
	//C’est l’essence même du polymorphisme
}
