package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.WC;

public class TestMaison {

	public TestMaison() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantier maison
		Maison maison = new Maison();
		maison.ajoutPiece(new Chambre(25, 12));
		maison.ajoutPiece(new Cuisine(21, 78));
		maison.ajoutPiece(new WC(5,5));
		
		

		System.out.println("Superficie Total: " + maison.calculerSurface());
		System.out.println("Superficie de l'étage 0: " + maison.getSuperficieParEtage(0));
		System.out.println("Superficie de l'étage 1: " + maison.getSuperficieParEtage(1));
		System.out.println("Superficie des chambres: " + maison.getSuperficieTypePiece(Piece.TYPE_CHAMBRE));

	}

}
