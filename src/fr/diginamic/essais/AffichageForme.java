package fr.diginamic.essais;

import fr.diginamic.formes.Form;

public class AffichageForme {
	
	
	//cette classe possède une méthode afficher qui a un paramètre de type Forme. 
	//Cette méthode doit afficher le périmètre et la surface de la forme passée en paramètre.
	public static void affiche(Form form) {
		
		System.out.println("la surface est de " + form.calculerSurface());
		System.out.println("le perimetre est de " + form.calculerPerimetre());
		
	}

}
