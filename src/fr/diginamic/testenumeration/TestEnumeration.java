package fr.diginamic.testenumeration;

import javax.swing.Spring;

public class TestEnumeration {

	public TestEnumeration() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Utilisez une boucle pour affichez toutes les saisons.
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison);
			
			/**Soit la chaine de caractères suivante : String nom = « ETE » ;
			o Utilisez une méthode de base des énumérations pour retrouver et 
			afficher le libellé de l’instance de Saison dont le nom est ETE.**/
			String nomEte = "été";
			Saison ete = Saison.valueOfLibelle(nomEte);
			System.out.println(ete.getLibelle());
			
			//pareil hiver
			String nomHiver = "hiver";
			Saison hiver = Saison.valueOfLibelle(nomHiver);
			System.out.println(hiver.getLibelle());
			
		}

	}

}
